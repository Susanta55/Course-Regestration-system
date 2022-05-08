package course.registration.system;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class Instructor {
    private int id;
    private String name;


    public Instructor(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public Instructor() {

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


    public void viewmodules() throws IOException { // view the modules from the file.
        module m = new module();
        System.out.println("=================================");
        System.out.println("Instructors are allowed to choose any 4 modules from below:");
        System.out.println("=================================");
        File file = new File("modules.txt");
        Scanner scan = null;
        try {
            scan = new Scanner(file);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        while (scan.hasNext()) {
            System.out.println(scan.nextLine());

        }
    }
     public void viewinst() throws FileNotFoundException {// instructor views the student

        File file3 = new File("student.txt");
        Scanner scan = new Scanner(file3);
        while (scan.hasNext()) {
            System.out.println(scan.nextLine());
        }
    }

}
