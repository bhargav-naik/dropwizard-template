package com.ganesha.service.userService;

import javax.inject.Singleton;

/**
 * Created by bhargav.naik on 14/09/16.
 */

@Singleton
public class UserService implements IUserService {
    @Override
    public String get(String id) {
        return id;
    }
}
