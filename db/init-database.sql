CREATE DATABASE IF NOT EXISTS `spring_bootstrap` DEFAULT CHARACTER SET utf8mb4 COLLATE utf8mb4_unicode_520_ci;

-- User creation
DROP USER IF EXISTS `usrspringboot`@'127.0.0.1';
DROP USER IF EXISTS `usrspringboot`@'%';

CREATE USER `usrspringboot`@'127.0.0.1' IDENTIFIED BY 'secret';
CREATE USER `usrspringboot`@'%' IDENTIFIED BY 'secret';

GRANT ALL PRIVILEGES ON spring_bootstrap.* to usrspringboot@'127.0.0.1';
GRANT ALL PRIVILEGES ON spring_bootstrap.* to usrspringboot@'%';

FLUSH PRIVILEGES;

-- DDL
CREATE TABLE users
(
    id       INT         NOT NULL PRIMARY KEY AUTO_INCREMENT,
    username VARCHAR(50) NOT NULL,
    password VARCHAR(50) NOT NULL,
    enabled  TINYINT(1)  NOT NULL default 0
);

-- DATA
INSERT INTO users(username, password, enabled)
VALUES ('user', 'asdf1234', 1),
       ('admin', 'admin', 1);
