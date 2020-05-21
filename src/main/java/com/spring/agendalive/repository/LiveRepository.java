package com.spring.agendalive.repository;

import com.spring.agendalive.document.LiveDocument;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.mongodb.repository.MongoRepository;
import java.time.LocalDateTime;


public interface LiveRepository extends MongoRepository<LiveDocument, String> {

    Page<LiveDocument> findByLiveDateAfterOrderByLiveDateAsc(LocalDateTime date, Pageable pageable);
    Page<LiveDocument> findByLiveDateBeforeOrderByLiveDateDesc(LocalDateTime date, Pageable pageable);
}
