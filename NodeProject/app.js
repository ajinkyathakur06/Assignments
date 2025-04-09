const express = require('express');
const mongoose = require('mongoose');
const Student = require('./student'); // Import the student model

const app = express();

// Middleware to parse JSON
app.use(express.json());

// Connect to MongoDB
mongoose.connect('mongodb://localhost:27017/school', {
    useNewUrlParser: true,
    useUnifiedTopology: true,
})
    .then(() => console.log('Connected to MongoDB'))
    .catch((err) => console.error('Error connecting to MongoDB:', err));

// POST /students - Create a new student
app.post('/students', async (req, res) => {
    const { id, name, age, course, email } = req.body;

    // Validate required fields
    if (!id || !name || !age || !course || !email) {
        return res.status(400).json({ error: 'All fields are required.' });
    }

    try {
        // Create a new student instance
        const newStudent = new Student({
            id,
            name,
            age,
            course,
            email,
        });

        // Save the student to the database
        await newStudent.save();

        res.status(201).json({ message: 'Student created successfully', student: newStudent });
    } catch (error) {
        if (error.code === 11000) {
            // Handle duplicate key error for unique fields
            return res.status(409).json({ error: 'Student with the same ID or email already exists.' });
        }
        res.status(500).json({ error: 'Internal Server Error', details: error.message });
    }
});

// Start the server
const PORT = process.env.PORT || 3000;
app.listen(PORT, () => {
    console.log(`Server is running on http://localhost:${PORT}`);
});

// Test route
app.get('/', (req, res) => {
    res.send('Server is running!');
});
