const express = require('express');
const CourseRegistration = require('./course')
const StudentRegistration = require('./student')

const router = express.Router();

//router.get('/', )

//student routes
router.get('/student', StudentRegistration.findAllStudent);
router.get('/student/:id', StudentRegistration.findStudentByID);
router.post('/studentRegistration', StudentRegistration.createStudent);
router.put('/student/:id', StudentRegistration.updateStudent);
router.delete('/student/:id', StudentRegistration.deleteStudent);

//course routes
router.get('/course', CourseRegistration.findAllCourse);
router.get('/course/:id', CourseRegistration.findCourseByID);
router.post('/courseRegistration', CourseRegistration.createCourse);
router.put('/course/:id', CourseRegistration.updateCourse);
router.delete('/course/:id', CourseRegistration.deleteCourse);



