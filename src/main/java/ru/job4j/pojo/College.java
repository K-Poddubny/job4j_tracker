package ru.job4j.pojo;

import java.time.LocalDate;

public class College {
    public static void main(String[] args) {
        Student student = new Student();
        student.setName("Konstantin Poddubny");
        student.setNoGroup(164);
        student.setDateEntrance("09.03.2022");

        System.out.println("Студент " + student.getName() + " обучается в группе N - " + student.getNoGroup() + ". " + "Начало обучения : " + student.getDateEntrance());
    }
}
