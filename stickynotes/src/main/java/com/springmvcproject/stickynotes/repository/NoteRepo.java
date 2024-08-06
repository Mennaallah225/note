package com.springmvcproject.stickynotes.repository;

import com.springmvcproject.stickynotes.model.entity.NoteEntity;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface NoteRepo extends JpaRepository<NoteEntity, Long> {
    List<NoteEntity> findAllByStickyNoteIdOrderByIdDesc(Long id);
}
