package hockeyregistrar;

import java.time.LocalDate;

/**
 * A utility class to verify that players on a hockey team meet certain criteria with respect to their age 
 * for an 'under 10' team. Used for final exam review.
 *
 * @author dancye, 2019
 * @author Paul Bonenfant April 2022
 */
public class HockeyRegistrarValidator {

    /**
     * A method that validates that players are eligible for a
     * '10 and under' hockey club. In order to qualify, they must
     * be over 9 but less than 10 by Dec 31 of the current year
     *
     * @param playerBirthYear, the player's year of birth
     * @return true if the player will be over 9 but less than 10 
     * this year, false otherwise.
     */
    public boolean validateBirthYear(int playerBirthYear) {
        
        // Get the current year
        LocalDate date = LocalDate.now();
        int year = date.getYear();    
        
        int playerAge = year - playerBirthYear;
        
        return playerAge >= 9 && playerAge < 10;
    }
}
