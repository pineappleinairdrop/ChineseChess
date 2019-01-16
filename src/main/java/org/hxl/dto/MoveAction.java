package org.hxl.dto;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;

public class MoveAction {
    public int oldX;
    public int oldY;
    public int newX;
    public int newY;

    public static MoveAction parse(String move) {
        Gson gson = new Gson();
        // parse string to moveAction
        return gson.fromJson(move, new TypeToken<MoveAction>() {
        }.getType());
    }

    @Override
    public String toString() {
        Gson gson = new Gson();
        return gson.toJson(this);
    }
}
