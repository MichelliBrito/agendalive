package com.spring.agendalive.repository;

import com.spring.agendalive.document.LiveDocument;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface LiveRepository extends MongoRepository<LiveDocument, String> {
}
