const express = require('express');
const {
  createBook,
  getAllBooks,
  getBookById,
  updateBook,
  deleteBook,
} = require('../controllers/bookController');

const router = express.Router();

// Create a new book
router.post('/books', createBook);

// Get all books
router.get('/books', getAllBooks);

// Get a book by ID
router.get('/books/:id', getBookById);

// Update a book by ID
router.put('/books/:id', updateBook);

// Delete a book by ID
router.delete('/books/:id', deleteBook);

module.exports = router;