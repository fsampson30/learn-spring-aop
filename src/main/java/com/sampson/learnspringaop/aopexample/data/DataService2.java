package com.sampson.learnspringaop.aopexample.data;

import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class DataService2 {

    public List<String> retrieveNames(){
        return List.of("FirstName","SecondName","ThirdName");
    }
}
