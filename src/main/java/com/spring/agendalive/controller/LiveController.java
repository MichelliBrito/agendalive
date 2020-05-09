package com.spring.agendalive.controller;

import com.spring.agendalive.document.LiveDocument;
import com.spring.agendalive.service.LiveService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.time.LocalDateTime;
import java.util.List;
import java.util.Optional;

@RestController
public class LiveController {

    @Autowired
    LiveService liveService;

    @GetMapping("/lives")
    public ResponseEntity<List<LiveDocument>> getAllLives(){
        List<LiveDocument> liveList = liveService.findAll();
        if(liveList.isEmpty()) {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }else {
            return new ResponseEntity<List<LiveDocument>>(liveList, HttpStatus.OK);
        }
    }

    @GetMapping("/lives/{id}")
    public ResponseEntity<LiveDocument> getOneLive(@PathVariable(value="id") String id){
        Optional<LiveDocument> liveO = liveService.findById(id);
        if(!liveO.isPresent()) {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }else {
            return new ResponseEntity<LiveDocument>(liveO.get(), HttpStatus.OK);
        }
    }

    @PostMapping("/lives")
    public ResponseEntity<LiveDocument> saveLive(@RequestBody @Valid LiveDocument live) {
        live.setRegistrationDate(LocalDateTime.now());
        live.setLiveDate(LocalDateTime.now());
        return new ResponseEntity<LiveDocument>(liveService.save(live), HttpStatus.CREATED);
    }

    @DeleteMapping("/lives/{id}")
    public ResponseEntity<?> deleteLive(@PathVariable(value="id") String id) {
        Optional<LiveDocument> liveO = liveService.findById(id);
        if(!liveO.isPresent()) {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }else {
            liveService.delete(liveO.get());
            return new ResponseEntity<>(HttpStatus.OK);
        }
    }

    @PutMapping("/lives/{id}")
    public ResponseEntity<LiveDocument> updateLive(@PathVariable(value="id") String id,
                                                      @RequestBody @Valid LiveDocument liveDocument) {
        Optional<LiveDocument> liveO = liveService.findById(id);
        if(!liveO.isPresent()) {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }else {
            liveDocument.setId(liveO.get().getId());
            return new ResponseEntity<LiveDocument>(liveService.save(liveDocument), HttpStatus.OK);
        }
    }
}
