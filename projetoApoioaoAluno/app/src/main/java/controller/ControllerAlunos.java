
package controller;

import java.sql.Connection;
import java.sql.PreparedStatement;
import model.Alunos;
import utilconnect.ConnectionCurso;

/**
 *
 * @author yuri 
 */
public class ControllerAlunos {
    
    
    
    
    public void salvar(Alunos alunos){
    String sql = "INSERT INTO alunos(nomecompleto,endereco,email,usuario,senha)VALUES(?,?,?,?,?)";
    Connection connection = null;
    PreparedStatement statement = null;
    try{
       connection = ConnectionCurso.getConnection();
       statement = connection.prepareStatement(sql);
       
       statement.setString(1, alunos.getNomecompleto());
       statement.setString(2, alunos.getEndereco());
       statement.setString(3, alunos.getEmail());
       statement.setString(4, alunos.getUsuario());
       statement.setString(5, alunos.getSenha());
       statement.execute();         
                      
    }catch(Exception ex){
        throw new RuntimeException("Erro ao Salvar no Banco de dados", ex);
    }finally{
        ConnectionCurso.closeConnection(connection,statement);
    }
    
       
    
    }
  
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
   
    
}
