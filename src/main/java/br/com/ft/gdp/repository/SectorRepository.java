package br.com.ft.gdp.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.ft.gdp.models.domain.Sector;

/**
 * Classe SectorRepository.java
 * 
 * @author <a href="mailto:carolexc@gmail.com">Caroline Aguiar</a>
 *
 * @since 13 Dez, 2019
 */
@Repository
public interface SectorRepository extends JpaRepository<Sector, Long> {

    List<Sector> findBySuperSectorIsNull();
}
