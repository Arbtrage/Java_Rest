package com.rest.rest.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
// import java.util.List;

import com.rest.rest.model.Load;

@RestController
@RequestMapping("/load")
public class LoadController {

    Load load;

    @GetMapping("{shipperId}")
    public Load getLoads(String shipperId) {
        System.out.println(shipperId);
        load=new Load("Point1", "Point2", "type1", "type2", 5, 600, "gsrg", "121231", "sfsff");
        return load;
    }

    @PostMapping
    public String postLoad(@RequestBody Load load) {
        this.load = load;
        System.out.println(load.loadingPoint);
        return "Loads created succesfully";
    }

    @PutMapping
    public String putLoad(@RequestBody Load load) {
        this.load = load;
        System.out.println(load.loadingPoint);
        return "Loads created succesfully";
    }
}
