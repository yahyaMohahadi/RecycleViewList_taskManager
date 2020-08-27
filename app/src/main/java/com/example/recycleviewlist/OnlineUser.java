package com.example.recycleviewlist;

import androidx.annotation.NonNull;

import com.example.recycleviewlist.model.User;

public class OnlineUser {
    public static User mUserRoot = new User("root", "root");
    private static OnlineUser mOnlineUser;
    private static User onlineUser;

    private OnlineUser() {
    }

    public static OnlineUser newInstance() {
        if (mOnlineUser == null) {
            mOnlineUser = new OnlineUser();
        }
        return mOnlineUser;
    }

    public User getOnlineUser() {
        return onlineUser;
    }

    public void setOnlineUser(@NonNull User onlineUser) {
        OnlineUser.onlineUser = onlineUser;
    }
}
