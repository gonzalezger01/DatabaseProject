/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bookstoredbapp;

import java.util.Scanner;

/**
 *
 * @author user
 */
public class DatabaseSystem {
    public void runSystem(){
        boolean continueSystem = true;
        System.out.println("Welcome to the BookStore Database System");
        
        while(continueSystem){
            System.out.println("Please enter an option:");
            System.out.println("1. First Run Enter Data");
            System.out.println("2. View Data");
            System.out.println("3. Update Data");
            System.out.println("4. Exit System");
            System.out.print("What do you wish to do with the System?: ");

            Scanner scanner = new Scanner(System.in);
            int selection = scanner.nextInt();
            scanner.nextLine();
            if (selection != 4){
                switch(selection){
                    case 1:
                        System.out.println("First Run Entering Data");
                        System.out.println("Please give the name of the file");
                        String fileName = scanner.nextLine();
                        fileReader.setFileName(fileName);
                        fileReader.connectToDB();
                        System.out.println("Loaded Data!");
                        break;
                    case 2:
                        System.out.println("Viewing Data!");
                        System.out.println("1.View Comic Books By Date they Come Out");
                        System.out.println("2. View Comic Books by Publisher");
                        System.out.println("3. View Comic Book Series By Name");
                        System.out.println("4. View how many comic books to order on a certain date");
                        System.out.println("5. View customers by comic books subscribed to");
                        System.out.println("6. Find Customers Via Telephone Number");
                        System.out.println("7. Find Subscriptions via Customer Name");
                        System.out.println("8. Exit Viewing Data");
                        System.out.print("Enter Which Data to view:");
                        selection = scanner.nextInt();
                        scanner.nextLine();
                        if (selection != 8){
                            switch(selection){
                                case 1:
                                    System.out.print("Please enter date to search by: ");
                                    String date = scanner.nextLine();
                                    databaseExplorer.comicBooksByDateTheyComeOut(date);
                                    break;
                                case 2:
                                    System.out.print("Please enter the publisher name to find comic books: ");
                                    String publisher = scanner.nextLine();
                                    databaseExplorer.comicBooksByPublisher(publisher);
                                    break;
                                case 3:
                                    System.out.print("Please enter comic book series to find by name: ");
                                    String seriesName = scanner.nextLine();
                                    databaseExplorer.comicBooksBySeriesName(seriesName);
                                    break;
                                case 4:
                                    System.out.print("Please enter the date to view how many comic books to order on a particular date: ");
                                    date = scanner.nextLine();
                                    databaseExplorer.comicBooksOrderOnAGivenDateAndHowMany(date);
                                    break;
                                case 5:
                                    System.out.print("Please enter series to see customers subscribed to the series: ");
                                    seriesName = scanner.nextLine();
                                    databaseExplorer.customersByComicBookSeriesSubscribed(seriesName);
                                    break;
                                case 6:
                                    System.out.print("Please enter telephone number to find the customers via telephone number: ");
                                    String telephoneNumber = scanner.nextLine();
                                    databaseExplorer.findCustomersViaTelephoneNumber(telephoneNumber);
                                    break;
                                case 7:
                                    System.out.print("Please enter customer name to find subscriptions associated with it: ");
                                    String customerName = scanner.nextLine();
                                    databaseExplorer.findSubscriptionsViaCustomerName(customerName);
                                    break;
                            }
                        }else{
                        }
                        break;
                        
                    case 3:
                        System.out.println("Update Data in Database Selected!");
                        System.out.println("1. Add New Customer.");
                        System.out.println("2. Add New Subscription");
                        System.out.println("3. Change Date Comic Book Released");
                        System.out.println("4. Delete All Subscriptions for Customer");
                        System.out.println("5. ");
                        System.out.println("6.");
                        System.out.println("7. Exit");
//        
//        System.out.println("Adding new customer.\n");
//        databaseUpdater.addNewCustomer("Gerardo Gonzalez Moctezuma", "601 S MLK JrDrive", "336-222-2222");
//        
//        System.out.println("Adding new subscription.\n");
//        databaseUpdater.addNewSubscription("West Coast Flat lad", "Gerardo Gonzalez Moctezuma");
//        
//        System.out.println("chanigng date comic book released.\n");
//        databaseUpdater.changeDateComicBookIsReleased("0019-06-27", 1);
//        
//        System.out.println("delete all subscription for customer.\n");
//        databaseUpdater.deleteAllSubscriptionForCustomer("Gerardo Gonzalez Moctezuma");
//        
//        System.out.println("delete customer. First subcriptions then customer. \n");
//        databaseUpdater.deleteCustomer("Gerardo Gonzalez Moctezuma");
//        
//        System.out.println("update customer.\n");
//        databaseUpdater.updateCustomer("Tanya Dalton", "601 S MLK Jr Drive", "097-272-9181", 2);
                        break;
                }
            
            }
            else{
                System.out.println("Exiting System, thank you!");
                continueSystem = false;
            }
        }
        
    }
    
    FileReader fileReader = new FileReader();
    DatabaseExplorer databaseExplorer = new DatabaseExplorer();
    DatabaseUpdater databaseUpdater = new DatabaseUpdater();
}
