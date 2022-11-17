/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package j1.s.p052;

import static java.lang.System.exit;
import java.util.ArrayList;

/**
 *
 * @author VICTUS
 */
public class Main {

    public static void displayMenu() {
        System.out.println("                                MENU                                     ");
        System.out.println("=========================================================================");
        System.out.println("1. Input the information of 11 countries in East Asia");
        System.out.println("2. Display the information of country you've just input");
        System.out.println("3. Search the information of country by user-entered name");
        System.out.println("4. Display the information of countries sorted name in ascending order");
        System.out.println("5. Exit");
    }

    public static void main(String[] args) {
        ManageEastAsiaCountries manager = new ManageEastAsiaCountries();
        EastAsiaCountries country = new EastAsiaCountries();
        GetInput getData = new GetInput();
        

        try {
            //return to menu after perform each option
            do {
                //step 1: display menu
                displayMenu();
                //step 2: user enter their choice
                int choice = getData.getMenuChoice("Enter your choice: ", 1, 5);
                //step 3: perform funtions based on user choice
                switch (choice) {
                    case 1:
                        manager.addCountryInformation(country);
                        break;
                    case 2:
                        country = manager.getRecentlyEnteredInformation();
                        break;
                    case 3:
                        String nameToSearch = null;
                        manager.searchInformationByName(nameToSearch);
                        break;
                    case 4:
                        manager.sortInformationByAscendingOrder(countryList);
                        break;
                    case 5:
                        exit(0);
                }
            } while (true);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
