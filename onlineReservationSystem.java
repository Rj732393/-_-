
import java.util.*;
import java.lang.Math;

public class onlineReservationSystem {
    
    //Variables for user login.

    static String username = "admin";
    static String password = "Rj123";


// Variables for reservation form 

    static Hashtable<String,String> hm = new Hashtable<String,String>(); 
    static String trainNumber;
    static String trainName;
    static String classType;
    static String from;
    static String to;
    static String dateOfJourney;
    static int pnrNumber;
    static long pnr;



    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);



            //*****Login Form*****

    System.out.println("-------------------------------");
    System.out.println("          ONLINE      ");
    System.out.println("        RESERVATION      ");
    System.out.println("          SYSTEM");
    System.out.println("-------------------------------");

            System.out.print("Username : ");
            String inputUsername = sc.nextLine();
            System.out.println("");
            System.out.print("Password : ");
            String inputPassword = sc.nextLine();
            System.out.println("");

            if (inputUsername.equals(username) && inputPassword.equals(password)) {
                System.out.println("");
                System.out.println("            Login successfull..........");

            } else {
                System.out.println();
                System.out.println("            Invalid credentials........");
                System.out.println();
                return;

            }
        
            hm.put("12875", "Neelanchal Express");  
            hm.put("12664", "Hawroh Express");
            hm.put("08451", "Baidhnathdham Spl");
            hm.put("23456", "Hawroh Express");
            hm.put("12002", "Shatabdi Express");
            hm.put("12368", "Vikramshila Express");
            hm.put("12394", "Sampoorna Kranti Express");
            hm.put("12310", "Tejas Express");
            hm.put("12311", "Rajdhani Express");
            hm.put("11301", "Udyan Express");
            hm.put("11013", "Coimbatore Express");
            hm.put("19019", "Haridwar Express");
            hm.put("22659", "YOg Nagri Express");
                 // Reservation form

                System.out.println("");
                System.out.println("  Fill this Reservation form....");
                System.out.println("");


                System.out.print("Train Number: ");
                trainNumber = sc.nextLine();
                System.out.println("");

                System.out.println("Train Name: " + hm.getOrDefault(trainNumber, "Not Found"));
             
                       

                System.out.print("From: ");
                from = sc.nextLine();
                System.out.println("");


                System.out.print("To: ");
                to = sc.nextLine();
                System.out.println("");


                System.out.print("Date of journey: ");
                dateOfJourney = sc.nextLine();
                System.out.println("");


                System.out.print("Class type: ");
                classType = sc.nextLine();
                System.out.println("");


                // REVIEW DETAILS.....
               

                System.out.println("_____________________________");
                System.out.println("");
                System.out.println("       TICKETS DETAILS       ");
                System.out.println("");
                System.out.println("______________________________");

                System.out.println("");

                System.out.println("Train Number: "+trainNumber);
                System.out.println("Train Name: " + hm.getOrDefault(trainNumber, "Not Found"));
                System.out.println("From: " + from);
                System.out.println("To: " + to);
                System.out.println("Date of Journey: " + dateOfJourney);
                System.out.println("Class Type: " + classType);
                
                System.out.println("");

                long pnr = 600000000+(long)(799999999*Math.random());

                System.out.println("");

                System.out.println("The PNR number is "+pnr);

                System.out.println("");



                // cancellation form
                System.out.println("Enter PNR number to cancel tickets: ");
                pnrNumber = sc.nextInt();
                System.out.println("");
                System.out.println("Train Number: "+trainNumber);
                System.out.println("Train Name: " + hm.getOrDefault(trainNumber, "Not Found"));
                System.out.println("From: " + from);
                System.out.println("To: " + to);
                System.out.println("Date of Journey: " + dateOfJourney);
                System.out.println("Class Type: " + classType);
                System.out.println("");
                System.out.println("DO you want to cancel this ticket (press 1 for OK/  press 2 for Cancel): ");
                int confirmation = sc.nextInt();
                if (confirmation==1) {
                    System.out.println("");
                    System.out.println("Reservation cancelled successfully....");
                } else {
                    System.out.println("Reservation not cancelled....");
                }
                sc.close();

            }
        }

