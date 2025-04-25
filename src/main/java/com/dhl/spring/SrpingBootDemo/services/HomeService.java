package com.dhl.spring.SrpingBootDemo.services;

import com.dhl.spring.SrpingBootDemo.repository.HomeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class HomeService {

//    @Autowired
//    private HomeRepository homeRepository;

    public String getHomeAddress() {
        return "HomeAddress";
    }
}
