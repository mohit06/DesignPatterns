package org.example;

import java.util.Map;

public class FiveHundredRupeeNotesDispenser extends CashDespenser{
    public FiveHundredRupeeNotesDispenser(int totalNotes, Map<Integer, Integer> emptyMap) {
        super(totalNotes, emptyMap);
    }

    @Override
    public void despenseMoney(int amount) {
        if(amount % 100 == 0){
            if(amount >= 500 && amount % 500 == 0 && this.getTotalNotesCount() >= amount/500 ){
                int despensedNotesCount = (int)amount/500;
                if(despensedNotesCount >= this.getTotalNotesCount()){
                    despensedNotesCount = this.getTotalNotesCount();
                }
                int remainingNotes = this.getTotalNotesCount() - despensedNotesCount;
                this.setTotalNotesCount(remainingNotes);
                this.getMap().put(500,despensedNotesCount);
                amount = amount - despensedNotesCount*500;
            }
            if(amount > 0){
                this.getNextCashDispenser().despenseMoney(amount);
            }
        }
        else{
            System.out.println("Amount must be in multiple of 100.");
        }
    }
}
