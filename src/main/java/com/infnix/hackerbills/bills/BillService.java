package com.infnix.hackerbills.bills;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class BillService {

    private final BillRepository billRepository;

    public void addBill(Bill bill){ billRepository.save(bill);}

    public List<Bill> listAllBills(){
        return billRepository.findAll();
    }

    public Optional<Bill> getBillById(Long id){
        return billRepository.findById(id);
    }

//    public List<Bill> getBillsByDate(Date date){
//        return billRepository.findAllByBillDate(date);
//    }


}
