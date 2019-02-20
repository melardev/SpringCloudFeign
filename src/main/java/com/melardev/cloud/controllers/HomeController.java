package com.melardev.cloud.controllers;

import com.melardev.cloud.clients.RestClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {

    final RestClient restClient;

    @Autowired
    public HomeController(RestClient restClient) {
        this.restClient = restClient;
    }

    @GetMapping("/rest-version")
    public String getVersion() {
        return restClient.getVersion();
    }
}
