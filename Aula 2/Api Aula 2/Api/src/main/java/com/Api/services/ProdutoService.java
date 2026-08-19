package com.Api.services;

import com.Api.entities.Produto;
import com.Api.repositories.ProdutoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class ProdutoService {

    @Autowired
    private ProdutoRepository repository;

    private List<Produto> produtos = new ArrayList();

    public Produto salvar(Produto produto) {
        if(produto.getDescricao().isEmpty()) {
            throw new RuntimeException("A descrição deve ser informada");
        }

        if(produto.getPreco() < 0 ) {
            throw new RuntimeException("A o preço não pode ser negativo");
        }

        if(produto.getEstoque() < 0 ) {
            produto.setEstoque(1);
        }

        return repository.save(produto);
    }

    public List<Produto> consultar() {
        return repository.findAll();
    }

    public Produto getUm(Long id) {
        Optional<Produto> opt = repository.findById(id);
        Produto prod = opt.orElseThrow(() -> new RuntimeException("Produto não encontrado"));
        return null;
    }

    public Produto alterar(Long id, Produto produto) {
        Produto prod = getUm(id);

        prod.setDescricao(produto.getDescricao());
        prod.setPreco(produto.getPreco());
        prod.setEstoque(produto.getEstoque());

        return repository.save(prod);
    }

    public void excluir(Long id) {
        repository.deleteById(id);
    }
}
