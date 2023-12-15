/*
 *
 * You can use the following import statements
 * 
 * import java.util.ArrayList;
 * 
 */

// Write your code here
package com.example.nxtstayz.repository;

import com.example.nxtstayz.model.Room;

import com.example.nxtstayz.model.Hotel;

import java.util.List;

public interface RoomRepository {
    List<Room> getRooms();

    Room getRoomById(int roomId);

    Room addRoom(Room room);

    Hotel updateRoom(int roomId, Room room);

    void deleteRoom(int roomId);

    Hotel getRoomHotel(int roomId);
}