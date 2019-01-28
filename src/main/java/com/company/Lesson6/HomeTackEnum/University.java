package com.company.Lesson6.HomeTackEnum;

import java.util.List;

import static java.util.Arrays.asList;

public enum University {

    VNTU(asList(Faculty.values()), asList(Course.values()),asList(Group.values())),
    DNU(asList(Faculty.FMT, Faculty.FETE), asList(Course.FIRST),asList(Group.KI)),
    KPI(asList(Faculty.FMT, Faculty.FITKI), asList(Course.FIRST),asList(Group.KI));


    private List<Faculty> faculties;
    private List<Course> courses;
    private List<Group> groups;


    University(List<Faculty> faculties, List<Course> courses, List<Group> groups) {
        this.faculties = faculties;
        this.courses = courses;
        this.groups = groups;
    }

    public List<Course> getCourses() {
        return courses;
    }

    public List<Group> getGroups() {
        return groups;
    }

    public List<Faculty> getFaculties() {
        return faculties;
    }
}
