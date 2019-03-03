create table Addresses
(
   Id integer auto_increment not null,
   Country varchar(60) not null,
   City varchar(60) not null,
   Street varchar(100) not null,
   House varchar(60) not null,
   Postcode integer not null,
   primary key(id)
);

create table TypesOfRooms
(
   Id integer auto_increment not null,
   Description varchar(255) not null,
   primary key(id)
);

create table TypesOfRoomsStatuses
(
   Id integer auto_increment not null,
   Description varchar(255) not null,
   primary key(id)
);

create table Hotels
(
   Id integer auto_increment not null,
   Description varchar(255) not null,
   Numstars integer not null,
   Numfloors integer not null,
   Addressid integer not null,
   primary key(id),
   foreign key (addressId)
   REFERENCES Addresses(Id)
);

create table Rooms
(
   id integer auto_increment not null,
   Area float not null,
   Typeofroomid integer not null,
   Hotelid integer not null,
   Typeofroomstatusid integer not null,
   primary key(id),
   foreign key (TypeOfRoomId)
   REFERENCES TypesOfRooms(Id),
   foreign key (HotelId)
   REFERENCES Hotels(Id),
   foreign key (TypeOfRoomStatusId)
   REFERENCES TypesOfRoomsStatuses(Id)
);



