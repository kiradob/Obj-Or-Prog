package homework5.controller;


import homework5.model.Student;
import homework5.service.user.UserService;

import java.util.List;

public class StudentController implements UserController<Student> {

    public UserService<Student> studentService;

    public StudentController(UserService<Student> studentService) {
        this.studentService = studentService;
    }

    @Override
    public void create(String fullName, Integer age, String phoneNumber) {
        studentService.create(fullName, age, phoneNumber);
    }

    @Override
    public void createRandom(Integer quantity) {
        studentService.createRandom(quantity);
    }

    @Override
    public List<Student> getAllUsersSortedByFirstName() {
        return studentService.getAllUsersSortedByFirstName();
    }

    @Override
    public List<Student> getAllUsersSortedByLastName() {
        return studentService.getAllUsersSortedByLastName();
    }

    @Override
    public List<Student> getAllUsersSortedByAge() {
        return studentService.getAllUsersSortedByAge();
    }

    @Override
    public List<Student> getAllUsersSortedById() {
        return studentService.getAllUsersSortedById();
    }

    @Override
    public boolean remove(String fullName) {
        studentService.remove(fullName);
        return true;
    }

    @Override
    public List<Student> getAll() {
        return studentService.getAll();
    }

    @Override
    public void edit(String fullName, Integer age, String phoneNumber) {
        studentService.edit(fullName, age, phoneNumber);
    }


}