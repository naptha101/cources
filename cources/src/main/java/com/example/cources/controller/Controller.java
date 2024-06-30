package com.example.cources.controller;


import com.example.cources.entity.cources;
import com.example.cources.models.CourceModel;
import com.example.cources.repo.courceRepo;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
public class Controller {
    @Autowired
    courceRepo rep;

    @GetMapping("/get/{id}")
    public ResponseEntity<CourceModel> get(@PathVariable("id") int id){
     cources cc=rep.findCourcefEmployee(id);

        if (cc == null) {
            return ResponseEntity.status(200).body(null);
        }

     CourceModel cm=new CourceModel();
     BeanUtils.copyProperties(cc,cm);

        return ResponseEntity.status(200).body(cm);

    }

    @PostMapping("/post")
    public ResponseEntity<CourceModel> post(@RequestBody CourceModel m){

        rep.postCource(m.getId(),m.getCname(),m.getTeacher(),m.getEmp_id());

//        if (cc == null) {
//            return ResponseEntity.status(200).body(null);
//        }

       // CourceModel cm=new CourceModel();
      //  BeanUtils.copyProperties(cc,cm);

        return ResponseEntity.status(200).body(m);

    }





}
