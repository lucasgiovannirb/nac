package br.com.fiap.intencaofinanciamento.services;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import br.com.fiap.intencaofinanciamento.dto.IntencaoDTO;
import br.com.fiap.intencaofinanciamento.entities.Intencao;
import br.com.fiap.intencaofinanciamento.repositories.IntencaoRepository;

@Service
public class IntencaoService {

	private IntencaoRepository repository;
	
	@Transactional
	public IntencaoDTO save(IntencaoDTO dto) {
		Intencao entity = new Intencao();
		copyDtoToEntity(dto, entity);
		entity = repository.save(entity);
		return new IntencaoDTO(entity);
	}
	
	@Transactional(readOnly = true)
	public List<IntencaoDTO> findAll(){
		List<Intencao>intencoes = repository.findAll();
		return intencoes.stream().map(intencao -> new IntencaoDTO(intencao)).collect(Collectors.toList());
	}
	
	@Transactional
	public IntencaoDTO update(Long id, IntencaoDTO dto) {
		Intencao intencao = repository.findById(id).get();
		copyDtoToEntity(dto, intencao);
		intencao = repository.save(intencao);
		return new IntencaoDTO(intencao);
	}
	
	public void copyDtoToEntity(IntencaoDTO dto, Intencao entity) {
		entity.setCategoriaFinanciamento(dto.getCategoriaFinanciamento());
		entity.setCelular(dto.getCelular());
		entity.setCep(dto.getCep());
		entity.setCpf(dto.getCpf());
		entity.setDataNascimento(dto.getDataNascimento());
		entity.setEstado(dto.getEstado());
		entity.setLogradouro(dto.getLogradouro());
		entity.setNomeCliente(dto.getNomeCliente());
		entity.setNumero(dto.getNumero());
		entity.setRg(dto.getRg());
		entity.setTelefone(dto.getTelefone());
		entity.setValorIntencao(dto.getValorIntencao());
	}
}
