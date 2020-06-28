package io.dowlath.couponservice.controller;

import io.dowlath.couponservice.model.Coupon;
import io.dowlath.couponservice.repository.CouponRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * @Author Dowlath
 * @create 6/28/2020 12:18 AM
 */
@RestController
@RequestMapping("/couponapi")
public class CouponController {

    @Autowired
    CouponRepository couponRepository;

    @RequestMapping(value= "/coupons",method = RequestMethod.POST)
    public Coupon create(@RequestBody Coupon coupon){
        return couponRepository.save(coupon);
    }

    @RequestMapping(value="/coupons/{code}",method = RequestMethod.GET)
    public Coupon getCoupn(@PathVariable("code") String code){
       return couponRepository.findByCode(code);
    }


}
