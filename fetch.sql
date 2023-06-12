--Отримання всіх записів Homework
SELECT * FROM homework;

--Отримання всіх записів Lesson, включаючи дані Homework

SELECT * FROM lesson
JOIN homework ON hw_id = fk_homework_id;

--Отримання всіх записів Lesson (включаючи дані Homework) відсортовані за часом оновлення

SELECT * FROM lesson
JOIN homework ON hw_id = fk_homework_id
ORDER BY update_at;

--Отримання всіх записів Schedule, включаючи дані Lesson
SELECT * FROM schedule
JOIN lesson ON les_id = lesson_id;

--Отримання кількості Lesson для кожного Schedule
SELECT COUNT(lessons.lesson_id)
FROM schedule
JOIN lessons ON lessons.lesson_id = schedule.lesson_id;