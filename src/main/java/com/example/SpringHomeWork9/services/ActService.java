package com.example.SpringHomeWork9.services;

import com.example.SpringHomeWork9.models.Act;
import com.example.SpringHomeWork9.repositories.ActRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ActService {
    private final ActRepository actRepository;

    public ActService(ActRepository actRepository) {
        this.actRepository = actRepository;
    }


    public List<Act> findAll(){
        return actRepository.findAll();
    }

    public Act saveAct(Act act){
        return actRepository.save(act);
    }

    public void deleteById(int id){
        actRepository.deleteById(id);
    }

    public Act getOneActByID(int id)  {
        return actRepository.getOne(id);
    }

    public Act updateAct(Act act){
        return actRepository.updateAct(act);
    }
}
