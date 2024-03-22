package com.sampson.learnspringaop.aopexemple.data;

import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class DataService2 {

    public List<String> retrieveNames(){
        return List.of("FirstName","SecondName","ThirdName");
    }
}
