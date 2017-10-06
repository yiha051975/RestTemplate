CREATE SCHEMA user_schema;

CREATE TABLE IF NOT EXISTS user_schema.user_detail
(
  id SERIAL NOT NULL PRIMARY KEY,
  emailAddress varchar(255) NOT NULL,
  firstName varchar(255) NOT NULL,
  lastName varchar(255) NOT NULL,
  password varchar(255) NOT NULL,
  userName varchar(20) NOT NULL
);