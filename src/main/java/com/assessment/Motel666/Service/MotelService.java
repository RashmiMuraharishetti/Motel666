package com.assessment.Motel666.Service;

import com.assessment.Motel666.Entity.Motel;
import com.assessment.Motel666.Repository.MotelRepository;
import org.springframework.stereotype.Service;

@Service
public class MotelService {

    private MotelRepository motelRepository;

    public MotelService(MotelRepository motelRepository) {
        this.motelRepository = motelRepository;
    }

    public Motel addDetails(Motel motel){
        return motelRepository.save(motel);
    }
}
