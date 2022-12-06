/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lottery.game;

import java.util.ArrayList;

/**
 *
 * @author Sanjeewa Kulathunga
 */
public class Tolo {
    private ArrayList<Integer> DrawNumbers;
    private ArrayList<Integer> UserNumbers;
    private ArrayList<Integer> MatchedNumbers;
    private int SuperNumber;
    private int MatchNCount;
    private boolean isSuperBet;
    private Bet B;
    private SuperBet SB;
 
    public int getGain(){
        if(B!=null && SB==null){
            return B.ComputeGain();
        }else if(B==null && SB!=null){
            return SB.ComputeGainWithLuckyNumber();
        }
        return 0;
    }
    public void createBet(int N1,int N2,int N3,int N4,int money){
        B = new Bet(N1,N2,N3,N4,money);
        this.DrawNumbers= B.FindWinningNumbers();
        this.MatchNCount=B.MatchingNumCount();
        this.UserNumbers=B.getUserNumbers();
        this.MatchedNumbers=B.getMatchedNumbers();
        this.isSuperBet=false;
    }
    public void createSuperBet(int N1,int N2,int N3,int N4,int money,int superN){
        SB = new SuperBet(N1,N2,N3,N4,money,superN);
        this.DrawNumbers= SB.FindWinningNumbers();
        this.MatchNCount=SB.MatchingNumCount();
        this.SuperNumber=SB.getLuckynumber();
        this.UserNumbers=SB.getUserNumbers();
        this.MatchedNumbers=SB.getMatchedNumbers();
        this.isSuperBet=true;
        
    }

    public ArrayList<Integer> getDrawNumbers() {
        return DrawNumbers;
    }

    public ArrayList<Integer> getUserNumbers() {
        return UserNumbers;
    }

    public int getSuperNumber() {
        return SuperNumber;
    }

    public int getMatchNCount() {
        return MatchNCount;
    }
    
    public ArrayList<Integer> getMatchedNumbers() {
        return MatchedNumbers;
    }
    
}
