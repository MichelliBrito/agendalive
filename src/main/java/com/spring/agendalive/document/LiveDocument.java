package com.spring.agendalive.document;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import java.time.LocalDateTime;

@Document
public class LiveDocument {

    @Id
    private String id;
    private String liveName;
    private String channelName;
    private LocalDateTime liveDate;
    private String liveLink;
    private LocalDateTime registrationDate;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getLiveName() {
        return liveName;
    }

    public void setLiveName(String liveName) {
        this.liveName = liveName;
    }

    public String getChannelName() {
        return channelName;
    }

    public void setChannelName(String channelName) {
        this.channelName = channelName;
    }

    public LocalDateTime getLiveDate() {
        return liveDate;
    }

    public void setLiveDate(LocalDateTime liveDate) {
        this.liveDate = liveDate;
    }

    public String getLiveLink() {
        return liveLink;
    }

    public void setLiveLink(String liveLink) {
        this.liveLink = liveLink;
    }

    public LocalDateTime getRegistrationDate() {
        return registrationDate;
    }

    public void setRegistrationDate(LocalDateTime registrationDate) {
        this.registrationDate = registrationDate;
    }
}
