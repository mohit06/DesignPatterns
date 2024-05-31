package org.example;

import java.util.HashMap;

public class Main {
    public static void main(String[] args) {

        HashMap<Integer,Integer> map = new HashMap<>();
        CashDespenser thousandNotesDispenser = new OneThousandRupeeNotesDispenser(10,map);
        CashDespenser fiveHundredNotesDispenser = new FiveHundredRupeeNotesDispenser(10,map);
        CashDespenser oneHuHandlerNotesDispenser = new OneHundredRupeeNotesDispenser(10,map);

        thousandNotesDispenser.setNextCashDispenser(fiveHundredNotesDispenser);
        fiveHundredNotesDispenser.setNextCashDispenser(oneHuHandlerNotesDispenser);

        thousandNotesDispenser.despenseMoney(11000);

        for(Integer key : map.keySet()){
            System.out.println(key+","+map.get(key));
        }

    }
}