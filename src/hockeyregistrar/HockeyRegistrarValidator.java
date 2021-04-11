package hockeyregistrar;

import java.time.LocalDate;

/**
 * A utility class to verify that players on a hockey team meet certain criteria with respect to their age 
 * for an 'under 10' team. Used for final exam review.
 *
 * @author dancye, 2019
 * @author Paul Bonenfant April 2021
 */
public class HockeyRegistrarValidator {

    /**
     * A method that validates that players are eligible for a
     * '10 and under' hockey club. In order to qualify, they must
     * be 10 or less by Dec 31 of the current year
     *
     * @param playerBirthYear, the player's year of birth
     * @return true if the player will be 10 or under 
     * this year, false otherwise.
     */
    public boolean validateBirthYear(int playerBirthYear) {
        
        // Get the current year
        LocalDate date = LocalDate.now();
        int year = date.getYear();    
        
        if (playerBirthYear >= (year - 10)) {
            return true;
        }
        return false;
    }
}
