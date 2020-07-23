package org.launchcode.techjobs_oo.Tests;

import org.junit.Before;
import org.junit.Test;
import org.junit.experimental.theories.suppliers.TestedOn;
import org.launchcode.techjobs_oo.*;

import static org.junit.Assert.*;

public class JobTest {
    Job test_job;
    Job test_jobTwo;
    Job test_jobThree;
    Job test_jobFour;
    @Before
    public void createJobObject() {

        test_job = new Job("Name", new Employer("launchCode"), new Location("saint louis"), new PositionType("positionType"), new CoreCompetency("coreCompetency"));
        test_jobTwo = new Job("Name", new Employer("launchCode"), new Location("saint louis"), new PositionType("positionType"), new CoreCompetency("coreCompetency"));
        test_jobThree = new Job("Product tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));
        test_jobFour = new Job(null, null, null, null, null);
    }


    @Test
    public void testSettingJobId() {
        assertTrue(test_job != test_jobTwo);
        assertEquals(1, test_job.getId());
        assertEquals(2, test_jobTwo.getId());
    }

    @Test
    public void testJobConstructorSetsAllFields() {
        assertEquals(3, test_jobThree.getId());
        assertEquals("Product tester", test_jobThree.getName());
        assertTrue(test_jobThree.getName() instanceof String);
        assertTrue(test_jobThree.getEmployer() instanceof Employer);
        assertEquals("ACME", test_jobThree.getEmployer().getValue());
        assertTrue(test_jobThree.getLocation() instanceof Location);
        assertEquals("Desert", test_jobThree.getLocation().getValue());
        assertTrue(test_jobThree.getPositionType() instanceof PositionType);
        assertEquals("Quality control", test_jobThree.getPositionType().getValue());
        assertTrue(test_jobThree.getCoreCompetency() instanceof CoreCompetency);
        assertEquals("Persistence", test_jobThree.getCoreCompetency().getValue());
    }

    @Test
    public void testJobsForEquality() {
        assertFalse(test_job.equals(test_jobTwo));
    }

    @Test
    public void firstTestToString() {

//        assertEquals(test_job.toString(), "Goodbye");
        assertTrue(test_job.toString().contains(" "));
        assertTrue(test_job.toString().endsWith(" "));
    }

    @Test
    public void secondTestToString() {
        assertTrue(test_job.toString().contains(System.lineSeparator()));
        assertTrue(test_job.toString().contains("ID"));
        assertTrue(test_job.toString().contains("Name"));
        assertTrue(test_job.toString().contains("Employer"));
        assertTrue(test_job.toString().contains("Location"));
        assertTrue(test_job.toString().contains("Position Type"));
        assertTrue(test_job.toString().contains("Core Competency"));
    }

    @Test
    public void thirdTestToString() {
        assertTrue(test_jobFour.toString().contains("Data not available"));
        }

}
