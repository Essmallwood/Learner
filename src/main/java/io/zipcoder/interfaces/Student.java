package io.zipcoder.interfaces;

import io.zipcoder.interfaces.ILearner;
import io.zipcoder.interfaces.Person;

    public class  Student extends Person implements ILearner {

        private double totalStudyTime;

        public Student(long id, String name) {
            super(id, name);
        }

        public void learn(double numberofHours) {

            totalStudyTime = totalStudyTime + numberofHours;
        }

        public double getTotalStudyTime() {
            return totalStudyTime;
        }

        public void setTotalStudyTime(double totalStudyTime) {
            this.totalStudyTime = totalStudyTime;
        }
    }

