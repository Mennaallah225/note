package com.springmvcproject.stickynotes.model.mapper;

import com.springmvcproject.stickynotes.model.dto.AddStickyNoteDTO;
import com.springmvcproject.stickynotes.model.dto.StickyNoteDTO;
import com.springmvcproject.stickynotes.model.dto.UpdateStickyNoteDTO;
import com.springmvcproject.stickynotes.model.entity.StickyNoteEntity;
import org.mapstruct.Mapper;

import java.util.List;

@Mapper(componentModel = "spring")
public interface StickyNoteMapper {
    StickyNoteDTO toDto(StickyNoteEntity entity);

    StickyNoteEntity toEntity(StickyNoteDTO dto);

    List<StickyNoteEntity> toEntities(List<StickyNoteDTO> dtos);

    List<StickyNoteDTO> toDtos(List<StickyNoteEntity> entities);

    StickyNoteEntity toEntity(AddStickyNoteDTO dto);

    AddStickyNoteDTO toAddDto(StickyNoteEntity savedEntity);

    StickyNoteEntity toEntity(UpdateStickyNoteDTO dto);
}
