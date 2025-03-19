const mongoose = require('mongoose');

const studentSchema = new mongoose.Schema({
  id: {
    type: String,
    required: [true, 'ID is required'],
    unique: true,
  },
  name: {
    type: String,
    required: [true, 'Name is required'],
    minlength: [3, 'Name must be at least 3 characters'],
  },
  age: {
    type: Number,
    required: [true, 'Age is required'],
    min: [18, 'Age must be at least 18'],
    max: [30, 'Age must be at most 30'],
  },
  course: {
    type: String,
    required: [true, 'Course is required'],
    enum: {
      values: ['FY MCA', 'SY MCA', 'FY MBA', 'SY MBA'],
      message: 'Course must be either "FY MCA", "SY MCA", "FY MBA", or "SY MBA"',
    },
  },
  email: {
    type: String,
    required: [true, 'Email is required'],
    validate: {
      validator: function (value) {
        // Regex to validate email with at least two domain segments
        return /^[^\s@]+@[^\s@]+\.[^\s@]+$/.test(value);
      },
      message: 'Email must be a valid email address with at least two domain segments',
    },
  },
});

module.exports = mongoose.model('Student', studentSchema);