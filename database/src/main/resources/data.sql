create table person
    (
        id integer not null,
        name varchar(255) not null,
        location varchar(255),
        birth_date varchar(12),
        primary key (id)
);

create table officials
    (
        id integer not null,
        name varchar(255) not null,
        office_location varchar(255) not null,
        joining_date varchar(12),
        primary key (id)
);