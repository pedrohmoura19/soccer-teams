CREATE EXTENSION IF NOT EXISTS "pgcrypto"

CREATE TABLE player (
   id UUID DEFAULT gen_random_uuid() PRIMARY_KEY,
   name VARCHAR(100) NOT NULL,
   nationality VARCHAR(50) NOT NULL,
   position VARCHAR(50) NOT NULL,
   shirtNumber INT,
   overallRate INT NOT NULL,
   attack INT,
   defence INT,
)