package models;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

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

    @After
    public void tearDown() throws Exception {
    }

    public static Team setUpNewTeam() {
        return new Team();
    }




}