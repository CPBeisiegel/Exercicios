
package com.example.androidroomproject.model;

import com.google.gson.annotations.Expose;

import java.util.List;


public class Esporte {

    @Expose
    private List<Sport> sports;

    public List<Sport> getSports() {
        return sports;
    }

    public void setSports(List<Sport> sports) {
        this.sports = sports;
    }

}
