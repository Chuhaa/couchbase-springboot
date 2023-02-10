package com.example.couchbase.model;

import lombok.Data;

@Data
public class ExerciseTerms {
    public ExerciseProcedure exerciseProcedure;
    public OptionStyle optionStyle;
    public Strike strike;
}
