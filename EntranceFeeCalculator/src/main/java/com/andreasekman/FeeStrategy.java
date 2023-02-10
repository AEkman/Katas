package com.andreasekman;

public interface FeeStrategy {
    double calculate(TicketType ticketType);

    boolean accepts(Visitor visitor);
}
