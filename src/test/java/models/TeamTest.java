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
        Team testTeam = new Team("name");
        assertEquals(true, testTeam instanceof Team);
    }

    @Test
    public void teamClassInstantiatesCorrectly_withTeamName() throws Exception {
        String teamName = "name";
        Team testTeam = setUpNewTeam(teamName);
        assertEquals("name", testTeam.getTeamName(teamName));
    }



    @After
    public void tearDown() throws Exception {
    }

    public static Team setUpNewTeam(String userInput) {
        return new Team(userInput);
    }




}