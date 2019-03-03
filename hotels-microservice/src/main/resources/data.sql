insert into Addresses
values(1, 'Russia', 'Kislovodsk', 'Lenina', '55/2', 550055);

insert into Addresses
values(2, 'Russia', 'Kislovodsk', 'Krasnaya', '11', 550052);

insert into Addresses
values(3, 'Russia', 'Krasnodar', 'Atarbekova', '46', 550022);

insert into Addresses
values(4, 'USA', 'Detroit', 'Sunshine Valley', '46-454', 03433);

insert into Addresses
values(5, 'USA', 'Detroit', 'Sunshine Valley', '111', 31345);



insert into TypesOfRooms
values(1, 'small cheap room');

insert into TypesOfRooms
values(2, 'apartments');

insert into TypesOfRooms
values(3, 'deluxe room');



insert into TypesOfRoomsStatuses
values(1, 'available for booking');

insert into TypesOfRoomsStatuses
values(2, 'booked');



insert into Hotels
values(1, 'Not good hotel', 3, 2, 1);

insert into Hotels
values(2, 'Good hotel', 4, 3, 2);

insert into Hotels
values(3, 'Some description ', 4, 3, 4);

insert into Hotels
values(4, 'Other description', 2, 1, 3);

insert into Hotels
values(5, 'Best hotel', 5, 7, 5);


-- id Area TypeOfRoomId HotelId TypeOfRoomStatusId
insert into Rooms
values(1, 55.4, 1, 1, 1);

insert into Rooms
values(2, 51.4, 2, 1, 1);

insert into Rooms
values(3, 55, 3, 2, 1);

insert into Rooms
values(4, 11, 3, 2, 1);

insert into Rooms
values(5, 5.4, 2, 3, 1);

insert into Rooms
values(6, 141, 1, 3, 1);

insert into Rooms
values(7, 63, 3, 5, 1);

insert into Rooms
values(8, 63.11, 1, 5, 1);

insert into Rooms
values(9, 56, 3, 4, 1);

insert into Rooms
values(10, 48, 1, 4, 1);



