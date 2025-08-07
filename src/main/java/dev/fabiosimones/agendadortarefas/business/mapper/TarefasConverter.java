package dev.fabiosimones.agendadortarefas.business.mapper;

import dev.fabiosimones.agendadortarefas.business.dto.TarefasDTO;
import dev.fabiosimones.agendadortarefas.infrastructure.entity.TarefasEntity;
import org.mapstruct.Mapper;

import java.util.List;

@Mapper(componentModel = "spring")
public interface TarefasConverter {
    TarefasEntity paraTarefaEntity(TarefasDTO tarefasDTO);

    TarefasDTO paraTarefaDTO(TarefasEntity tarefasEntity);

    List<TarefasEntity> paraListaTarefasEntity(List<TarefasDTO> tarefasDTOS);

    List<TarefasDTO> paraListaTarefasDTO(List<TarefasEntity> tarefasEntities);
}
