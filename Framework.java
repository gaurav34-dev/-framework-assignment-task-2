package com.example;

public class Framework {

    private PythonLanguage pythonLanguage;

    public Framework(PythonLanguage pythonLanguage) {
        this.pythonLanguage = pythonLanguage;
    }

    public void showOutput() {
        System.out.println(pythonLanguage.learningPython());
    }
}
