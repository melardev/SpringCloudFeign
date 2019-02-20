package com.melardev.cloud.clients;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;

@FeignClient("rest-app")
public interface RestClient {

    @RequestMapping("/version")
    String getVersion();
}
