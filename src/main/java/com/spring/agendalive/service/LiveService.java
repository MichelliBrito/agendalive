package com.spring.agendalive.service;

import com.spring.agendalive.document.LiveDocument;
import com.spring.agendalive.repository.LiveRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class LiveService {

    @Autowired
    LiveRepository liveRepository;

    public List<LiveDocument> findAll(){
        return liveRepository.findAll();
    }

    public Optional<LiveDocument> findById(String id){
        return liveRepository.findById(id);
    }

    public LiveDocument save(LiveDocument liveDocument){
        return liveRepository.save(liveDocument);
    }

    public void delete(LiveDocument liveDocument){
        liveRepository.delete(liveDocument);
    }
}
