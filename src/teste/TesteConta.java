package teste;

//@author emanu
import br.com.controle.Cliente;
import br.com.controle.Conta;
import br.com.controle.ContaCorrente;
import br.com.controle.ContaPoupanca;
import br.com.entidade.ContaDAO;
import java.time.LocalDate;

public class TesteConta {
//testando inserir conta
    public static void main(String[] args) throws Exception {
        
//          Cliente c = new Cliente();
//            c.setCpf_usuario("99999");
//
//            ContaCorrente cc = new ContaCorrente();
//
//            cc.setNumero_conta(202020);
//            cc.setCliente(c);
//            cc.setAgencia_conta("103");
//            cc.setDataVencimento(LocalDate.parse("2024-10-06"));
//            cc.setSaldo_conta(50480);
//            cc.setTipo_conta("CORRENTE");
//            cc.setLimite(1000);
//
//            ContaDAO.save(cc);


//        ContaCorrente c = (ContaCorrente) ContaDAO.findByClienteId(2);
//        System.out.println(" "+ c.getAgencia_conta());    
        
        
        boolean confirma = ContaDAO.delete(1);
        System.out.println(" "+ confirma);
    
    }
}
