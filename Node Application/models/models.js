const mongoose = require('mongoose');

// Define the schema
const articleSchema = new mongoose.Schema({
    title: { type: String, required: true }, // Existing field
    content: { type: String, required: true }, // New field
    author: { type: String, default: 'Anonymous' }, // New field with default value
    published: { type: Boolean, default: false }, // New field with default value
    tags: { type: [String], default: [] }, // New field for an array of tags
    createdAt: { type: Date, default: Date.now }, // Automatically set the creation date
});

// Create the model
const Article = mongoose.model('Article', articleSchema);

// Export the model
module.exports = Article;
