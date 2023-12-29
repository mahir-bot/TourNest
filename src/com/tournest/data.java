package com.tournest;

import java.util.HashMap;
import java.util.Scanner;

public class data {
    Scanner sc = new Scanner(System.in);
    HashMap<Integer, signup> m = new HashMap<Integer, signup>();
    editProfile_Choice epc = new editProfile_Choice();
    String a, b, c, d, e, f, g;
    String cunm, cpss;
    int incr = 1;
    int instant;
    String xx, yy;

    void askinfo() {
        System.out.print("\n\n\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t#############################################################");
        System.out.print("\n\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t##########                 SIGN UP                 ##########");
        System.out.print("\n\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t#############################################################\n");

        System.out.print("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t  Enter First Name: ");
        a = sc.nextLine();

        System.out.print("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t  Enter Last Name: ");
        b = sc.nextLine();

        System.out.print("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t  Enter User Name: ");
        c = sc.nextLine();

        System.out.print("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t  Enter Phone Number: ");
        d = sc.nextLine();

        System.out.print("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t  Enter Address: ");
        e = sc.nextLine();

        System.out.print("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t  Enter Email: ");
        f = sc.nextLine();

        System.out.print("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t  Enter Password: ");
        g = sc.nextLine();
        System.out.println();
        m.put(incr, new signup(a, b, c, d, e, f, g, incr));
        instant = incr;
        incr++;

    }

    // ***************************************************************************************************************************************************//

    void showprofile() {

        System.out.print("\n\n\n\n\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t           *************************************\n");
        System.out.print("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t           ************             ************\n");
        System.out.print("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t           ***********     PROFILE    **********\n");
        System.out.print("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t           ************             ************\n");
        System.out.print("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t           *************************************\n");

        for (signup kkk : m.values()) {

            if (kkk.key == instant) {
                System.out.print("\t\t\t\t\t\t\t\t\t\t\t    Name: " + kkk.first_name + " " + kkk.last_name);
                System.out.print("\n\n\t\t\t\t\t\t\t\t\t\t\t\t    Username: " + kkk.username);
                System.out.print("\n\n\t\t\t\t\t\t\t\t\t\t\t\t    Phone: " + kkk.phone_);
                System.out.print("\n\n\t\t\t\t\t\t\t\t\t\t\t\t    Address: " + kkk.address_);
                break;

            }
        }
    }

    // *************************************************************************************************************************************************//

    void editprof() {

        System.out.print("\n\n\n\n\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t           *************************************\n");
        System.out.print("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t           ************             ************\n");
        System.out.print("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t           ***********  EDIT PROFILE  **********\n");
        System.out.print("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t           ************             ************\n");
        System.out.print("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t           *************************************\n");

        while (true) {
            epc.editProfile_hoice();
            String ab = sc.nextLine();

            if (ab.equals("1")) {
                System.out.print("Enter First name: ");
                String nam = sc.nextLine();
                for (signup kkk : m.values()) {

                    if (kkk.key == instant) {
                        kkk.first_name = nam;
                        break;

                    }
                }
            } else if (ab.equals("2")) {
                System.out.print("Enter Last name: ");
                String nam = sc.nextLine();
                for (signup kkk : m.values()) {

                    if (kkk.key == instant) {
                        kkk.last_name = nam;
                        break;

                    }
                }
            } else if (ab.equals("3")) {
                System.out.print("Enter User name: ");
                String nam = sc.nextLine();
                for (signup kkk : m.values()) {

                    if (kkk.key == instant) {
                        kkk.username = nam;
                        break;

                    }
                }
            } else if (ab.equals("4")) {
                System.out.print("Enter Phone: ");
                String nam = sc.nextLine();
                for (signup kkk : m.values()) {

                    if (kkk.key == instant) {
                        kkk.phone_ = nam;
                        break;

                    }
                }
            } else if (ab.equals("5")) {
                System.out.print("Enter Address: ");
                String nam = sc.nextLine();
                for (signup kkk : m.values()) {

                    if (kkk.key == instant) {
                        kkk.address_ = nam;
                        break;

                    }
                }
            } else if (ab.equals("6")) {
                System.out.print("Enter E-mail: ");
                String nam = sc.nextLine();
                for (signup kkk : m.values()) {

                    if (kkk.key == instant) {
                        kkk.user_name = nam;
                        break;

                    }
                }
            } else if (ab.equals("7")) {
                System.out.print("Enter Password: ");
                String nam = sc.nextLine();
                for (signup kkk : m.values()) {

                    if (kkk.key == instant) {
                        kkk.user_pass = nam;
                        break;

                    }
                }
            } else {
                break;
            }
        }

    }

    // *************************************************************************************************************************************************//

    void delete() {
        m.remove(instant);
    }

    // *************************************************************************************************************************************************//

    void support() {
        System.out.print("\n\n\n\n\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t           *************************************\n");
        System.out.print("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t           ************** Support **************\n");
        System.out.print("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t           **************    &    **************\n");
        System.out.print("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t           **************   FAQ   **************\n");
        System.out.print("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t           *************************************\n");

        System.out.print("\n\n\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t                      Team TourNest");
        System.out.print("\n\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t           Any Problem Feel Free To Contact US");
        System.out.print("\n\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t                Email: tournest@gmail.com");
    }

    // *************************************************************************************************************************************************//

    int login() {
        int val = 0;
        for (signup ku : m.values()) {

            if (ku.user_name.equals(cunm) && ku.user_pass.equals(cpss)) {
                val = 1;
                instant = ku.key;

                break;
            }

        }
        return val;
    }

    static void maincaller() {
        welcome.main(null);
    }

    void log_in() {
        while (true) {
            System.out.print("\n\n\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t#############################################################");
            System.out.print("\n\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t##########                 SIGN IN                 ##########");
            System.out.print("\n\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t#############################################################\n");

            System.out.print("\n\n\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t           User_name: ");
            cunm = sc.nextLine();
            System.out.print("\n\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t           Password: ");
            cpss = sc.nextLine();
            int val = login();

            if (val == 1) {
                break;
            } else

            {
                System.out.print("\n\n\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t            WRONG UserName OR PASSWORD");
                System.out.print("\n\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t         WOULD YOU LIKE TO TRY AGAIN???");
                System.out.print("\n\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t                1. YES    2. NO");
                System.out.print("\n\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t            => ");
                String v = sc.nextLine();

                if (v.equals("0")) {
                    maincaller();
                } else {
                    continue;
                }
            }
        }
    }

    // *************************************************************************************************************************************************************//

}

