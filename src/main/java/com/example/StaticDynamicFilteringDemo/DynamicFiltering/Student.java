package com.example.StaticDynamicFilteringDemo.DynamicFiltering;

import com.fasterxml.jackson.annotation.JsonFilter;
import org.springframework.stereotype.Component;

@JsonFilter("empFilter")
@Component
public class Student
{
    private Long StudentId;
    private String address;
    private Integer salary;
    Student()
    {

    }

    public Student(Long studentId, String address, Integer salary) {
        StudentId = studentId;
        this.address = address;
        this.salary = salary;
    }

    public Long getStudentId() {
        return StudentId;
    }

    public void setStudentId(Long studentId) {
        StudentId = studentId;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public Integer getSalary() {
        return salary;
    }

    public void setSalary(Integer salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Student{" +
                "StudentId=" + StudentId +
                ", address='" + address + '\'' +
                ", salary=" + salary +
                '}';
    }
}
