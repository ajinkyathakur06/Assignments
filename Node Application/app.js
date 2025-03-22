const express = require('express');
const app = express();
const mongoose = require('mongoose');
//const articles = [{ title: 'Example' }];
const bodyParser = require('body-parser');

const Article = require('./models/models.js');

const mongoURI = 'mongodb://localhost:27017/practice_API';

// Connect to the database
mongoose.connect(mongoURI)
    .then(() => console.log('Connected to MongoDB'))
    .catch((err) => console.error('MongoDB connection error:', err));

app.set('port', process.env.PORT || 3000);

app.use(bodyParser.json());
app.use(bodyParser.urlencoded({ extended: true }));

app.get('/', (req, res) => {
    res.send('Hello World');
});

app.get('/articles', async (req, res, next) => {
    try {
        const articles = await Article.find();
        res.json(articles);
    } catch (err) {
        next(err);
    }
});

app.post('/articles', async (req, res, next) => {
    try {
        const article = new Article({ title: req.body.title });
        await article.save(); // Save the article to the database
        res.status(201).json(article); // Respond with the saved article
    } catch (err) {
        next(err); // Pass any errors to the error handler
    }
});


app.get('/articles/:id', async (req, res, next) => {
    try {
        const id = req.params.id;
        console.log('Fetching:', id);
        const article = await Article.findById(id); // Find the article by ID
        if (!article) {
            return res.status(404).json({ message: 'Article not found' }); // Handle not found
        }
        res.json(article); // Respond with the found article
    } catch (err) {
        next(err); // Handle any errors (e.g., invalid ID format)
    }
});


app.delete('/articles/:id', async (req, res, next) => {
    try {
        const id = req.params.id;
        console.log('Deleting:', id);
        const article = await Article.findByIdAndDelete(id); // Delete the article by ID
        if (!article) {
            return res.status(404).json({ message: 'Article not found' }); // Handle not found
        }
        res.json({ message: 'Deleted', article }); // Respond with the deleted article
    } catch (err) {
        next(err); // Handle any errors
    }
});


app.listen(app.get('port'), () => {
    console.log('App started on port', app.get('port'));
});