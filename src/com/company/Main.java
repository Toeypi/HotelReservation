package com.company;

import java.util.List;

public class Main {

    public static void main(String[] args) {
        HotelReservation meriton = new HotelReservation("Meriton", 8, 12);

        // chose room name to reserve
        meriton.reserveRoom("G05");
        meriton.reserveRoom("F12");
        meriton.cancelRoom("F12");
        System.out.println("--------");
        printByRoomNameOrder(meriton.getRooms());
        System.out.println("--------");
        printByPriceOrder(meriton.getRooms());

    }


    static void printByRoomNameOrder(List<HotelReservation.Room> rooms) {
        for (HotelReservation.Room room : rooms) {
            System.out.println(room.getRoomName() + ": " + room.getPrice() + room.checkRoomReserved());
        }
    }

    static void printByPriceOrder(List<HotelReservation.Room> rooms) {
        // show list of room sort by price order.
        rooms.sort(HotelReservation.price_order);
        for (HotelReservation.Room room : rooms) {
            System.out.println(room.getRoomName() + ": " + room.getPrice() + room.checkRoomReserved());
        }
    }
}
