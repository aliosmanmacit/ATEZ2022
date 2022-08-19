package com.example.demo.Controller;

import com.example.demo.Entity.Beyanname;
import com.example.demo.Request.BeyannameRequest;
import com.example.demo.Service.AracServiceImpl;
import com.example.demo.Service.BeyannameServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/uygulama1")
public class BeyannameController {

    @Autowired
    private AracServiceImpl aracService;

    @Autowired
    private BeyannameServiceImpl beyannameService;

    @PostMapping("addBeyanname")
    public Beyanname saveBeyanname(@RequestBody Beyanname beyanname){
        return beyannameService.save(beyanname);
    }
    @GetMapping("getBeyanname")
    public List<Beyanname> listBeyanname() {
        return beyannameService.listBeyanname();

    }
    @PostMapping("saveBeyanname")
    public Beyanname addBeyanname(@RequestBody BeyannameRequest beyannameRequest){
        return beyannameService.addBeyanname(beyannameRequest);
    }

}
