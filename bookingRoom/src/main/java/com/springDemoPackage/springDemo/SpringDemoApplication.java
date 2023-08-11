package com.springDemoPackage.springDemo;

import com.springDemoPackage.springDemo.controller.RoomController;
import com.springDemoPackage.springDemo.model.Room;
import com.springDemoPackage.springDemo.service.RoomService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.List;

@SpringBootApplication

public class SpringDemoApplication {
	@Autowired
	RoomService roomService;

	public static void main(String[] args) {

		SpringApplication.run(SpringDemoApplication.class, args);
	}

	@Bean
    public CommandLineRunner myRunner(){
		return jos -> {

			//to print the room list
			List<Room> myrooms = roomService.getRoomList();
			System.out.println("Room List is: " + myrooms);

			//to get a room by ID
			Room myroom = roomService.getRoomById(6);
			System.out.println("Room with this id: " + myroom);

			//to add a room to the list
			List<Room> addedList = roomService.addRoom( new Room(4, "R-06", "AC", "yes"));
			System.out.println("Room List after adding a room is: " + addedList);

			//to delete a room by id
			List<Room> room = roomService.deleteRoomById(6);
			System.out.println("Room List after deleting a room is: " + room);

			//to update a existing room
			List<Room> updatedlist = roomService.updateRoomById( new Room(6, "R-03", "AC", "yes"));
			System.out.println("Room List after updating a room is: " + updatedlist);
		};
	}
}
