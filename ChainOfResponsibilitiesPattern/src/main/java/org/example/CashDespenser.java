package org.example;

import java.util.HashMap;
import java.util.Map;

public abstract class CashDespenser implements Handler{
    private int totalNotesCount;
    private CashDespenser nextCashDispenser;

    Map<Integer,Integer> map ;
    public CashDespenser(int totalNotes, Map<Integer, Integer> emptyMap){
        totalNotesCount = totalNotes;
        map = emptyMap;

    }


    public int getTotalNotesCount(){
        return totalNotesCount;
    }

    public void setTotalNotesCount(int count){
        totalNotesCount = count;
    }

    public CashDespenser getNextCashDispenser(){
        return nextCashDispenser;
    }

    public Map<Integer,Integer> getMap(){
        return map;
    }

    public void setNextCashDispenser(CashDespenser next){
        nextCashDispenser = next;
    }


}
