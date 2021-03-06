package com.example.recycleviewlist;

import androidx.annotation.NonNull;

import com.example.recycleviewlist.model.User;

public class OnlineUser {
    public static User mUserRoot =

            new User.Builder()
                    .setName("root")
                    .setPassword("root")
                    .creat();
    private static OnlineUser mOnlineUser;
    private static User onlineUser;
    private Boolean isRoot = false;

    private OnlineUser() {
    }

    public static OnlineUser newInstance() {
        if (mOnlineUser == null) {
            mOnlineUser = new OnlineUser();
        }
        return mOnlineUser;
    }

    public Boolean getRoot() {
        return isRoot;
    }

    public User getOnlineUser() {
        return onlineUser;
    }

    public void setOnlineUser(@NonNull User onlineUser) {
        if (onlineUser.getStringPassword() == mUserRoot.getStringPassword() &&
                onlineUser.getStringName() == mUserRoot.getStringName())
            isRoot = true;
        OnlineUser.onlineUser = onlineUser;
    }

    public boolean isRoot() {
        return OnlineUser.newInstance()
                .getOnlineUser()
                .getStringName()
                .equals(
                        OnlineUser.mUserRoot.getStringName()
                )
                &&
                OnlineUser.newInstance()
                        .getOnlineUser()
                        .getStringName()
                        .equals(
                                OnlineUser.mUserRoot.getStringPassword()
                        );
    }
}
