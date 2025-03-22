const courseModel = require('./course');
const StudentModel = require('./student');

exports.createStudent = async (req, res) => {
    if (!req.body.email && !req.body.firstName && !req.body.lastName && !req.body.phone) {
        res.status(400).send({ message: "Content can not be empty!" });
    }

    const student = new StudentModel({
        email: req.body.email,
        phone: req.body.phone,
        firstName: req.body.firstName,
        lastName: req.body.lastName,
    });

    await student.save()
        .then(data => {
            res.send({
                message: "Student Created successfully",
                student: data
            });
        }).catch(err => {
            res.status(500).send({
                message: err.message || "Error creating student"
            });
        });
};

exports.createCourse = async (req, res) => {
    if (!req.body.name && !req.body.duration && !req.body.courseID && !req.body.discription) {
        res.status(400).send({ message: "Content can not be empty!" });
    }

    const course = new courseModel({
        courseID: req.body.courseID,
        name: req.body.name,
        discription: req.body.discription,
        duration: req.body.duration,
    });

    await course.save()
        .then(data => {
            res.send({
                message: "Course Created successfully",
                student: data
            });
        }).catch(err => {
            res.status(500).send({
                message: err.message || "Error creating Course"
            });
        });
};

exports.findStudentByID = async (req, res) => {
    try {
        const Student = await StudentModel.findById(req.params.id);
        res.status(200).json(Student);
    } catch (error) {
        res.status(404).json({ message: error.message });
    }
};

exports.findCourseByID = async (req, res) => {
    try {
        const Course = await courseModel.findById(req.params.courseID);
        res.status(200).json(Course);
    } catch (error) {
        res.status(404).json({ message: error.message });
    }
};

exports.findAllStudent = async (req, res) => {
    try {
        const Student = await StudentModel.find();
        res.status(200).json(Student);
    } catch (error) {
        res.status(404).json({ message: error.message });
    }
};

exports.findAllCourse = async (req, res) => {
    try {
        const Course = await courseModel.find();
        res.status(200).json(Course);
    } catch (error) {
        res.status(404).json({ message: error.message });
    }
};

exports.updateStudent = async (req, res) => {
    if (!req.body) {
        res.status(400).send({
            message: "Data to be updated cannot be empty"
        })
    }

    const ID = req.params.ID

    await StudentModel.findStudentByIdAndUpdate(id, req.body, { useFindAndModify: false })
        .then(data => {
            if (!data) {
                res.status(404).send({
                    message: 'Student not found'
                });
            } else {
                res.send({ message: "Student updated " })
            }
        }).catch(err => {
            res.status(500).send({
                message: err.message
            });
        });
};

exports.updateCourse = async (req, res) => {
    if (!req.body) {
        res.status(400).send({
            message: "Data to be updated cannot be empty"
        })
    }

    const courseID = req.params.courseID

    await courseModel.findCourseByIdAndUpdate(id, req.body, { useFindAndModify: false })
        .then(data => {
            if (!data) {
                res.status(404).send({
                    message: 'Course not found'
                });
            } else {
                res.send({ message: "Course updated " })
            }
        }).catch(err => {
            res.status(500).send({
                message: err.message
            });
        });
};

exports.deleteStudent = async (req, res) => {
    await StudentModel.findStudentByIdAndDelete(req.params.id)
        .then(data => {
            if (!data) {
                res.status(404).send({
                    message: "Student not found"
                });
            }
        }).catch(err => {
            res.status(500).send({
                message: err.message
            });
        });
};

exports.deleteCourse = async (req, res) => {
    await courseModel.findCourseByIdAndDelete(req.params.id)
        .then(data => {
            if (!data) {
                res.status(404).send({
                    message: "Course not found"
                });
            }   
        }).catch(err => {
            res.status(500).send({
                message: err.message
            });
        });
};


exports.findAjinkya =async(req,res)=>{};