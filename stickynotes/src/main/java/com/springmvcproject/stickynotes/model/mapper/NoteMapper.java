package com.springmvcproject.stickynotes.model.mapper;

import com.springmvcproject.stickynotes.model.dto.AddNoteDTO;
import com.springmvcproject.stickynotes.model.dto.NoteDTO;
import com.springmvcproject.stickynotes.model.entity.NoteEntity;
import org.mapstruct.Mapper;

import java.util.List;

@Mapper(componentModel = "spring")
public interface NoteMapper {
    NoteDTO toDTO(NoteEntity entity);

    NoteEntity toEntity(NoteDTO dto);

    List<NoteDTO> toDTOs(List<NoteEntity> entities);

    NoteEntity toEntity(AddNoteDTO dto);
}
