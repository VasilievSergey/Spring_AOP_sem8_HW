package ru.gb.Spring_AOP_sem8_HW.repository;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import ru.gb.Spring_AOP_sem8_HW.model.Note;

import java.util.Optional;

@Repository
public interface NoteRepo extends JpaRepository<Note, Long> {

    /**
     * Найти заметку по id
     * @param id must not be {@literal null}.
     * @return возвращает заметку.
     */
    Optional<Note> findById(Long id);
}