package models;

import java.util.List;

public class Bill {
    private Long ID;
    private Ticket ticket;
    private int exitTime;
    private int amount;
    private List<Payment> paymentList;
    private Status status;
}
