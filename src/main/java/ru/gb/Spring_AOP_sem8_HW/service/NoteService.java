package ru.gb.Spring_AOP_sem8_HW.service;

import ru.gb.Spring_AOP_sem8_HW.model.Note;

import java.util.List;

public interface NoteService {

    Note createNote(Note note);

    List<Note> getAllNotes();

    Note getNoteById(Long id);

    Note updateNote(Note note);

    void deleteNote(Long id);
}