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
public class Bet{
    private ArrayList<Integer> Numbers;
    private int BetMoney;
    private ArrayList<Integer> WinningNum;
    private ArrayList<Integer> MatchedNumbers;

    public Bet(int N1,int N2,int N3,int N4,int BetMoney) {
        Numbers = new ArrayList<>();
        WinningNum = new ArrayList<>();
        MatchedNumbers = new ArrayList<>();
        Numbers.add(N1);
        Numbers.add(N2);
        Numbers.add(N3);
        Numbers.add(N4);
        this.BetMoney=BetMoney;
    }
    public int ComputeGain(){
        int Gain=0;
        int MatchNumCount=MatchingNumCount();
        if(MatchNumCount==4){
            Gain= BetMoney*50;
        }else if(MatchNumCount==3){
            Gain= BetMoney*5;
        }
        else{
            Gain=0;
        }
        return Gain;
    }
    public ArrayList<Integer> FindWinningNumbers(){
        Random R=new Random();
        int Winner;
        ArrayList<Integer> AllNums= new ArrayList<Integer>();
        for(int i=1;i<=20;i++){
            AllNums.add(i);
        }
        for(int j=0;j<4;j++){
            Winner=AllNums.get(R.nextInt(AllNums.size()));
            WinningNum.add(Winner);
            AllNums.remove(AllNums.indexOf(Winner));
        }
        return WinningNum;
    }
    public int MatchingNumCount(){
        int MatchNumCount=0;
        for(int A:Numbers){
            for(int B:WinningNum){
                if(A==B){
                    MatchNumCount+=1;
                     MatchedNumbers.add(A);
                }
            }
        }
        return MatchNumCount;
    };
    public ArrayList<Integer> getUserNumbers(){
        return Numbers;
    }

    public ArrayList<Integer> getMatchedNumbers() {
        return MatchedNumbers;
    }
    
}
