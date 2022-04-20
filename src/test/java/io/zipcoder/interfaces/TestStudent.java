package io.zipcoder.interfaces;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.assertTrue;


public class TestStudent {
    @Test
    public void testImplementation(){
        //given
        Student student1 = new Student (1010112, "Ben");
        assertTrue("", student1 instanceof ILearner );

        }

        @Test
    public void testInheritance (){
            Person student1 = new Person (21020830, "Jim");
            //Students student1 = new Students();

            assertTrue("", student1 instanceof Person );

        }

        @Test
    public void testLearn(){
        Student student3 = new Student(2103013, "Greg");
        student3.learn(18);

        }

    }

