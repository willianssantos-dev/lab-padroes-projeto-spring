package dev.willianssantos.gof.service;

import dev.willianssantos.gof.model.Cliente;

/**
 * Implementa o padrão de design Strategy para encapsular diferentes algoritmos ou comportamentos
 * relacionados à manipulação de clientes. Permite a seleção da estratégia em tempo de execução.
 *
 * @author Willians Santos
 */
public interface ClienteService {

	Iterable<Cliente> buscarTodos();

	Cliente buscarPorId(Long id);

	void inserir(Cliente cliente);

	void atualizar(Long id, Cliente cliente);

	void deletar(Long id);

}
