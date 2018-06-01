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
        Team team = new Team();
        assertEquals(true, team instanceof Team);
    }

    @After
    public void tearDown() throws Exception {
    }
}