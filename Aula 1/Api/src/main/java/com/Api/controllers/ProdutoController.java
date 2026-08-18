package com.Api.controllers;

import com.Api.entities.Produto;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("produtos")
public class ProdutoController {

    private List<Produto> produtos = new ArrayList();

    @GetMapping /* http://localhost:8080/produtos */
    public ResponseEntity<List<Produto>> getProdutos() {
       return ResponseEntity.status(HttpStatus.OK).body(produtos);
    }

    @GetMapping("/{id}")  /* http://localhost:8080/produtos/10 */
    public ResponseEntity<?> getUmProduto(@PathVariable long id) {
        for (Produto prod : produtos) {
            if (prod.getId() == id) {
                return ResponseEntity.status(HttpStatus.OK).body(prod);
            }
        }
        return ResponseEntity.status(HttpStatus.BAD_REQUEST).body("Produto não encontrado");
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<?> deletar(@PathVariable long id) {
        for(Produto prod : produtos) {
            if (prod.getId() == id) {
                produtos.remove(prod);
                return ResponseEntity.status(HttpStatus.NO_CONTENT).build();
            }
        }
        return ResponseEntity.status(HttpStatus.BAD_REQUEST).body("Produto não encontrado");
    }

    @PostMapping
    public ResponseEntity<?> salvar(@RequestBody Produto produto) {
        produto.setId(produtos.size() + 1l);
        produtos.add(produto);
        return ResponseEntity.ok(produto);
    }

    @PutMapping("/{id}")
    public ResponseEntity<?> alterar(@PathVariable long id, @RequestBody Produto produto) {
        for (Produto prod : produtos) {
            if (prod.getId() == id) {
                prod.setDescricao(produto.getDescricao());
                prod.setPreco(produto.getPreco());
                prod.setEstoque(produto.getEstoque());
                return ResponseEntity.status(HttpStatus.OK).body(prod);
            }
        }
        return ResponseEntity.status(HttpStatus.BAD_REQUEST).body("Produto não encontrado");
    }


}

/*
 *  201 - created
 *  404 - not found
 */
