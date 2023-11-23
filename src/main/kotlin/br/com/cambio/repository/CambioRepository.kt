package br.com.cambio.repository

import br.com.cambio.model.Cambio
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.stereotype.Repository

@Repository
interface CambioRepository : JpaRepository<Cambio, Long?> {

    fun findByFromAndTo(from: String, to: String): Cambio?
}