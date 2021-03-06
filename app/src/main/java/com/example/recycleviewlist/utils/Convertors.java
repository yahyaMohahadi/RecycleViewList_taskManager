package com.example.recycleviewlist.utils;

import androidx.room.TypeConverter;

import com.example.recycleviewlist.model.State;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.UUID;

public class Convertors {

    @TypeConverter
    public static String StringFromUUID(UUID uuid) {
        return uuid.toString();
    }

    @TypeConverter
    public static UUID StringFromUUID(String uuid) {
        return UUID.fromString(uuid);
    }

    @TypeConverter
    public static State StrinFromState(String state) {
        return State.valueOf(state);
    }

    @TypeConverter
    public static String StateFromString(State state) {
        return String.valueOf(state);
    }

    @TypeConverter
    public static Date DateFromString(String date) {
        DateFormat format = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss.SSSZ");

        try {
            return format.parse(
                    date
            );
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    @TypeConverter
    public static String StringFromDate(Date date) {
        DateFormat format = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss.SSSZ");
        return format.format(date);
    }
}
