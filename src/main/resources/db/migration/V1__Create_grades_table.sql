CREATE TABLE grades (
 id SERIAL PRIMARY KEY,
 student_id BIGINT NOT NULL,
 subject VARCHAR(100) NOT NULL,
 grade INT NOT NULL,
 exam_date DATE NOT NULL,
 CONSTRAINT fk_student_id FOREIGN KEY (student_id) REFERENCES students(id)
);
