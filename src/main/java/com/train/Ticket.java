package com.train;

public class Ticket {
    int ticket;
    int round;

    public Ticket(int ticket, int round) {
        this.ticket = ticket;
        this.round = round;
    }
    public void print() {
       System.out.println("Total tickets:" + ticket + "\t" + "Round-trip:" + round + "\t" + "Total:"
                        + ((ticket - round) * 1000 + (round * 1800)));
    }
}
