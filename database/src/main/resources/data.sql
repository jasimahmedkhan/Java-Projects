create table PERSON
    (
        id integer not null,
        name varchar(255) not null,
        location varchar(255),
        birth_date varchar(12),
        primary key (id)
);

create table OFFICIALS
    (
        id integer not null,
        name varchar(255) not null,
        office_location varchar(255) not null,
        joining_date varchar(12),
        primary key (id)
);


INSERT INTO PERSON
    (ID, NAME, LOCATION, BIRTH_DATE)
VALUES (10001, 'Rameesh ahmed', 'Sukhar', '04-12-2018');

INSERT INTO PERSON
    (ID, NAME, LOCATION, BIRTH_DATE)
VALUES (10002, 'JASIM AHMED', 'KARACHI', '04-12-2019');

INSERT INTO PERSON
    (ID, NAME, LOCATION, BIRTH_DATE)
VALUES (10003, 'Qasim AHMED', 'Hyderabad', '04-12-2021');

INSERT INTO PERSON
    (ID, NAME, LOCATION, BIRTH_DATE)
VALUES (10004, 'Sultan AHMED', 'Quetta', '04-12-2021');

INSERT INTO PERSON
    (ID, NAME, LOCATION, BIRTH_DATE)
VALUES (10005, 'Rasool AHMED', 'Swat', '04-12-2019');