package io.zipcoder.interfaces;

import io.zipcoder.interfaces.*;
import org.junit.Assert;
import org.junit.Test;

public class TestInstructor {

    @Test
    public void testImplementation () {

        Instructor instructor1 = new Instructor(122131301, "Cole");
        Assert.assertTrue(instructor1 instanceof ITeacher);

    }

    @Test
    public void testInheritance(){
        Person instructor2 = new Person(2133332, "Jay");
        Assert.assertTrue(instructor2 instanceof Person);

    }

    @Test
    public void testTeach(){
        Instructor instructor = new Instructor(394940290, "Barbie");
        Student student = new Student(392399, "Ken");
        instructor.teach(student, 19);
        double actual = student.getTotalStudyTime();
        double expected = 19.0;
        //then
        Assert.assertEquals(expected, actual,0.1);


    }
    @Test
    public void testLecture(){
        ILearner [] learners = new ILearner[5];
        for(int x = 0; x < learners.length; x++){
            learners[x] = new Student(x,"Joe");
        }
        Instructor instructor =new Instructor(103913910, "Kim");
        instructor.lecture(learners, 13);
        double actual = learners[4].getTotalStudyTime();
        double expected = 2.6;
        Assert.assertEquals(expected, actual,0.1 );

    }
}
