package com.imran.core.user.service;

import com.imran.core.exception.InvalidTokenException;
import com.imran.core.exception.UserAlreadyExistException;
import com.imran.core.user.jpa.data.UserEntity;
import com.imran.web.data.user.UserData;

public interface UserService {

    void register(final UserData user) throws UserAlreadyExistException;
    boolean checkIfUserExist(final String email);
    void sendRegistrationConfirmationEmail(final UserEntity user);
    boolean verifyUser(final String token) throws InvalidTokenException;
}
