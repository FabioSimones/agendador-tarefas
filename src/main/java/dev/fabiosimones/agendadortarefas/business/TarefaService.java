package dev.fabiosimones.agendadortarefas.business;

import dev.fabiosimones.agendadortarefas.business.dto.TarefasDTO;
import dev.fabiosimones.agendadortarefas.business.mapper.TarefasConverter;
import dev.fabiosimones.agendadortarefas.infrastructure.entity.TarefasEntity;
import dev.fabiosimones.agendadortarefas.infrastructure.entity.enums.StatusNotificacaoEnum;
import dev.fabiosimones.agendadortarefas.infrastructure.repository.TarefasRepository;
import dev.fabiosimones.agendadortarefas.infrastructure.security.JwtUtil;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;

@Service
@RequiredArgsConstructor
public class TarefaService {

    private final TarefasRepository tarefasRepository;
    private final TarefasConverter tarefasConverter;
    private final JwtUtil jwtUtil;

    public TarefasDTO gravarTarefa(String token, TarefasDTO tarefasDTO){
        String email = jwtUtil.extrairEmailToken(token.substring(7));

        tarefasDTO.setDataCricao(LocalDateTime.now());
        tarefasDTO.setStatusNotificacaoEnum(StatusNotificacaoEnum.PENDENTE);
        tarefasDTO.setEmailUsuario(email);

        TarefasEntity entity = tarefasConverter.paraTarefaEntity(tarefasDTO);

        return tarefasConverter.paraTarefaDTO(tarefasRepository.save(entity));
    }
}
