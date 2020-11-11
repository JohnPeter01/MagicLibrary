package br.com.magiclibray.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.magiclibray.domain.Set;

@Repository
public interface SetRepository extends JpaRepository<Set, Integer> {

}
