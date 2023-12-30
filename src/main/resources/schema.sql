DROP TABLE IF EXISTS users;
CREATE TABLE users (
  "id" integer NOT NULL ,
  "username" varchar(255) NOT NULL,
  "password" varchar(255) NOT NULL,
  "email" varchar(255) NOT NULL,
  version INTEGER,
  PRIMARY KEY ("id")
);

-- INSERT INTO users (id, username, password, email)
-- VALUES (1, 'admin', 'admin', 'teste@gmail.com');