package org.example;

import java.util.Map;

public class OneThousandRupeeNotesDispenser extends CashDespenser{

    public OneThousandRupeeNotesDispenser(int totalNotesCount, Map<Integer, Integer> emptyMap){
        super(totalNotesCount, emptyMap);
    }

    @Override
    public void despenseMoney(int amount) {
       if(amount % 100 == 0){
           if(amount >= 1000 && amount % 1000 == 0 && this.getTotalNotesCount() >= 0 ){
               int despensedNotesCount = (int)amount/1000;
               if(despensedNotesCount >= this.getTotalNotesCount()){
                   despensedNotesCount = this.getTotalNotesCount();
               }
               int remainingNotes = this.getTotalNotesCount() - despensedNotesCount;
               this.setTotalNotesCount(remainingNotes);
               this.getMap().put(1000,despensedNotesCount);
               amount = amount - despensedNotesCount*1000;
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
