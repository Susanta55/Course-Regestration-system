package course.registration.system;


import java.io.*;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class Administrator extends courses implements AdminInterface{
    private int aid;
    private String aname;

    public Administrator() {
        super();
        this.aid = aid;
        this.aname = aname;
    }

    public int getAid() {
        return aid;
    }

    public void setAid(int aid) {
        this.aid = aid;
    }

    public String getAname() {
        return aname;
    }

    public void setAname(String aname) {
        aname = aname;
    }

    @Override
    public void addcourses() throws IOException { //adding courses to the file.
        ArrayList c = new ArrayList();
        Scanner obj = new Scanner(System.in);

        System.out.println("Enter  course Name: ");
        c.add(obj.next());

        System.out.println("Enter course id: ");
        c.add(obj.next());
        File file = new File("courses.txt");
        file.createNewFile();
        FileWriter fileWriter = new FileWriter("courses.txt", true);
        Iterator iterator = c.iterator();
        fileWriter.write((String) "\n");
        while (iterator.hasNext()) {
            fileWriter.write((String) iterator.next() + "\t");
        }
        fileWriter.close();
    }


    @Override
    public void deletecourses() throws IOException { // deleting course from the file.
        ArrayList arrayList=new ArrayList();
        try{
            FileReader fileReader = new FileReader("courses.txt");
            Scanner scanner = new Scanner(fileReader);

            while(scanner.hasNext()){
                arrayList.add(scanner.nextLine());

            }

            System.out.println("Enter the  Course that you want to Delete");
            Scanner scanner1 = new Scanner(System.in);
            FileWriter fileWriter = new FileWriter("courses.txt");
            Iterator iterator = arrayList.iterator();
            while (iterator.hasNext()){
                String string = (String)iterator.next();
                String[] S1 = string.split("\t");
                System.out.println(S1[0]);
            }
            String s= scanner1.next();
            int r;
            for( r=0;r<arrayList.size();r++){
                String s1 = (String)arrayList.get(r);
                String[] s2=s1.split("\t");
                if(!s.equals(s2[0])){
                    fileWriter.write(s1+"\n");
                }

            }
            fileWriter.close();
        }
        catch(IOException e){
            System.out.println("error");
            e.printStackTrace();
        }

    }

    @Override
    public void addmodule() throws IOException { // add module to the course.
        module m =new module();
        ArrayList c = new ArrayList();
        Scanner obj = new Scanner(System.in);

        System.out.println("Enter  module Name: ");
        c.add(obj.next());

        File file = new File("modules.txt");
        file.createNewFile();
        FileWriter fileWriter = new FileWriter("modules.txt", true);
        Iterator iterator = c.iterator();
        fileWriter.write((String) "\n");
        while (iterator.hasNext()) {
            fileWriter.write((String) iterator.next() + "\t");
        }
        fileWriter.close();
    }

    @Override
    public void update() throws IOException{ // update the course in the file
        ArrayList arrayList=new ArrayList();
        try{
            FileReader fileReader = new FileReader("courses.txt");
            Scanner scanner = new Scanner(fileReader);

            while(scanner.hasNext()){
                arrayList.add(scanner.nextLine());

            }
            System.out.println("=======================================");
            System.out.println("Enter the  Course that you want to update");
            System.out.println("=======================================");
            Scanner scanner1 = new Scanner(System.in);
            FileWriter fileWriter = new FileWriter("courses.txt");
            Iterator iterator = arrayList.iterator();
            while (iterator.hasNext()){
                String string = (String)iterator.next();
                String[] S1 = string.split("\t");
                System.out.println(S1[0]);
            }
            String s= scanner1.next();
            int r;
            for( r=0;r<arrayList.size();r++){
                String s1 = (String)arrayList.get(r);
                String[] s2=s1.split("\t");
                if(!s.equals(s2[0])){
                    fileWriter.write(s1+"\n");
                }

            }
            fileWriter.close();
        }
        catch(IOException e){
            System.out.println("error");
            e.printStackTrace();
        }
        ArrayList c = new ArrayList();
        Scanner obj = new Scanner(System.in);

        System.out.println("Enter the new course Name: ");
        c.add(obj.next());
        System.out.println("Enter course id: ");
        c.add(obj.next());
        File file = new File("courses.txt");
        file.createNewFile();
        FileWriter fileWriter = new FileWriter("courses.txt", true);
        Iterator iterator = c.iterator();
        fileWriter.write((String) "\n");
        while (iterator.hasNext()) {
            fileWriter.write((String) iterator.next() + "\t");
        }
        fileWriter.close();
    }


    @Override
    public void cancelcourse() throws IOException { // A certain course is cancelled or currently unavailable.
        File file = new File("courses.txt");
        Scanner obj = new Scanner(System.in);
        Scanner scan = new Scanner(file);
        while (scan.hasNext()) {
            System.out.println(scan.nextLine());
        }

         System.out.println("sorry! the course HM the has been cancelled");


    }

    @Override
    public void Assigninst() throws IOException { // Assign instructor to the modules.
        ArrayList std = new ArrayList();
        Scanner obj = new Scanner(System.in);

        System.out.println("Enter  Instructor Name: ");
        std.add(obj.next());

        System.out.println("Enter  Instructor Module: ");
        std.add(obj.next());
        File file = new File("Instructor.txt");
        try {
            file.createNewFile();
        } catch (IOException e) {
            e.printStackTrace();
        }
        FileWriter fileWriter = null;
        try {
            fileWriter = new FileWriter("Instructor.txt", true);
        } catch (IOException e) {
            e.printStackTrace();
        }
        Iterator iterator = std.iterator();
        try {
            fileWriter.write((String) "\n");
        } catch (IOException e) {
            e.printStackTrace();
        }
        while (iterator.hasNext()) {
            try {
                fileWriter.write((String) iterator.next() + "\t");
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        try {
            fileWriter.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void addMarks() throws IOException{ // adding marks to generate report card.
        Scanner sc = new Scanner(System.in);
        ArrayList a1 = new ArrayList();
            System.out.println("Enter the marks the student for modules");
            String mod = sc.next();
            File f = new File(mod + ".txt");
            FileReader fr = new FileReader("student.txt");

            Scanner scfr = new Scanner(fr);
            while (scfr.hasNext()) {
                String s1 = scfr.nextLine();
                System.out.println(s1);
                String s = sc.next();
                a1.add(s + "\t" + s1);
            }
            System.out.println(a1);
            FileWriter fw = new FileWriter("f");
            Iterator itr = a1.iterator();
            while (itr.hasNext()) {
                fw.write(itr.next() + "\n");
            }
            fw.close();
            FileReader fr1 = new FileReader("Fundamentals of Computing.txt");
            FileReader fr2 = new FileReader("Big Data.txt");
            Scanner sc1 = new Scanner(fr1);
            Scanner sc2 = new Scanner(fr2);

            System.out.println("marks sheet");
            while(sc1.hasNext()) {
                System.out.println("student name");
                System.out.println(sc1.nextLine());
                String[] s1= sc1.next().split("\t");
                String[] s2 = sc2.next().split("\t");
                System.out.println(s1[0]);

                System.out.println("\t"+s1[1]);
                System.out.println("\t"+s2[1]);


            }
        }



}
