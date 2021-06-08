package br.com.alura.loja;

public class DomainException extends RuntimeException {



    public DomainException(String mensagem) {
        super(mensagem);
    }
}
