package br.com.magiclibray.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.magiclibray.domain.Card;

public interface CardRepository extends JpaRepository<Card, Integer>{

}
