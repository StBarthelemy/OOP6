package Controller;

import java.util.List;
import java.util.Scanner;

import Service.ServiceData;
import Viev.StudentViev;
import Viev.TeacherViev;
import model.Student;
import model.Teacher;
import model.Type;
import model.User;

public class Controller {
    private final ServiceData serviceData = new ServiceData();
    private final StudentViev studentViev = new StudentViev();
    private final TeacherViev teacherViev = new TeacherViev();

    public void createStudent(String firstName, String secondName, String lastName) {
        serviceData.create(firstName, secondName, lastName, Type.STUDENT);
    }

    public void getAllStudent() {
        for (User user : serviceData.getAllConcreatUsers(Type.STUDENT)) {
            studentViev.printConsole((Student) user);
        }
    }

    public void createTeacher(String firstName, String secondName, String lastName) {
        serviceData.create(firstName, secondName, lastName, Type.TEACHER);
    }

    public void getAllTeacher() {
        for (User user : serviceData.getAllConcreatUsers(Type.TEACHER)) {
            teacherViev.printConsole((Teacher) user);
        }
    }

}
