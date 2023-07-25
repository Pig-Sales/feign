package com.ps.client;

import com.ps.pojo.Result;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;


@FeignClient("user")
public interface UserClient {

    //true为审核通过，false为其他
    @PostMapping("/isSellerSafe")
    Result isSellerSafe(String openId);
}
