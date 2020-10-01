package com.imran.core.email.service;

import javax.mail.MessagingException;

import com.imran.core.email.context.AbstractEmailContext;

public interface EmailService {

    void sendMail(final AbstractEmailContext email) throws MessagingException;
}
