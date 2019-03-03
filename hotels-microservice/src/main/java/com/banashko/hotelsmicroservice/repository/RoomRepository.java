package com.banashko.hotelsmicroservice.repository;

import com.banashko.hotelsmicroservice.domain.Room;
import org.springframework.stereotype.Repository;

@Repository
public interface RoomRepository extends AbstractRepository<Room, Long> {
}
