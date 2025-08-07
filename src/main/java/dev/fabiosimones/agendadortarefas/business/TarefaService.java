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
import java.util.List;

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

    public List<TarefasDTO> tarefasAgendadasPorPeriodo(LocalDateTime dataInicial, LocalDateTime dataFinal){
        return tarefasConverter.paraListaTarefasDTO
                (tarefasRepository.findByDataEventoBetween(dataInicial, dataFinal));
    }

    public List<TarefasDTO> buscaTarefasPorEmail(String token){
        String email = jwtUtil.extrairEmailToken(token.substring(7));
        List<TarefasEntity> listaTarefas = tarefasRepository.findByEmailUsuario(email);

        return tarefasConverter.paraListaTarefasDTO(listaTarefas);
    }
}
