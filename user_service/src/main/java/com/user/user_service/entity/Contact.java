package com.user.user_service.entity;

import lombok.Data;
import lombok.ToString;

@Data
@ToString
public class Contact {

    private Long cId;
    private String email;
    private String contactName;

    private Long userId;

    public Contact(Long cId, String email, String contactName, Long userId) {
        this.cId = cId;
        this.email = email;
        this.contactName = contactName;
        this.userId = userId;
    }

    public Contact() {
    }
}
