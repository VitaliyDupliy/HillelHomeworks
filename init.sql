CREATE TABLE Homework
(
	hw_id SERIAL PRIMARY KEY,
	hw_name VARCHAR(50) NOT NULL,
	description TEXT NOT NULL
);

CREATE TABLE Lesson 
(
	les_id SERIAL PRIMARY KEY,
	les_name VARCHAR(50) NOT NULL,
	update_at TIMESTAMP DEFAULT CURRENT_TIMESTAMP,
	fk_homework_id INT REFERENCES Homework(hw_id) 
);

CREATE TABLE Schedule
(
	s_id SERIAL PRIMARY KEY,
	s_name VARCHAR(50) NOT NULL,
	update_at TIMESTAMP DEFAULT CURRENT_TIMESTAMP,
	lesson_id INT,
	CONSTRAINT fkey_to_lesson FOREIGN KEY(lesson_id) REFERENCES Lesson(les_id)
);

CREATE TABLE lessons
(
	schedule_id int REFERENCES Schedule(s_id),
	lesson_id int REFERENCES Lesson(les_id),
	CONSTRAINT schedule_lesson_pkey PRIMARY KEY(schedule_id, lesson_id)
);


 