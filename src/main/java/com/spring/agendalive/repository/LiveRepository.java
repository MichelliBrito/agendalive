package com.spring.agendalive.repository;

import com.spring.agendalive.document.LiveDocument;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.time.LocalDate;


public interface LiveRepository extends MongoRepository<LiveDocument, String> {

    Page<LiveDocument> findByLiveDate(LocalDate date, Pageable pageable);
}
