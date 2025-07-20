package com.email.email_writer;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class EmailRequest {
    private String emailContent;
    public String tone;

    
}
