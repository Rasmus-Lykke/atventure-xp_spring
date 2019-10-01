package com.example.atventurexp_spring.Repository;

import com.example.atventurexp_spring.Model.Booking;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;


@Repository
public class BookingRepo {
    @Autowired
    JdbcTemplate template;

    public Booking addEvent(Booking booking){
        String sql = "INSERT INTO booking (activityID, participants, date, contact_name, contact_phone, contact_email) VALUES (?, ?, ?, ?, ?, ?)";
        template.update(sql, booking.getActivityID(), booking.getParticipants(), booking.getDate(), booking.getContactName(), booking.getContactPhone(), booking.getContactEmail());
        return null;
    }

}
