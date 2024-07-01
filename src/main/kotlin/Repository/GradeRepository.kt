package Repository

import model.Grade
import org.springframework.data.jpa.repository.JpaRepository

interface GradeRepository : JpaRepository<Grade, Long>
