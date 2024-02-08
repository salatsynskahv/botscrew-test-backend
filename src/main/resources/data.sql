-- Insert Departments
INSERT INTO department (id, title) VALUES (1, 'Computer Science');
INSERT INTO department (id, title) VALUES (2, 'Electrical Engineering');
INSERT INTO department (id, title) VALUES (3, 'Business Administration');
INSERT INTO department (id, title) VALUES (4, 'Mathematics');
INSERT INTO department (id, title) VALUES (5, 'Physics');
INSERT INTO department (id, title) VALUES (6, 'Psychology');
INSERT INTO department (id, title) VALUES (7, 'History');
INSERT INTO department (id, title) VALUES (8, 'Languages');
INSERT INTO department (id, title) VALUES (9, 'Law');
INSERT INTO department (id, title) VALUES (10, 'Biology');

-- Insert Lecturers
INSERT INTO lector (id, name, degree) VALUES (1, 'Dr. John Smith', 'PROFESSOR');
INSERT INTO lector (id, name, degree) VALUES (2, 'Prof. Emily Johnson', 'ASSOCIATE_PROFESSOR');
INSERT INTO lector (id, name, degree) VALUES (3, 'Dr. Michael Williams', 'ASSISTANT');
INSERT INTO lector (id, name, degree) VALUES (4, 'Prof. Sarah Brown', 'PROFESSOR');
INSERT INTO lector (id, name, degree) VALUES (5, 'Dr. David Davis', 'ASSOCIATE_PROFESSOR');
INSERT INTO lector (id, name, degree) VALUES (6, 'Prof. Jennifer Wilson', 'PROFESSOR');
INSERT INTO lector (id, name, degree) VALUES (7, 'Dr. Jessica Taylor', 'ASSISTANT');
INSERT INTO lector (id, name, degree) VALUES (8, 'Prof. Andrew Martinez', 'ASSOCIATE_PROFESSOR');
INSERT INTO lector (id, name, degree) VALUES (9, 'Dr. Samantha Miller', 'ASSISTANT');
INSERT INTO lector (id, name, degree) VALUES (10, 'Prof. Christopher Anderson', 'PROFESSOR');

-- Associate Lecturers with Departments
-- Computer Science
INSERT INTO lector_department (lector_id, department_id) VALUES (1, 1);
INSERT INTO lector_department (lector_id, department_id) VALUES (2, 1);
INSERT INTO lector_department (lector_id, department_id) VALUES (3, 1);
-- Electrical Engineering
INSERT INTO lector_department (lector_id, department_id) VALUES (4, 2);
INSERT INTO lector_department (lector_id, department_id) VALUES (5, 2);
INSERT INTO lector_department (lector_id, department_id) VALUES (6, 2);
-- Business Administration
INSERT INTO lector_department (lector_id, department_id) VALUES (7, 3);
INSERT INTO lector_department (lector_id, department_id) VALUES (8, 3);
INSERT INTO lector_department (lector_id, department_id) VALUES (9, 3);
-- Mathematics
INSERT INTO lector_department (lector_id, department_id) VALUES (10, 4);
INSERT INTO lector_department (lector_id, department_id) VALUES (1, 4);
INSERT INTO lector_department (lector_id, department_id) VALUES (2, 4);
-- Physics
INSERT INTO lector_department (lector_id, department_id) VALUES (3, 5);
INSERT INTO lector_department (lector_id, department_id) VALUES (4, 5);
INSERT INTO lector_department (lector_id, department_id) VALUES (5, 5);
-- Psychology
INSERT INTO lector_department (lector_id, department_id) VALUES (6, 6);
INSERT INTO lector_department (lector_id, department_id) VALUES (7, 6);
INSERT INTO lector_department (lector_id, department_id) VALUES (8, 6);
-- History
INSERT INTO lector_department (lector_id, department_id) VALUES (9, 7);
INSERT INTO lector_department (lector_id, department_id) VALUES (10, 7);
INSERT INTO lector_department (lector_id, department_id) VALUES (1, 7);
-- Languages
INSERT INTO lector_department (lector_id, department_id) VALUES (2, 8);
INSERT INTO lector_department (lector_id, department_id) VALUES (3, 8);
INSERT INTO lector_department (lector_id, department_id) VALUES (4, 8);
-- Law
INSERT INTO lector_department (lector_id, department_id) VALUES (5, 9);
INSERT INTO lector_department (lector_id, department_id) VALUES (6, 9);
INSERT INTO lector_department (lector_id, department_id) VALUES (7, 9);
-- Biology
INSERT INTO lector_department (lector_id, department_id) VALUES (8, 10);
INSERT INTO lector_department (lector_id, department_id) VALUES (9, 10);
INSERT INTO lector_department (lector_id, department_id) VALUES (10, 10);
