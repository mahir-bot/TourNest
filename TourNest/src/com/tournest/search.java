package com.tournest;

//import org.w3c.dom.ls.LSOutput;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Vector;

public class search extends data {

    static String chosen_veh = null;
    static String chosen_hotel = null;
    static int total_cost = 0;

    data d = new data();
    int kk = d.instant;
    Vector<String> htl = new Vector<String>();
    Map<Integer, chosen_data> mp = new HashMap<Integer, chosen_data>();
    String str;
    Scanner sc = new Scanner(System.in);

    void ask_ques() {
        System.out.print("\n\n\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t         =======================");
        System.out.print("\n\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t         ||      PLACE     ||");
        System.out.print("\n\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t      =======================");

        System.out.print("\n\n\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t       Where Would You Like To Go?\n\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t       => ");
        str = sc.nextLine();
    }

    void hotel() {

        System.out.print("\n\n\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t         =======================");
        System.out.print("\n\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t         ||      HOTEL     ||");
        System.out.print("\n\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t      =======================");

        StringBuilder ssb = new StringBuilder(str);
        htl.clear();
        for (int i = 1; i < str.length(); i++) {
            System.out.print("\n\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t         " + i + ". " + str + " Hotel\n");
            htl.add(str);
            char temp = str.charAt(i - 1);
            char temp2 = str.charAt(i);
            ssb.setCharAt(i - 1, temp2);
            ssb.setCharAt(i, temp);
            str = ssb.toString();
        }

        int aaaa = str.length();
        System.out.print("\n\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t         " + aaaa + ". NONE Hotel\n");
        System.out.print(
                "\n\n\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t  Which Hotel Would You Like To Choose?\n\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t  => ");
        String shh = sc.nextLine();
        int sh = Integer.parseInt(shh);

        if (sh == aaaa) {
            htl.add("NONE");
            chosen_hotel = "NONE";
            // strcpy(shh,"NONE");
            System.out.println("\n\n\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t         You Choose " + htl.elementAt(sh) + " Hotel");

        } else {
            chosen_hotel = htl.elementAt(sh - 1);

            System.out.println("\n\n\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t " + htl.elementAt(sh - 1) + "Hotel, Is An Excellent Choice ^-^.");
        }
    }

    void transportation() {
        System.out.print("\n\n\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t         ==============================");
        System.out.print("\n\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t         ||     TRANSPORTATION    ||");
        System.out.print("\n\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t      ==============================");

        System.out.print("\n\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t  What Type Of Transportation Would You Like To Choose??");
        System.out.print("\n\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t     1. Bus");
        System.out.print("\n\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t     2. Private Car");
        System.out.print("\n\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t     3. Bike");
        System.out.print("\n\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t     4. Plane");
        System.out.print("\n\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t     5. Boat Or Launch");
        System.out.print("\n\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t     6. None");
        System.out.print("\n\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t     Choose = ");
        String veh = sc.nextLine();

        /// save the vehicle choice
        if (veh.equals("1")) {
            chosen_veh = "Bus";
            System.out.print("\n\n\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t         You Want To Go Via Bus");
        }
        if (veh.equals("2")) {
            chosen_veh = "Private Car";
            System.out.print("\n\n\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t         You Want To Go Via Private Car");

        }
        if (veh.equals("3")) {
            chosen_veh = "Bike";
            System.out.print("\n\\n\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t         You Want To Go Via Bike");
        }
        if (veh.equals("4")) {
            chosen_veh = "Plane";
            System.out.print("\n\n\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t          You Want To Go Via Plane");
        }
        if (veh.equals("5")) {
            chosen_veh = "Boat Or Launch";
            System.out.print("\n\n\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t         You Want To Go Via Boat Or Launch");
        }
        if (veh.equals("1") && veh.equals("2") && veh.equals("3") && veh.equals("4") && veh.equals("5")) {
            chosen_veh = "NONE";
            System.out.print("\n\n\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t         You Choose NONE Of The Transportation Way");
        }

    }

