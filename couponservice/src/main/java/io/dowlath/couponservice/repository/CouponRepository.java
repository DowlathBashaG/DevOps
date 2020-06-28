package io.dowlath.couponservice.repository;

import io.dowlath.couponservice.model.Coupon;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * @Author Dowlath
 * @create 6/28/2020 12:17 AM
 */
@Repository
public interface CouponRepository extends JpaRepository<Coupon,Long> {
    Coupon findByCode(String code);
}
