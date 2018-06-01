package models;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.*;

public class TeamTest {

    @Before
    public void setUp() throws Exception {
    }

    @Test
    public void teamClassInstantiatesCorrectly_isTrue() throws Exception {
        Team testTeam = new Team();
        assertEquals(true, testTeam instanceof Team);
    }

    @Test
    public void teamClassInstantiatesCorrectly_withTeamName() throws Exception {
        Team testTeam = setUpNewTeam();
        assertEquals("", testTeam.getTeamName());
    }

    @Test
    public void teamClassInstantiatesCorrectly_withDescription() throws Exception {
        Team testTeam = setUpNewTeam();
        assertEquals("", testTeam.getTeamDescription());
    }

    @Test
    public void teamClassInstantiatesCorrectly_withTeamMembersList() throws Exception {
        Team testTeam = setUpNewTeam();
        ArrayList<String> expected = new ArrayList<>();
        assertEquals(expected, testTeam.getTeamMembers());
    }

    @Test
    public void setTeamName_userCanSetTeamName_isTest() throws Exception {
        Team testTeam = setUpNewTeam();
        testTeam.setTeamName("test");
        assertEquals("test", testTeam.getTeamName());
    }

    @Test
    public void setTeamDescription_userCanSetTeamDescription_isTest() throws Exception {
        Team testTeam = setUpNewTeam();
        testTeam.setTeamDescription("test");
        assertEquals("test", testTeam.getTeamDescription());
    }

    @Test
    public void setTeamMembers_userCanAddTeamMembers_is1() throws Exception {
        Team testTeam = setUpNewTeam();
        testTeam.setTeamMembers("jeff");
        ArrayList<String> testTeamMemberSize = testTeam.getTeamMembers();
        assertEquals(1, testTeamMemberSize.size());
    }

    @Test
    public void setTeamMembers_userCanAddTeamMembers_is2() throws Exception {
        Team testTeam = setUpNewTeam();
        testTeam.setTeamMembers("jeff");
        testTeam.setTeamMembers("devin");
        ArrayList<String> testTeamMemberSize = testTeam.getTeamMembers();
        assertEquals(2, testTeamMemberSize.size());
    }

    @Test
    public void getAll_returnsAllInstancesOfTeamClass_true() {
        Team testTeam = setUpNewTeam();
        Team otherTestTeam = new Team();
        assertEquals(true, Team.getAll().contains(testTeam));
        assertEquals(true, Team.getAll().contains(otherTestTeam));
        assertEquals(2, Team.getAll().size());
    }

    @After
    public void tearDown() throws Exception {
    }

    public static Team setUpNewTeam() {
        return new Team();
    }




}