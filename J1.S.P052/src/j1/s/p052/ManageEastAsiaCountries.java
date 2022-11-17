/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package j1.s.p052;

import java.util.ArrayList;

/**
 *
 * @author VICTUS
 */
public class ManageEastAsiaCountries {

    GetInput getData = new GetInput();
    Validate validator = new Validate();
    ArrayList<EastAsiaCountries> countryList = new ArrayList<>();
    EastAsiaCountries newCountry = new EastAsiaCountries();

    public void addCountryInformation(EastAsiaCountries country) throws Exception {
        while (countryList.size() < 2) {
            //user enter country code
            //loop until user enter a valid country code
            while (true) {
                try {
                    newCountry.setCountryCode(validator.findExistedCode(
                            countryList, getData.getString("Enter code of country: ")));
                    break;
                } catch (Exception e) {
                    System.out.println(e.getMessage());
                }
            }

            //user enter country name
            while (true) {
                try {
                    newCountry.setCountryName(validator.findExistedName(
                            countryList, getData.getString("Enter name of country: ")));
                    break;
                } catch (Exception e) {
                    System.out.println(e.getMessage());
                }
            }

            //user enter country total area
            while (true) {
                try {
                    newCountry.setTotalArea(getData.getTotalArea("Enter total Area: "));
                    break;
                } catch (Exception e) {
                    System.out.println(e.getMessage());
                }
            }

            //user enter country terrain
            while (true) {
                try {
                    newCountry.setCountryTerrain(validator.findExistedName(
                            countryList, getData.getString("Enter terrain of country: ")));
                    break;
                } catch (Exception e) {
                    System.out.println(e.getMessage());
                }
            }
            
            //add country to the list
            countryList.add(newCountry);
            System.out.println("Country added\n");
        }
        //only accept 11 country in the list
        if (countryList.size() == 2) {
            System.out.println("List already have 11 country. Cannot add more.");
        }
    }
    
    public EastAsiaCountries getRecentlyEnteredInformation() throws Exception {
        //check if list is empty
        if (CountryListEmpty(countryList)) {
            System.out.println("User have to input country informations before display them");
            return null;
        }
        System.out.printf("%-20s%-20s%-20s%-20s\n",
                "ID", "Name", "Total Area", "Terrain");
        //loop to tranvers each object country from the country list
        for (EastAsiaCountries countries : countryList) {
            countries.display();
        }
        return null;
    }
    
    public boolean CountryListEmpty(ArrayList<EastAsiaCountries> asiaCountries) {
        return asiaCountries.isEmpty();
    }
    
    public EastAsiaCountries[] searchInformationByName(String name) throws Exception {
        ArrayList<EastAsiaCountries> CountryFound = new ArrayList<>();
        if(CountryListEmpty(countryList)) {
            System.out.println("User have to input country informations before display them");
            return null;
        } else {
            name = getData.getString("Enter the name you want to search for: ");
        }
        int count = 0;
        //loop to tranvers each object country from the country list
        for (EastAsiaCountries countries : countryList) {
            //compare input to countries in list
            if ((countries.countryName).toLowerCase()
                    .contains(name.toLowerCase())) {
                count++;
                CountryFound.add(countries);
            }
        }
        //display total amount of countr input country is in the list
        if (count != 0) {
            System.out.println("Country Found");
        } //country name is not in the list
        else {
            System.out.println("Country is not in the list");
        }
        displayTableOfCountries(CountryFound.toArray(new EastAsiaCountries[CountryFound.size()]));
        return CountryFound.toArray(new EastAsiaCountries[CountryFound.size()]);
    }
    
    public void displayTableOfCountries(EastAsiaCountries[] arr) {
        System.out.printf("%-20s%-20s%-20s%-20s\n",
                "ID", "Name", "Total Area", "Terrain");
        //loop to tranvers each object country from the country list
        for (EastAsiaCountries countries : arr) {
            countries.display();
        }
    }
}
