package ec.com.students.sofka.api.service;

import ec.com.students.sofka.api.domain.collection.Student;
import ec.com.students.sofka.api.domain.dto.StudentDTO;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

public interface IStudentService {

    Flux<StudentDTO> getAllStudents();

    Mono<StudentDTO> getStudentById(String Id);

    Mono<StudentDTO> saveStudent(StudentDTO studentDTO);

    Mono<StudentDTO> updateStudent(String Id, StudentDTO studentDTO);

    Mono<String> deleteStudent(String Id);

    // Mappers
    StudentDTO toDTO(Student student);

    Student toEntity(StudentDTO studentDTO);
}
