package com.sunglowsys.test;

import com.sunglowsys.domain.Address;
import com.sunglowsys.domain.Student;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Configuration;

@Configuration
public class TestStudent {

    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext();
        context.scan("com.sunglowsys.domain");
        context.refresh();

        Student student = context.getBean(Student.class);
        Address address = context.getBean(Address.class);
        address.setAddressLine1("Bhavan Nagar");
        address.setAddressLine2("Marehra");
        student.setFirstName("Gopal");
        student.setLastNAme("Kumar");
        System.out.println(student.getFirstName());
        System.out.println(student.getLastNAme());
        System.out.println(address.getAddressLine1());
        System.out.println(address.getAddressLine2());
        System.out.println(student.hashCode());

        Student student1 = context.getBean(Student.class);
        student1.setFirstName("Govind");
        student1.setLastNAme("Kumar");
        System.out.println(student1.getFirstName());
        System.out.println(student1.getLastNAme());
        System.out.println(student1.hashCode());
    }
}
