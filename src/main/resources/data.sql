insert into houses(id, address, zipcode,housetype, created_at, version) values (1,'Stuttgart','70569','HOUSE', '2018-05-20 00:00:00', 0);
insert into houses(id, address, zipcode,housetype, created_at, version) values (2,'Munich','01354','FLAT', '2018-05-20 00:00:00', 0);
insert into houses(id, address, zipcode,housetype, created_at, version) values (3,'Berlin','09126','FLAT', '2018-05-20 00:00:00', 0);
insert into houses(id, address, zipcode,housetype, created_at, version) values (4,'Bonn','70140','ESTATE', '2018-05-20 00:00:00', 0);

insert into persons(id, name, age,house_id, created_at, version) values (1,'PARVIZ',27,1, '2018-05-20 00:00:00', 0);
insert into persons(id, name, age,house_id, created_at, version) values (2,'DAVID',30,2, '2018-05-20 00:00:00', 0);
insert into persons(id, name, age,house_id, created_at, version) values (3,'Peter',29,3, '2018-05-20 00:00:00', 0);
insert into persons(id, name, age,house_id, created_at, version) values (4,'ELY',40,4, '2018-05-20 00:00:00', 0);


insert into children(id, name, age,parent_id, sex, bicyclecolor, created_at, version) values (1,'Hadi',7,1, 'MALE', 'BLACK', '2018-05-20 00:00:00', 0);
insert into children(id, name, age,parent_id, sex, bicyclecolor, created_at, version) values (2,'DAVID',3,1,'MALE', 'WHITE', '2018-05-20 00:00:00', 0);
insert into children(id, name, age,parent_id, sex, haircolor, created_at, version) values (3,'SHIRIN',29,3,'FEMALE', 'BROWN', '2018-05-20 00:00:00', 0);
insert into children(id, name, age,parent_id, sex, haircolor, created_at, version) values (4,'ELY',40,4,'FEMALE', 'blond', '2018-05-20 00:00:00', 0);


insert into meals(id, name, child_id, created_at, version) values (1,'Kebap',1,'2018-05-20 00:00:00', 0);
insert into meals(id, name, child_id, created_at, version) values (2,'Nudels',1,'2018-05-20 00:00:00', 0);
insert into meals(id, name, child_id, created_at, version) values (3,'Rice',1,'2018-05-20 00:00:00', 0);
insert into meals(id, name, child_id, created_at, version) values (4,'Pizza',2,'2018-05-20 00:00:00', 0);
