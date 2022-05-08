package course.registration.system;

import java.io.*;
import java.util.Scanner;

public class module extends courses {
    private String name;
    private int mid;

    public module(String name, int mid) {
        this.name = name;
        this.mid = mid;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getMid() {
        return mid;
    }

    public void setMid(int mid)  {
        this.mid = mid;
    }
    public module() throws IOException { // writing modules to the files.
        System.out.println("Welcome to BIT");
        System.out.println("=============");
        File modules = new File("modules.txt");
        try {
            FileWriter fw = new FileWriter(modules);
            BufferedWriter bw = new BufferedWriter(fw);
            bw.write("Academic Skills and Team Based Learning\n");
            bw.write("Introductory Programming and Problem Solving\n");
            bw.write("Fundamentals of Computing\n");
            bw.write("Internet Software Architecture\n");
            bw.write("Computational Mathematics\n");
            bw.write("Concepts and Technologies of AI\n");
            bw.write("Object-Oriented Design and Programming\n");
            bw.write("Numerical Methods and Concurrency\n");
            bw.write("Distributed and Cloud System Programming\n");
            bw.write("Collaborative Development\n");
            bw.write("Human Computer Interaction\n");
            bw.write("Distributed and Cloud System Programming\n");
            bw.close();
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }
        System.out.println("From the file the modules are:");
        File file = new File("modules.txt");
           Scanner scan =new Scanner(file);
           while(scan.hasNext()) {
               System.out.println(scan.nextLine());
           }
       }
    }

