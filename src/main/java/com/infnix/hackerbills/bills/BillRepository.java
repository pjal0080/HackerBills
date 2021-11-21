package com.infnix.hackerbills.bills;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.stereotype.Repository;

import java.util.Date;
import java.util.List;

@Repository
public interface BillRepository extends JpaRepository<Bill,Long> {

//    @Query(value = "SELECT * FROM bills WHERE bill_date =:date",nativeQuery = true)

    List<Bill> findAllByBillDate(@DateTimeFormat(pattern = "dd-MM-yyyy HH:mm:ss") Date date);
}
