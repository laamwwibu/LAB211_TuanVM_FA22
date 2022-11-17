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
public class Validate {
   public String findExistedCode(ArrayList<EastAsiaCountries> list,
            String countryCode) throws Exception {
        //Loop through the list to check if the code is existed
        for (EastAsiaCountries c : list) {
            //Throw new exception if it's equal to the code of any country
            if (c != null && c.getCountryCode().equalsIgnoreCase(countryCode)) {
                throw new Exception("Code is already existed in the list");
            }
        }
        return countryCode;
    }
    
    public String findExistedName(ArrayList<EastAsiaCountries> list,
            String countryname) throws Exception {
        //Loop through the list to check if the code is existed
        for (EastAsiaCountries c : list) {
            //Throw new exception if it's equal to the code of any country
            if (c != null && c.getCountryName().equalsIgnoreCase(countryname)) {
                throw new Exception("Name is already existed in the list");
            }
        }
        return countryname;
    }
}
