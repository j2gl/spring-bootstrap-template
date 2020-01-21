DROP TABLE IF EXISTS city;

CREATE TABLE city
(
    id      int primary key auto_increment,
    name    VARCHAR(255),
    state   VARCHAR(2),
    country VARCHAR(2)
);

INSERT INTO city (name, state, country) VALUES ('San Francisco', 'CA', 'US');
