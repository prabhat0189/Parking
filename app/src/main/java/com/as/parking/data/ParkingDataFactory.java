package com.as.parking.data;

import com.as.parking.models.ParkingEntity;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by PRABHAT on 8/25/2015.
 */
public class ParkingDataFactory {
    private static List<ParkingEntity> parkingList;
    public static List<ParkingEntity> getParkingList() {
        if(parkingList == null) {
            generateParkingDummyData();
        }
        return parkingList;
    }


    private static void generateParkingDummyData() {
        parkingList = new ArrayList<>();
        /*parkingList.add(getParkingEntity("ABC",));
        parkingList.add(new ParkingEntity());
        parkingList.add(new ParkingEntity());
        parkingList.add(new ParkingEntity());
        parkingList.add(new ParkingEntity());*/
    }

    private ParkingEntity getParkingEntity(String name, String address, long lat, long lang, int total, int empty, int ratePerTwoHr) {
        ParkingEntity parkingEntity = new ParkingEntity();
        parkingEntity.setParkingName(name);
        parkingEntity.setParkingAddress(address);
        parkingEntity.setLatitude(lat);
        parkingEntity.setLongitute(lang);
        parkingEntity.setTotalSpaceCount(total);
        parkingEntity.setEmptySpaceCount(empty);

        Map<Integer, Integer> rates = new LinkedHashMap<Integer, Integer>();
        rates.put(2, ratePerTwoHr);
        parkingEntity.setRates(rates);

        return parkingEntity;
    }
}
