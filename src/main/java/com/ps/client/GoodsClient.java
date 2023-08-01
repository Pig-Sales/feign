package com.ps.client;

import com.ps.pojo.Goods;
import com.ps.pojo.Result;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;


@FeignClient("goods")
@RequestMapping("/goods")
public interface GoodsClient {

    @PostMapping("/updateGoodsNumber")
    Result updateGoodsNumber(@RequestBody Goods goods);

}
