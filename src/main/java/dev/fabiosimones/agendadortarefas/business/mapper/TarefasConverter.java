package dev.fabiosimones.agendadortarefas.business.mapper;

import dev.fabiosimones.agendadortarefas.business.dto.TarefasDTO;
import dev.fabiosimones.agendadortarefas.infrastructure.entity.TarefasEntity;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface TarefasConverter {
    TarefasEntity paraTarefaEntity(TarefasDTO tarefasDTO);

    TarefasDTO paraTarefaDTO(TarefasEntity tarefasEntity);
}
