/**
 * Copyright (C) 2014 android10.org. All rights reserved.
 *
 * @author Fernando Cejas (the android10 coder)
 */
package com.example.arron.demo.view;

import com.example.arron.demo.domain.User;

import java.util.Collection;

public interface UserListView extends BaseView {
    void renderUserList(Collection<User> userModelCollection);

    void viewUser(User userModel);
}
