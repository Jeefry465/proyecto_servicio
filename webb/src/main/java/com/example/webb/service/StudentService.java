package com.example.webb.service;

import com.example.webb.model.Student;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.UUID;

@Service
public class StudentService {

    // Lista en memoria para almacenar estudiantes
    private List<Student> students = new ArrayList<>();

    // Crear algunos estudiantes de ejemplo al inicio
    public StudentService() {
        students.add(new Student("1", "Juan Pérez", "juan@email.com", 20, LocalDate.of(2003, 5, 15)));
        students.add(new Student("2", "María Gómez", "maria@email.com", 22, LocalDate.of(2001, 8, 22)));
        students.add(new Student("3", "Carlos López", "carlos@email.com", 19, LocalDate.of(2004, 3, 10)));
    }

    // Crear un nuevo estudiante
    public Student createStudent(Student student) {
        // Generar un ID único
        student.setId(UUID.randomUUID().toString());
        students.add(student);
        return student;
    }

    // Obtener todos los estudiantes
    public List<Student> getAllStudents() {
        return new ArrayList<>(students);
    }

    // Obtener estudiante por ID
    public Student getStudentById(String id) {
        Optional<Student> student = students.stream()
                .filter(s -> s.getId().equals(id))
                .findFirst();

        return student.orElse(null);
    }

    // Actualizar estudiante
    public Student updateStudent(String id, Student studentDetails) {
        for (int i = 0; i < students.size(); i++) {
            Student student = students.get(i);
            if (student.getId().equals(id)) {
                student.setName(studentDetails.getName());
                student.setEmail(studentDetails.getEmail());
                student.setAge(studentDetails.getAge());
                student.setBirthDate(studentDetails.getBirthDate());
                return student;
            }
        }
        return null;
    }

    // Eliminar estudiante
    public boolean deleteStudent(String id) {
        return students.removeIf(student -> student.getId().equals(id));
    }
}