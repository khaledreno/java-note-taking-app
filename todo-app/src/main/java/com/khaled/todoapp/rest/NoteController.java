package com.khaled.todoapp.rest;


import com.khaled.todoapp.entity.Note;
import com.khaled.todoapp.service.NoteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class NoteController {

    private NoteService noteService;

    @Autowired
    public NoteController(NoteService noteService) {
        this.noteService = noteService;
    }

    @GetMapping("/notes")
    public List<Note> findAllNotes(){
        return noteService.findAllNotes();
    }

    @GetMapping("/notes/{id}")
    public Optional<Note> findNote(@PathVariable int id) {
        if (noteService.findNote(id) == null){
            throw new RuntimeException("the note with id "+id+" is not found");}

        else
            return noteService.findNote(id);
    }

    @PostMapping("/notes")
    public Note AddNote(@RequestBody Note note){
        note.setId(0);
        noteService.AddNote(note);
        return note;
    }

    @PutMapping("/notes")
    public Note UpdateNote(@RequestBody Note note){
        noteService.AddNote(note);
        return note;
    }


    @DeleteMapping("/notes/{id}")
    public String deletNote(@PathVariable int id){
    Optional<Note> note = noteService.findNote(id);

    if (note == null){
        throw new RuntimeException("this note is not found");}

        noteService.deletNotebyID(id);
        return "note deleted ";
    }


    }

