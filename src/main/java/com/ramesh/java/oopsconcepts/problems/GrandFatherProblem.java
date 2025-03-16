package com.ramesh.java.oopsconcepts.problems;

class GrandFather {
    String grandFatherName;
    GrandFather(String grandFatherName) {
        this.grandFatherName = grandFatherName;
    }
}

class Father extends GrandFather{
    String fatherName;
    Father(String fatherName, String grandFatherName) {
        super(grandFatherName);
        this.fatherName = fatherName;
    }
}

class Son extends Father{
    String sonName;
    Son(String sonName, String fatherName, String grandFatherName) {
        super(fatherName, grandFatherName);
        this.sonName = sonName;
    }

    void printName() {
        System.out.print(this.grandFatherName + " father of ");
        System.out.print(this.fatherName + " father of ");
        System.out.println(this.sonName);
    }
}

public class GrandFatherProblem {
    public static void main(String[] args) {
        Son son1 = new Son("Akash", "Mukesh", "Dhirubhai");

        son1.printName();
    }
}
