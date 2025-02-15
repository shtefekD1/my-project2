package pl.coderslab.JavaExercisesDayTwoObjectOrientPrograming.Methods;

public class Person {
    private String name = "";
    private String surname = "";
    public int age = 0;

    public void setName(String name) {
        this.name = name;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setGender(String gender) {
    }

    public String getFullName() {
        return name + " " + surname;
    }

    public void increaseAge() {
        this.age++;
    }
}