package com.springDemoPackage.springDemo.service;

import com.springDemoPackage.springDemo.model.Room;
import org.springframework.stereotype.Service;

import javax.swing.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

@Service
public class RoomService {
    static List<Room> roomList = new ArrayList<>();

    static {
        roomList.add(new Room(1, "R-01", "AC", "yes"));
        roomList.add(new Room(2, "R-02", "NON-AC", "yes"));
        roomList.add(new Room(3, "R-03", "AC", "yes"));
        roomList.add(new Room(4, "R-04", "NON-AC", "no"));
        roomList.add(new Room(5, "R-05", "AC", "no"));
    }

    public List<Room> getRoomList() {
        return roomList;
    }

//    delete rooms,find room by id,create new room,update room

    public Room getRoomById(int roomid) {

        for (Room room : roomList) {
            if (room.getId() == roomid) {
                return room;
            }
        }
        return null;
    }

    public List<Room> deleteRoomById(int roomid) {
        Room myroom = getRoomById(roomid);
        if (myroom==null) {
            System.out.println("The given room does not exist");
            return null;
        }else {
            roomList.remove(myroom);
            return roomList;
        }
    }

//       for (Room room : roomList) {
//            if (room.getId() == roomid) {
//                roomList.remove(room);
//                return roomList;
//            }
//        }
//        return null;
//    }

    public List<Room> addRoom(Room room) {

        Room myroom = getRoomById(room.getId());
        if (myroom==null) {
            roomList.add(room);
            return roomList;
        }else{
            System.out.println("The given room already exists");
            return null;
        }
    }

     public List<Room> updateRoomById(Room room) {
         //GET BY ID
         Room myroom =getRoomById(room.getId());
         //IF EQUAL TO NULL
         if (myroom==null) {
             System.out.println("The given room does not exist");
             return null;
         }else{
             deleteRoomById(room.getId());
             roomList.add(room);
             return roomList;
         }
         //ELSE RETURN NULL
     }

//        for (Room rooms : roomList) {
//            if (rooms.getId() == room.getId()) {
//                roomList.remove(rooms);
//                roomList.add(room);
//                return roomList;
//            }else{
//                System.out.println("room dosent exist");
//                return null;
//            }
//            return null;
//        }
//
//    }

}

