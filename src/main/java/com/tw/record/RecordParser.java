package com.tw.record;

import com.tw.party.Address;
import com.tw.party.Gender;
import com.tw.party.Guest;
import com.tw.party.Name;

public class RecordParser {
    public static Guest createRecord(String line) {
        String[] records = line.split(",");
        if (records.length != 7)
            throw new RuntimeException("Record must be of size 7");
        return createGuest(records);
    }

    private static Guest createGuest(String[] guestDetails) {
        Name name = new Name(guestDetails[0], guestDetails[1]);
        Address address = new Address(guestDetails[4], guestDetails[5], guestDetails[6]);
        Gender gender = guestDetails[2].equalsIgnoreCase(Gender.MALE.toString()) ? Gender.MALE : Gender.FEMALE;
        Guest guest = new Guest(name, gender, Integer.parseInt(guestDetails[3]), address);

        return guest;
    }
}
