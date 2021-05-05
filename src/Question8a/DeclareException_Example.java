/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Question8a;

/**
 *
 * @author S542052
 */
public class DeclareException_Example {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        try{
            checkSeats(2);
        }
        catch(Exception ex){
            System.out.println(ex.getMessage());
        }
      
    }
    
    static void checkSeats(int numOfSeats) throws HouseFullException{
        if(numOfSeats <= 0)
            throw new HouseFullException("All Seats are filled. ");
        else
            System.out.println("Happy Booking");
   }
    
}
//The above code is related to checking if seats are available or not. In the checkSeats method,
//if the number of seats are less than or equal to 0, then we will throw HouseFullException,
//else other activity is done.