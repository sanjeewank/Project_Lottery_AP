/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lottery.game;

import java.util.ArrayList;
import java.util.Random;

/**
 *
 * @author Sanjeewa Kulathunga
 */
public class SuperBet extends Bet{
    private int UserLuckyNumber;
    private int luckynumber;

    public SuperBet(int N1, int N2, int N3, int N4, int BetMoney,int LuckyNumber){
        super(N1, N2, N3, N4, BetMoney);
        this.UserLuckyNumber = LuckyNumber;
        this.luckynumber=0;
    }
    
    public int ComputeGainWithLuckyNumber(){
        int Gain=0;
        FindLuckeyNumber();
        if(isLuckeyNumMatch()){
            Gain=ComputeGain()*5;
            
        }else{
            Gain=ComputeGain();
        }
        return Gain;
    }
    
    public void FindLuckeyNumber(){
        Random R=new Random();
        ArrayList<Integer> AllLuckeyNums= new ArrayList<Integer>();
        for(int i=1;i<=10;i++){
            AllLuckeyNums.add(i);
        }
        if(luckynumber==0){
            luckynumber=AllLuckeyNums.get(R.nextInt(AllLuckeyNums.size()));
        }
    }
    public Boolean isLuckeyNumMatch(){
        FindLuckeyNumber();
        if(luckynumber==this.UserLuckyNumber){
            return true;
        }
        return false;
    }

    public int getLuckynumber() {
        FindLuckeyNumber();
        return luckynumber;
    }
    
}