    @SuppressWarnings("unused")
    void payment_option() {

        total_cost = (chosen_veh.length() * 100) + (chosen_hotel.length() * 105);

        System.out.print("\n\n\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t         ==============================");
        System.out.print("\n\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t           ||      PAYMENT      ||");
        System.out.print("\n\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t      ============================");

        System.out.print("\n\n\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t     Your Total Cost For Trip: " + total_cost + " Tk.");
        System.out.print("\n\n\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t     How Would You Like To Pay The Bill?");
        System.out.print("\n\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t           Choose Your Method To Pay:");
        System.out.print("\n\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t               1. Mobile Banking");
        System.out.print("\n\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t               2. Card");
        System.out.print("\n\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t               3. Bank");
        System.out.print("\n\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t               4. NONE");
        System.out.print(
                "\n\n\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t  Which one Would You Like To Choose, 1 2 3 or 4?\n\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t    => ");

        String de = sc.nextLine();

        if (de.equals("1")) {

            System.out.print("\n\n\n\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t         Thank You For Choosing Mobile Bank");

            System.out.print("\n\n\n\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t         ======================");
            System.out.print("\n\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t         ||    Mobile Bank   ||");
            System.out.print("\n\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t        ======================");

            System.out.print("\n\n\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t             1. Bkash");
            System.out.print("\n\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t             2. Rocket");
            System.out.print("\n\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t             3. Nagad");
            System.out.print("\n\n\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t       Which One Would You Prefer?");
            System.out.print("\n\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t         => ");

            String pref = sc.nextLine();
            if (pref.equals("1")) {

                String mon, pao;

                System.out.print("\n\n\n\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t         ======================");
                System.out.print("\n\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t         ||       BKash      ||");
                System.out.print("\n\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t         ======================");

                System.out.print("\n\n\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t      Please Enter Your Number & PIN-");
                System.out.print("\n\n\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t          Mobile Number: ");
                mon = sc.nextLine();
                System.out.print("\n\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t          PIN: ");
                pao = sc.nextLine();
                System.out.print("\n\n\n\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t         THANK YOU, PAYMENT DONE!!!");
            }
            if (pref.equals("2")) {

                String mon, pao;

                System.out.print("\n\n\n\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t         ======================");
                System.out.print("\n\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t         ||      Rocket      ||");
                System.out.print("\n\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t         ======================");

                System.out.print("\n\n\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t      Please Enter Your Number & PIN-");
                System.out.print("\n\n\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t          Mobile Number: ");
                mon = sc.nextLine();
                System.out.print("\n\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t          PIN: ");
                pao = sc.nextLine();
                System.out.print("\n\n\n\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t         THANK YOU, PAYMENT DONE!!!");
            }
            if (pref.equals("3")) {

                String mon, pao;

                System.out.print("\n\n\n\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t         ======================");
                System.out.print("\n\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t         ||       Nagad      ||");
                System.out.print("\n\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t         ======================");

                System.out.print("\n\n\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t      Please Enter Your Number & PIN-");
                System.out.print("\n\n\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t          Mobile Number: ");
                mon = sc.nextLine();
                System.out.print("\n\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t          PIN: ");
                pao = sc.nextLine();
                System.out.print("\n\n\n\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t         THANK YOU, PAYMENT DONE!!!");
            }

            mp.put(kk, new chosen_data(chosen_veh, chosen_hotel, total_cost));
        }
        if (de.equals("2")) {
            String pref;

            System.out.print("\n\n\n\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t         Thank You For Choosing Card");

            System.out.print("\n\n\n\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t         ======================");
            System.out.print("\n\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t         ||       Card       ||");
            System.out.print("\n\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t         ======================");

            System.out.print("\n\n\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t             1.VISA\n");
            System.out.print("\n\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t             2.Master Card\n");
            System.out.print("\n\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t             3.ATM Card\n");
            System.out.print("\n\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t         Which One Would You Prefer?\n");
            System.out.print("\n\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t         => ");

            pref = sc.nextLine();
            if (pref.equals("1")) {

                String card, cv;

                String nm, exp, add, con;

                System.out.print("\n\n\n\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t         ======================");
                System.out.print("\n\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t         ||     VISA Card    ||");
                System.out.print("\n\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t         ======================");

                System.out.print("\n\n\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t         Card number: ");
                card = sc.nextLine();
                System.out.print("\n\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t          Name: ");
                nm = sc.nextLine();
                System.out.print("\n\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t          Address: ");
                add = sc.nextLine();
                System.out.print("\n\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t          Country: ");
                con = sc.nextLine();
                System.out.print("\n\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t          CVV: ");
                cv = sc.nextLine();
                System.out.print("\n\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t          Exp: ");
                exp = sc.nextLine();
                System.out.print("\n\n\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t         THANK YOU, PAYMENT DONE!!!");
            }

            if (pref.equals("2")) {
                String card, cv;
                String nm, exp, add, con;

                System.out.print("\n\n\n\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t         ======================");
                System.out.print("\n\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t         ||    Master Card   ||");
                System.out.print("\n\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t        ======================");

                System.out.print("\n\n\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t         Card number: ");
                card = sc.nextLine();
                System.out.print("\n\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t         Name: ");
                nm = sc.nextLine();
                System.out.print("\n\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t         Address: ");
                add = sc.nextLine();
                System.out.print("\n\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t         Country: ");
                con = sc.nextLine();
                System.out.print("\n\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t         CVV: ");
                cv = sc.nextLine();
                System.out.print("\n\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t         Exp: ");
                exp = sc.nextLine();
                System.out.print("\n\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t         THANK YOU, PAYMENT DONE!!!");
            }

            if (pref.equals("3")) {
                String card, cv;
                String nm, exp, add, con;
                System.out.print("\n\n\n\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t         ======================");
                System.out.print("\n\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t         ||     ATM Card     ||");
                System.out.print("\n\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t       ========================");

                System.out.print("\n\n\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t         Card number: ");
                card = sc.nextLine();
                System.out.print("\n\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t         Name: ");
                nm = sc.nextLine();
                System.out.print("\n\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t         Address: ");
                add = sc.nextLine();
                System.out.print("\n\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t         Country: ");
                con = sc.nextLine();
                System.out.print("\n\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t         CVV: ");
                cv = sc.nextLine();
                System.out.print("\n\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t         Exp: ");
                exp = sc.nextLine();
                System.out.print("\n\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t         THANK YOU, PAYMENT DONE!!!");
            }

            mp.put(kk, new chosen_data(chosen_veh, chosen_hotel, total_cost));
        }
        /// .....
        if (de.equals("3")) {

            System.out.print("\n\n\n\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t         Thank you for choosing Bank");

            System.out.print("\n\n\n\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t         ======================");
            System.out.print("\n\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t         ||       Bank       ||");
            System.out.print("\n\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t      =========================");

            System.out.print(
                    "\n\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t         This Is Our Merchant Number: 01XXXXXXXXXX\n\n\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t         THANK YOU!!!\n");

            mp.put(kk, new chosen_data(chosen_veh, chosen_hotel, total_cost));
        }

    }

    void showmoney() {
        for (chosen_data k : mp.values()) {
            System.out.println(k.hot + " " + k.veh + " " + k.mon);
        }
    }

}
