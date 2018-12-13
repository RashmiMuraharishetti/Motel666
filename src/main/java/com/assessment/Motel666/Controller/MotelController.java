package com.assessment.Motel666.Controller;

import com.assessment.Motel666.Entity.Motel;
import com.assessment.Motel666.Service.MotelService;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/motel")
public class MotelController {

    private MotelService motelService;

    public MotelController(MotelService motelService) {
        this.motelService = motelService;
    }

    @RequestMapping(value = "/adddetails", method = RequestMethod.POST)
    public Motel addDetails(@RequestBody Motel motel){
        return motelService.addDetails(motel);
    }
}
