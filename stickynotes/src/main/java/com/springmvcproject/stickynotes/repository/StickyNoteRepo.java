package com.springmvcproject.stickynotes.repository;

import com.springmvcproject.stickynotes.model.entity.StickyNoteEntity;
import com.springmvcproject.stickynotes.model.enums.StickyNoteStatus;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface StickyNoteRepo extends JpaRepository<StickyNoteEntity, Long> {
    List<StickyNoteEntity> findAllByStatus(StickyNoteStatus status);
}
