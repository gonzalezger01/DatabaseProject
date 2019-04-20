/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bookstoredbapp;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

/**
 *
 * @author Team2
 */

//this class is used to read from the DB
public class DatabaseExplorer {

    //allows exploring the database, 
    public void exploreDB(String query, int typeOfQuery) {
        DBConnector dbConnector = new DBConnector("spring19group2", "jZXg7V3p3VkD");
        ResultSet result = dbConnector.query(query);
        
        //query type 0 will find subscriptions via customer name
        //type 1 will find
        //type 2 will find
        switch(typeOfQuery){
            case 0:
                printResultSetForCustomerSubscriptions(result);
                break;
        }
        
        dbConnector.close();
    }

    //perform the query to find the subscriptions via customer name.
    public void findSubscriptionsViaCustomerName(String customerName) {
        String SQL = "SELECT series_title FROM subscription WHERE customer_name = '" + customerName + "'";
        exploreDB(SQL, 0);
    }

    //prints out the result set for all the customer subscriptions
    //essentially its saying result set get the value from colum series title
    //add it to display data, and print it out on the console
    public void printResultSetForCustomerSubscriptions(ResultSet rs) {
        displayData.clear();
        try {
            while (rs.next()) {
                String series_title = rs.getString("series_title");
                displayData.add(series_title);
                System.out.println(series_title);
            }
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }
    
    //display data is what is used to get the information into one convenient location
    //we should call a function and then read the display data to get it to display somwhere
    ArrayList<String> displayData;
}