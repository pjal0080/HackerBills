package com.infnix.hackerbills.bills;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "bills")
@Data
@NoArgsConstructor
public class Bill {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column(name = "bill_no")
    private Long billNo;

    @Column(name = "bill_to")
    private String billTo;

    @Column(name = "bill_amount")
    private Long billAmount;

    @Column(name = "total_amount")
    private Long totalAmount;

    private Long tax;

    @Column(name = "bill_date")
    @JsonFormat(pattern = "dd-MM-yyyy")
    private Date billDate;

    public Bill(Long billNo,
                String billTo,
                Long billAmount,
                Long totalAmount,
                Long tax,
                Date billDate) {
        this.billNo = billNo;
        this.billTo = billTo;
        this.billAmount = billAmount;
        this.totalAmount = totalAmount;
        this.tax = tax;
        this.billDate = billDate;
    }
}
