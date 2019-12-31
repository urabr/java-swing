
package util;

public enum OperacoesCrud {
    NOVO(1), EDITAR(2), EXCLUIR(3);
    
    private final Integer operacoes;
    
    private OperacoesCrud(Integer operacoes) {
        this.operacoes = operacoes;
    }

    public Integer getOperacoes() {
        return operacoes;
    }
}
