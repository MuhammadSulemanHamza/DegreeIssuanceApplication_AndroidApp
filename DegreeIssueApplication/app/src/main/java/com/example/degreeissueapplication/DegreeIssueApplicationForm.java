package com.example.degreeissueapplication;

import java.io.Serializable;

public class DegreeIssueApplicationForm implements Serializable {
    String degree;
    String session;
    String rollNumber;
    String batch;
    String department;
    String candidateName;

    // Default Constructor
    public DegreeIssueApplicationForm()
    {
        degree = "BS Hons";
        session = "2017-2021";
        rollNumber = "17271519-032";
        batch = "2017";
        department = "CS";
        candidateName = "Muhammad Suleman Hamza";
    }

    // Constructor
    public DegreeIssueApplicationForm(String degree, String session, String rollNumber, String batch, String department, String candidateName) {
        this.degree = degree;
        this.session = session;
        this.rollNumber = rollNumber;
        this.batch = batch;
        this.department = department;
        this.candidateName = candidateName;
    }


    @Override
    public String toString() {
        return degree + " - " +
                batch + " - " +
                department;
    }
}
