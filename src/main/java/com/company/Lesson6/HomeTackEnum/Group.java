package com.company.Lesson6.HomeTackEnum;

import java.util.ArrayList;

public enum Group {

    KN("KN"),
    PI("PI"),
    KI("KI"),
    BS("BS");

    private final String groupName;
    private final ArrayList<String> strings = new ArrayList<>();

    Group(String groupName) {

        this.groupName = groupName;
    }

    public String getGroupName() {
        return groupName;
    }

    @Override
    public String toString() {
        return groupName;
    }
}
