package com.dhl.spring.SpringBootDemo.services;

import com.dhl.spring.SpringBootDemo.repository.HomeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class HomeService {

    /*@Autowired
    private HomeRepository homeRepository;*/

    public String getHomeAddress() {
        return "This is HomeAddress";
    }
}
