package course.registration.system;

import java.io.IOException;
import java.util.Scanner;

public class main {
    public static void main(String[] args) throws IOException {
        //login into the system.
        Scanner input = new Scanner(System.in);
        String userName, password;
        System.out.println("Login into the system.");
        System.out.println("====================");
        System.out.println("Enter your username:");
        userName = input.nextLine();
        System.out.println("Enter your password:");
        password = input.nextLine();
        if (userName.equals("Susan") || password.equals("apple")) {
            System.out.println("Login successful");
        } else {
            System.out.println("Invalid Login");
        }

            System.out.println("Welcome to the Course Registration System.");
            System.out.println("Please enter an 'a' for admin or a 's' for student or 'i' for Instructor .");
            String s = input.nextLine();

            if (s.equals("a")) {
                Administrator admin = new Administrator();
                System.out.println("1.ADD COURSE \n2.DELETE COURSE \n3.CANCEL COURSE \n4. Add module\n5.Add marks \n6 update \n7.Assign inst\n8.EXIT");

                Scanner sc = new Scanner(System.in);
                int ch = sc.nextInt();

                switch (ch) {
                    case 1:
                        admin.addcourses();
                        break;

                    case 2:
                        admin.deletecourses();
                        break;

                    case 3:
                        admin.cancelcourse();
                        break;

                    case 4:
                        admin.addmodule();
                        break;
                    case 5:
                        admin.addMarks();
                        break;
                    case 6:
                        admin.update();
                        break;
                    case 7:
                        admin.Assigninst();
                        break;
                    case 8:
                        System.out.println("\n EXIT  \n");
                        return;

                    default:
                        System.out.println("\n INVALID OPTION \n");
                }


            }
            if (s.equals("s")) {
                Student stu = new Student();
                System.out.println("1.View instructor \n2.Enroll \n3.EXIT");
                Scanner sc = new Scanner(System.in);
                int ch = sc.nextInt();

                switch (ch) {
                    case 1:
                        stu.viewinst();
                        break;

                    case 2:
                        stu.enroll();
                        break;

                    case 3:
                        System.out.println("\n EXIT  \n");
                        return;
                }
            }
            if (s.equals("i")) {
                Instructor I = new Instructor();
                System.out.println("1.view modules \n2.view students \n3.EXIT");
                Scanner sc = new Scanner(System.in);
                int ch = sc.nextInt();

                switch (ch) {

                    case 1:
                        I.viewmodules();
                        break;
                    case 2:
                        I.viewinst();
                    case 3:
                        System.out.println("\n EXIT  \n");
                        return;
                }
            }
            }
        }

