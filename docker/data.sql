CREATE DATABASE IF NOT EXISTS DOCKER_JOURNEY_APP;

USE DOCKER_JOURNEY_APP;

CREATE TABLE users(
    userId int NOT NULL AUTO_INCREMENT,
    name VARCHAR(255) NOT NULL,
    email VARCHAR(255) NOT NULL,
    PRIMARY KEY(userId)
);

INSERT INTO users(name, email) VALUES("Teddy", "thuandohusk65@gmail.com");
INSERT INTO users(name, email) VALUES("Kai", "minhduclk45@gmail.com");