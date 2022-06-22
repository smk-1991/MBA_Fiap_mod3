package br.com.fiap.livraria.service;

import br.com.fiap.livraria.model.dto.CreateUpdateLivroDTO;
import br.com.fiap.livraria.model.dto.LivroDTO;
import br.com.fiap.livraria.model.dto.UpdatePrecoLivroDTO;

import java.util.List;

public interface LivrariaService {

    List<LivroDTO> listarTodos();

    List<LivroDTO> listarLivro(String titulo);

    LivroDTO buscarLivroPorId(Integer id);

    LivroDTO criar(CreateUpdateLivroDTO createUpdateLivroDTO);

    LivroDTO atualizar(Integer id, CreateUpdateLivroDTO createUpdateLivroDTO);

    LivroDTO atualizarPreco(Integer id, UpdatePrecoLivroDTO updatePrecoLivroDTO);

    void deletarLivro(Integer id);


}