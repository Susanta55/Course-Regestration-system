package course.registration.system;

import java.io.*;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class Student {
    private int id;
    private String name;


    public Student(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public Student() {

    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


    public void viewinst() throws FileNotFoundException { // student views the instructor.

        File file3 = new File("Instructor.txt");
        Scanner scan = new Scanner(file3);
        while (scan.hasNext()) {
            System.out.println(scan.nextLine());
        }
    }

    public void enroll() throws IOException {
        ArrayList s = new ArrayList();
        Scanner obj = new Scanner(System.in);

        System.out.println("Enter  student Name: ");
        s.add(obj.next());

        System.out.println("Enter student id: ");
        s.add(obj.next());
        System.out.println("Enter the course to register: ");
        s.add(obj.next());
            File file = new File("courses.txt");
            Scanner scan = new Scanner(file);
            while (scan.hasNext()) {
                System.out.println(scan.nextLine());
            File file2 = new File("student.txt");
            file.createNewFile();
            FileWriter fileWriter = new FileWriter("student.txt", true);
            Iterator iterator = s.iterator();
            fileWriter.write((String) "\n");
            while (iterator.hasNext()) {
                fileWriter.write((String) iterator.next() + "\t");
            }
            fileWriter.close();
        }

    }
}

