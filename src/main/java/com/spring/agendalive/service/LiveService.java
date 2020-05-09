package com.spring.agendalive.service;

import com.spring.agendalive.document.LiveDocument;
import com.spring.agendalive.repository.LiveRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.Optional;

@Service
public class LiveService {

    @Autowired
    LiveRepository liveRepository;

    public Page<LiveDocument> findAll(Pageable pageable, String date){
        if(date != null) {
            return liveRepository.findByLiveDate(LocalDate.parse(date), pageable);
        }else{
            return liveRepository.findAll(pageable);
        }
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
