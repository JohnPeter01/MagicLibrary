package br.com.magiclibray.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.magiclibray.domain.Format;

@Repository
public interface FormatRepository extends JpaRepository<Format, Integer> {

}
