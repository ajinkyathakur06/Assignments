const mongoose = require('mongoose');

const bookSchema = new mongoose.Schema({
  id: {
    type: String,
    required: [true, 'ID is required'],
    unique: true,
  },
  title: {
    type: String,
    required: [true, 'Title is required'],
    minlength: [3, 'Title must be at least 3 characters'],
  },
  author: {
    type: String,
    required: [true, 'Author is required'],
    minlength: [3, 'Author must be at least 3 characters'],
  },
  price: {
    type: Number,
    required: [true, 'Price is required'],
    min: [0, 'Price must be a positive number'],
  },
  publishedYear: {
    type: Number,
    required: [true, 'Published Year is required'],
    min: [2000, 'Published Year must be at least 2000'],
    max: [2025, 'Published Year must be at most 2025'],
  },
});

module.exports = mongoose.model('Book', bookSchema);