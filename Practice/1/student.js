const { number } = require('joi');
var mongoose = require('mongoose');

var studentSchema = new mongoose.Schema({
    email: {
        type: String,
        require: true,
        unique: true
    },
    firstName: {
        type: String,
        require: true
    },
    lastName: {
        type: String,
        require: true
    },
    phone: {
        type: number,
        require: true
    },
    age: number,
})

var student = new mongoose.model('Student', schema);
module.exports = student;   