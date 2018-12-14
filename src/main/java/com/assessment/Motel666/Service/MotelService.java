package com.assessment.Motel666.Service;

import com.assessment.Motel666.Entity.Motel;
import com.assessment.Motel666.Repository.MotelRepository;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Optional;

@Service
public class MotelService {

    private MotelRepository motelRepository;

    public MotelService(MotelRepository motelRepository) {
        this.motelRepository = motelRepository;
    }

    public Motel addDetails(Motel motel){
        return motelRepository.save(motel);
    }

    public Iterable<Motel> getDetails(long time1, long time2){
        Iterable<Motel> allDetails = motelRepository.findAll();
        Iterable<Motel> result = new ArrayList<>();
        for (Motel detail:allDetails
             ) {
            if(detail.getTimestamp() > time1 && detail.getTimestamp() <time2){
                ((ArrayList<Motel>) result).add(detail);
            }
        }
        return  result;
    }

    public Iterable<Motel> findByuserId(String id){
        return motelRepository.findByuserId(id);
    }
}
