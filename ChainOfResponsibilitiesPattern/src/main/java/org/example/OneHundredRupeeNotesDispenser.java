package org.example;

import java.util.Map;

public class OneHundredRupeeNotesDispenser extends CashDespenser{
    public OneHundredRupeeNotesDispenser(int totalNotes, Map<Integer, Integer> emptyMap) {
        super(totalNotes, emptyMap);
    }

    @Override
    public void despenseMoney(int amount) {
        if(amount % 100 == 0){
            if(amount >= 100 && amount % 100 == 0 && this.getTotalNotesCount() >= amount/100 ){
                int despensedNotesCount = (int)amount/100;
                if(despensedNotesCount >= this.getTotalNotesCount()){
                    despensedNotesCount = this.getTotalNotesCount();
                }
                int remainingNotes = this.getTotalNotesCount() - despensedNotesCount;
                this.setTotalNotesCount(remainingNotes);
                this.getMap().put(100,despensedNotesCount);
                amount = amount - despensedNotesCount*100;
            }

        }
        else{
            System.out.println("Amount must be in multiple of 100.");
        }
    }
}
