package com.tournest;

import java.util.*;
//import java.lang.*;

public class welcome {

    static void mainn() {
        main(null);
    }

    static Scanner sc = new Scanner(System.in);
    static data d = new data();
    static intro ii = new intro();
    static intro_choice ic = new intro_choice();
    static search sr = new search();
    static settings set = new settings();

    public static void main(String[] args) {

        System.out.print(
                "\n\n\n\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t  **-**-**-**-**-**-**-**-**-**-**-**-**-**-**-**-**-**-**-**");
        System.out.print(
                "\n\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t        ==-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-==");
        System.out.print(
                "\n\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t        ==                                           ==");
        System.out.print(
                "\n\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t        ==             WELCOME                       ==");
        System.out.print(
                "\n\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t        ==                    TO                     ==");
        System.out.print(
                "\n\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t        ==                      TOURNEST             ==");
        System.out.print(
                "\n\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t        ==                                           ==");
        System.out.print(
                "\n\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t        ==-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-==");
        System.out.print(
                "\n\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t  **-**-**-**-**-**-**-**-**-**-**-**-**-**-**-**-**-**-**-**\n");
        System.out.println("\n\n\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t           1.SIGN UP    2.SIGN IN");
        System.out.print("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t           => ");
        String choice = sc.nextLine();

        if (choice.equals("1")) {
            d.askinfo();
            while (true) {
                ii.show_intro();
                String choice_val;

                ic.ask_for_choices();
                choice_val = sc.nextLine();

                if (choice_val.equals("1")) {

                    sr.ask_ques();
                    sr.hotel();

                    sr.transportation();
                    sr.payment_option();
                } else if (choice_val.equals("2")) {
                    d.showprofile();

                } else if (choice_val.equals("3")) {
                    sr.showmoney();

                } else if (choice_val.equals("4")) {

                    set.settingsoption();
                    String a = sc.nextLine();
                    if (a.equals("1")) {
                        d.editprof();
                    } else if (a.equals("2")) {
                        d.support();
                    } else if (a.equals("3")) {
                        mainn();
                    } else if (a.equals("4")) {
                        d.delete();
                    }

                } else if (choice_val.equals("5")) {
                    mainn();
                } else {
                    break;
                }

            }

        } else if (choice.equals("2")) {

            d.log_in();
            while (true) {
                ii.show_intro();
                ic.ask_for_choices();
                String choice_val = sc.nextLine();

                if (choice_val.equals("1")) {

                    sr.ask_ques();
                    sr.hotel();
                    sr.transportation();
                    sr.payment_option();
                } else if (choice_val.equals("2")) {
                    d.showprofile();
                } else if (choice_val.equals("3")) {
                    sr.showmoney();
                } else if (choice_val.equals("4")) {

                    set.settingsoption();
                    String a = sc.nextLine();
                    if (a.equals("1")) {
                        d.editprof();
                    } else if (a.equals("2")) {
                        d.support();
                    } else if (a.equals("3")) {
                        mainn();
                    } else if (a.equals("4")) {
                        d.delete();
                    }

                } else if (choice_val.equals("5")) {
                    mainn();
                } else {
                    break;
                }

            }
        }

        else {
            String choice1;
            while (true) {
                System.out
                        .println("\n\n\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t           1.SIGN UP    2.SIGN IN");
                System.out.print("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t           => ");

                choice1 = sc.nextLine();
                if (choice1.equals("1") || choice1.equals("2")) {
                    break;
                }
            }
            if (choice1.equals("1")) {
                d.askinfo();
                while (true) {
                    ii.show_intro();
                    String choice_val;

                    ic.ask_for_choices();
                    choice_val = sc.nextLine();

                    if (choice_val.equals("1")) {

                        sr.ask_ques();
                        sr.hotel();
                        sr.transportation();
                        sr.payment_option();
                    } else if (choice_val.equals("2")) {
                        d.showprofile();
                    } else if (choice_val.equals("3")) {
                        sr.showmoney();
                    } else if (choice_val.equals("4")) {

                        set.settingsoption();
                        String a = sc.nextLine();
                        if (a.equals("1")) {
                            d.editprof();
                        } else if (a.equals("2")) {
                            d.support();
                        } else if (a.equals("3")) {
                            mainn();
                        } else if (a.equals("4")) {
                            d.delete();
                        }
                    } else if (choice_val.equals("5")) {
                        mainn();
                    } else {
                        break;
                    }

                }
            } else if (choice1.equals("2")) {
                // log_in
                d.log_in();
                while (true) {
                    ii.show_intro();
                    ic.ask_for_choices();
                    String choice_val = sc.nextLine();

                    if (choice_val.equals("1")) {

                        sr.ask_ques();
                        sr.hotel();
                        sr.transportation();
                        sr.payment_option();
                    } else if (choice_val.equals("2")) {
                        d.showprofile();
                    } else if (choice_val.equals("3")) {
                        sr.showmoney();
                    } else if (choice_val.equals("4")) {

                        set.settingsoption();
                        String a = sc.nextLine();
                        if (a.equals("1")) {
                            d.editprof();
                        } else if (a.equals("2")) {
                            d.support();
                        } else if (a.equals("3")) {
                            mainn();
                        } else if (a.equals("4")) {
                            d.delete();
                        }

                    } else if (choice_val.equals("5")) {
                        mainn();
                    } else {
                        break;
                    }
                }
            }
        }
    }
}