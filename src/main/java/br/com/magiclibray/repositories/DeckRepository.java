package br.com.magiclibray.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.magiclibray.domain.Deck;

public interface DeckRepository extends JpaRepository<Deck, Integer> {

}
