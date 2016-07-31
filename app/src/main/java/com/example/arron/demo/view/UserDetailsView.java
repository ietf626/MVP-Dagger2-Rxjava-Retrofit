/**
 * Copyright (C) 2014 android10.org. All rights reserved.
 *
 * @author Fernando Cejas (the android10 coder)
 */
package com.example.arron.demo.view;

import com.example.arron.demo.domain.User;

public interface UserDetailsView extends BaseView {
    void renderUser(User user);
}
