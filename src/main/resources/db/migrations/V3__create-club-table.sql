CREATE EXTENSION IF NOT EXISTS "pgcrypto";

CREATE TABLE club (
   id UUID DEFAULT gen_random_uuid() PRIMARY KEY,
   name VARCHAR(50) NOT NULL,
   country VARCHAR(50) NOT NULL,
   city VARCHAR(50) NOT NULL,
   stadium VARCHAR(50) NOT NULL,
   manager VARCHAR(50) NOT NULL,
   kit_color VARCHAR(50) NOT NULL
);

ALTER TABLE player
ADD COLUMN club_id UUID;

ALTER TABLE player
ADD CONSTRAINT fk_club
FOREIGN KEY (club_id) REFERENCES club(id);