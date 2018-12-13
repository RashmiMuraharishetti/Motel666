package com.assessment.Motel666.Controller;

import com.assessment.Motel666.Entity.Motel;
import com.assessment.Motel666.Service.MotelService;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

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

    @RequestMapping(value = "/getdetails", method = RequestMethod.GET)
    public Iterable<Motel> getDetails(){
        return motelService.getDetails();
    }

    @RequestMapping(value = "/getdetailsbyid/{userId}", method = RequestMethod.GET)
    public Iterable<Motel> getDetailsById(@PathVariable String userId){
        return motelService.findByuserId(userId);
    }
}
