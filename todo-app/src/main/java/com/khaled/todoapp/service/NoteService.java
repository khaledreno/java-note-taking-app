package com.khaled.todoapp.service;

import com.khaled.todoapp.dao.user.NoteModel;
import com.khaled.todoapp.entity.Note;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;
import java.util.Optional;

@Service
public class NoteService {

    private NoteModel noteModel;

    @Autowired
    public NoteService(NoteModel noteModel) {
        this.noteModel = noteModel;
    }

    public List<Note> findAllNotes() {
        return noteModel.findAll();
    }

    public void AddNote(Note note) {
        noteModel.save(note);
        }

    public Optional<Note> findNote(@PathVariable int id) {
        if (noteModel.findById(id) == null){
            throw new RuntimeException("the note with id "+id+" is not found");}

        else
        return noteModel.findById(id);
    }

    public void deletNotebyID(int id){
        noteModel.deleteById(id);
    }
}
