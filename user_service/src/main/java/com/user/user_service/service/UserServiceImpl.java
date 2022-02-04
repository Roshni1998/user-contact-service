package com.user.user_service.service;

import com.user.user_service.entity.User;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {

    // Fake User list
    List<User> list = List.of(
            new User(13311L, "Roshni", "9898989898" ),
            new User(13312L, "Prince", "9898989898" )
    );

    @Override
    public User getUser(Long id) {
        return list.stream().filter(user -> user.getUserId().equals(id)).findAny().orElse(null);
    }
}
