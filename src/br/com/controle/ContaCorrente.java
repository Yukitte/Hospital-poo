package br.com.controle;

import java.time.LocalDate;
import java.util.Date;

public class ContaCorrente extends Conta{
    private double limite;
    private LocalDate dataVencimento;

    public double getLimite() {
        return limite;
    }

    public void setLimite(double limite) {
        this.limite = limite;
    }

    public LocalDate getDataVencimento() {
        return dataVencimento;
    }

    public void setDataVencimento(LocalDate dataVencimento) {
        this.dataVencimento = dataVencimento;
    }

    public double consultarLimite() {
        Date atual = new Date(System.currentTimeMillis());

//        if (atual.before(dataVencimento)) {
//            return this.limite;
//        } else {
//            return 0;
//        }
        return 0;
    }
}
