const express = require('express');
const {
  createStudent,
  getAllStudents,
  getStudentById,
  updateStudent,
  deleteStudent,
} = require('../controllers/studentController');

const router = express.Router();

// Create a new student
router.post('/students', createStudent);

// Get all students
router.get('/students', getAllStudents);

// Get a student by ID
router.get('/students/:id', getStudentById);

// Update a student by ID
router.put('/students/:id', updateStudent);

// Delete a student by ID
router.delete('/students/:id', deleteStudent);

module.exports = router;