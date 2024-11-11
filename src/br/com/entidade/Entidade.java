/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.entidade;
import br.com.controle.Hospital;
import java.sql.PreparedStatement;
import javax.swing.JOptionPane;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;


public class Entidade extends DAO{
public void inserir(Hospital h) throws Exception {
        try {
        abrirBanco();
        String query = "INSERT INTO hospital(codigo,nome,email,cpf)"
                + "values(null,?,?,?)";
        pst=(PreparedStatement) con.prepareStatement(query);
        pst.setString(1, h.getNome());
        pst.setString(2, h.getEmail());
        pst.setInt(3, h.getCpf());
        pst.execute();
        fecharBanco();
        }
        catch (Exception e){
            System.out.println("Erro " + e.getMessage());
            
        }
    }
     public ArrayList<Hospital> PesquisarTudo () throws Exception {
       ArrayList<Hospital> hosp = new ArrayList<Hospital>();
         try{
         abrirBanco();  
         String query = "select codigo, nome FROM Hospital";
         pst = (PreparedStatement) con.prepareStatement(query);
         ResultSet tr = pst.executeQuery();
         Hospital h ;
         while (tr.next()){               
           h = new Hospital();  
           h.setCodigo(tr.getInt("codigo"));
           h.setNome(tr.getString("nome"));
           h.setCpf(tr.getInt("cpf"));
           hosp.add(h);
         } 
         fecharBanco();
       }catch (Exception e){
           System.out.println("Erro " + e.getMessage());
     } 
       return hosp;
     }
}
