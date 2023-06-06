package com.example;

public class PythonWorld implements PythonLanguage {

    private JavaLanguage javaLanguage;

    public PythonWorld(JavaLanguage javaLanguage) {
        this.javaLanguage = javaLanguage;
    }

    @Override
    public String learningPython() {
        return "I am learning python";
    }
}
