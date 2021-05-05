/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Question1d;

import java.util.ArrayList;

/**
 *
 * @author S542052
 */
public class Master implements Base {
    
    public static void main(String args[]){
    Master m = new Master();
    System.out.println("question no 1d: Pruthvi Raj Padthe");
   System.out.println(m.iplTeams());
   
   System.out.println(m.Captian("MI"));
   
   System.out.println(m.maxscoreintheleauge());
    }

    @Override
    public ArrayList<String> iplTeams() {
        ArrayList<String> Teams = new ArrayList<String>();
        Teams.add("CSK");
        Teams.add("SRH");
        Teams.add("RCB");
        Teams.add("DD");
        Teams.add("MI");
        return Teams;
    }

    @Override
    public String Captian(String FranchiseName) {
        String captain = "";
        switch(FranchiseName){
            case "CSK":
                captain ="Dhoni";
                break;
            case "SRH":
                captain ="Kane";
                break;
            case "RCB":
                captain ="LKohli";
                break;
            case "DD":
                captain ="pant";
                break;
            case "MI":
                captain ="Rohit";
                break;
            default:
                captain = "franchise not in the league";
        }   
        return captain;
    }

    @Override
    public int maxscoreintheleauge() {
        int maxScore = 230;
        return maxScore;
    }
    
}
