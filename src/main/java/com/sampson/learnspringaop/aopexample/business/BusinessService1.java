package com.sampson.learnspringaop.aopexample.business;

import com.sampson.learnspringaop.aopexample.annotations.TrackTime;
import com.sampson.learnspringaop.aopexample.data.DataService1;
import org.springframework.stereotype.Service;

import java.util.Arrays;

@Service
public class BusinessService1 {

    private DataService1 dataService1;

    public BusinessService1(DataService1 dataService1) {
        this.dataService1 = dataService1;
    }

    @TrackTime
    public int calculateMax(){
        int [] data = dataService1.retrieveData();
        return Arrays.stream(data).max().orElse(0);
    }

    public int calculateSum(){
        throw new RuntimeException("Something Went Wrong");
    }
}
