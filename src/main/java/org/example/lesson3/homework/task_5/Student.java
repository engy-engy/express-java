package org.example.lesson3.homework.task_5;

/**
 * Student, который будет представлять студента.
 */
public class Student implements Cloneable{

    private String name;
    private int id;
    private double gpa;

    public Student(){}

    public Student(String name, int id, double gpa){
        this.name = name;
        this.id = id;
        this.gpa = gpa;
    }

    @Override
    public boolean equals(Object obj) {

        if (this == obj) return true;

        if (obj == null || getClass() != obj.getClass()) return false;

        Student student = (Student) obj;

        return id == student.id;
    }

    @Override
    public String toString() {
        return String.format("Student{id=%d, name='%s', gpa=%.2f}", id, name, gpa);
    }

    @Override
    public int hashCode() {
        return 31 * id;
    }

    @Override
    public Student clone() {
        try {
            return (Student) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new  RuntimeException("Ошибка при клонировании объекта", e);
        }
    }

}
