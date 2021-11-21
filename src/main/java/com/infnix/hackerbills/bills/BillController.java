package com.infnix.hackerbills.bills;

import lombok.RequiredArgsConstructor;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.web.bind.annotation.*;

import java.util.Date;
import java.util.List;
import java.util.Optional;

@RestController
@RequiredArgsConstructor
public class BillController {

    private final BillService billService;

    @PostMapping(path = "/addbill")
    public void addBill(@RequestBody Bill bill){
        billService.addBill(bill);
    }

    @GetMapping(path = "/bills")
    public List<Bill> showBills(){
        return billService.listAllBills();
    }

    @GetMapping(path = "/bills/{id}")
    public Optional<Bill> showBill(@PathVariable Long id){
        return billService.getBillById(id);
    }

//    @GetMapping(path = "/bills/due/{date}")
//    public List<Bill> showBillsByDate(@PathVariable @DateTimeFormat(pattern = "dd-MM-yyyy") Date date){
//        return billService.getBillsByDate(date);
//    }


}
