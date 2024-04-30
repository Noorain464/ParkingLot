package models;

import java.util.Date;

public class Payment extends BaseModel {
    private String reference;
    private Mode mode;
    private int amount;
    private Date time;
    private PaymentStatus paymentstatus;
}
