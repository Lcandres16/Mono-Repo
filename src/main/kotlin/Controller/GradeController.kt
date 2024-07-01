package Controller

import Repository.GradeRepository
import model.Grade
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/grades")
class GradeController(private val gradeRepository: GradeRepository) {

    @GetMapping
    fun list(): List<Grade> = gradeRepository.findAll()
}