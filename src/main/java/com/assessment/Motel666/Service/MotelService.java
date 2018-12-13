package com.assessment.Motel666.Service;

import com.assessment.Motel666.Entity.Motel;
import com.assessment.Motel666.Repository.MotelRepository;
import org.springframework.stereotype.Service;

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

    public Iterable<Motel> getDetails(){
        return motelRepository.findAll();
    }

    public Iterable<Motel> findByuserId(String id){
        return motelRepository.findByuserId(id);
    }
}
