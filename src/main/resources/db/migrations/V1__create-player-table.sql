CREATE EXTENSION IF NOT EXISTS "pgcrypto";

CREATE TABLE player (
   id UUID DEFAULT gen_random_uuid() PRIMARY KEY,
   name VARCHAR(100) NOT NULL,
   nationality VARCHAR(50) NOT NULL,
   position VARCHAR(50) NOT NULL,
   shirt_number INT,
   overall_rate INT NOT NULL,
   attack INT,
   defence INT
)