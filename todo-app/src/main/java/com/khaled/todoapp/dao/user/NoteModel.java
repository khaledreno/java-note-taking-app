package com.khaled.todoapp.dao.user;

import com.khaled.todoapp.entity.Note;
import org.springframework.data.jpa.repository.JpaRepository;

public interface NoteModel extends JpaRepository <Note , Integer> {
}
