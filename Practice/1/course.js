const { number, string } = require('joi');
var mongoose = require('mongoose');

var courseSchema = new mongoose.Schema({
    courseID: {
        type: String,
        require: true,
        unique: true
    },
    name: {
        type: String,
        require: true
    },
    discription: string,
    duration: number,
});

var course = new mongoose.model('Student', schema);
module.exports = course;   