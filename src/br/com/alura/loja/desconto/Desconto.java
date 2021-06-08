package br.com.alura.loja.desconto;

import br.com.alura.loja.orcamento.Orcamento;

import java.math.BigDecimal;

public abstract class Desconto {

    protected Desconto proximo;

    public Desconto(Desconto proximo) {
        this.proximo = proximo;
    }
    //classe mãe ficou responsavel por aplicar o metodo de desconto e chamar o proximo
    public BigDecimal calcular(Orcamento orcamento) {
        if (deveAplicar(orcamento)) {
            return efetuarCalculo(orcamento);
        }
        return proximo.calcular(orcamento);
    }
        protected abstract BigDecimal efetuarCalculo (Orcamento orcamento);
        protected abstract boolean deveAplicar (Orcamento orcamento);


}
