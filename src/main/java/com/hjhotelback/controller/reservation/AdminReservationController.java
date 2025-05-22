package com.hjhotelback.controller.reservation;

import java.util.HashMap;
import java.util.Map;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.hjhotelback.dto.reservation.ReqReservation;
import com.hjhotelback.dto.reservation.ResReservation;
import com.hjhotelback.mapper.payment.PaymentMapper;
import com.hjhotelback.service.payment.PaymentService;
import com.hjhotelback.service.reservation.ReservationService;

import lombok.RequiredArgsConstructor;

@RestController
@RequestMapping("/api/admin/reservation")
@RequiredArgsConstructor
public class AdminReservationController {

    private final ReservationService _service;
    private final PaymentService paymentService;
	private final PaymentMapper paymentMapper;

     @GetMapping
    public ResReservation.Detail GETReservationDetail(@RequestParam("id") int reservationId){
        return _service.getReservationDetail(reservationId);
    }

    // 25.05.22 지은 [수정] : 예약관리에서 예약 삭제시 결제내역 먼저 삭제 필요.
    @DeleteMapping
    public ResponseEntity<Void> DELETECancelReservation(@RequestBody ReqReservation.Delete req){
    	Integer reservationId = req.reservationId;
    	
    	try {
    		boolean isDeleted = paymentService.deletePaymentReservation(reservationId);
    		if (isDeleted) {
    			_service.cancelReservation(req);
    			return ResponseEntity.noContent().build();
    		} else {
    			return ResponseEntity.notFound().build();
    		}
    		
    	} catch (RuntimeException e) {
    		return ResponseEntity.notFound().build();
    	}
        
    }

    @PostMapping
    public String POSTUpdateReservationForAdmin(@RequestBody ReqReservation.Update req){
        return _service.updateReservationForAdmin(req);
    }

    @GetMapping(value = {"list/{direction}", "list"})
    public ResReservation.GetList GETAdminReservationList(
		@RequestParam(value = "size", required = true) Integer size,
        @RequestParam(value = "lastValue", required = false) Integer lastValue,
        @PathVariable(value = "direction", required = false) String direction,
        @RequestParam(value = "colName", required = false) String colName,
        @RequestParam(value = "filter", required = false) String filterValue
    ){
        Map<String,Object> param = new HashMap<String,Object>();
        param.put("size",size);
        if(lastValue != null) param.put("lastValue",lastValue);
        if(direction != null) param.put("direction",direction);
        if(colName != null) param.put("colName",colName);
        if(filterValue != null) param.put("filterValue",filterValue);
        
        ResReservation.GetList resData = _service.getReservationList(param);

        return resData;
    }

}
