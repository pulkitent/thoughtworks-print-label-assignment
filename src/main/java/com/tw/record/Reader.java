package com.tw.record;

import com.tw.party.Guest;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.LinkedList;
import java.util.List;

public class Reader {
    public static List<Guest> readGuestRecords(String filePath) throws IOException {
        String line = "";
        BufferedReader reader = new BufferedReader(new FileReader(filePath));
        List<Guest> guests = new LinkedList();

        while ((line = reader.readLine()) != null) {
            guests.add(RecordParser.createRecord(line));
        }
        return guests;
    }
}
