package com.spring.agendalive.document;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

@Document
public class LiveDocument {

    @Id
    private String id;
    private String liveName;
    private String channelName;
    private LocalDate liveDate;
    private LocalTime liveTime;
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

    public LocalDate getLiveDate() {
        return liveDate;
    }

    public void setLiveDate(LocalDate liveDate) {
        this.liveDate = liveDate;
    }

    public LocalTime getLiveTime() {
        return liveTime;
    }

    public void setLiveTime(LocalTime liveTime) {
        this.liveTime = liveTime;
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
