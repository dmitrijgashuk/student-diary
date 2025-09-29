

CREATE TABLE students (
    id SERIAL PRIMARY KEY,
    first_name VARCHAR(100) NOT NULL,
    last_name VARCHAR(100) NOT NULL,
    student_age VARCHAR(10),
    is_active BOOLEAN NOT NULL DEFAULT TRUE
);