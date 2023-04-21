package model;

/**
 *
 * @author yuri 
 */
public class Alunos {
    private int id;
    private String nomecompleto;
    private String endereco;
    private String email;
    private String usuario; 
    private String  senha;
 
    
    
 public Alunos(){
     
     
 }   

 public int getId(){
     return id;
 }
 public void setId(int id){
     this.id =id;
 }
 
 
 
 public String getNomecompleto(){
     return nomecompleto;
 }
 
 public void setNomecompleto(String nomecompleto){
     this.nomecompleto = nomecompleto;
 }
 
 
 public String getEndereco(){
    return endereco;
}
 
 public void setEndereco(String endereco){
     this.endereco = endereco;
 }
 
 
public String getEmail() {
    return email;
}

public void setEmail(String email){
    this.email = email;
}



public String getUsuario(){
    return usuario;
} 
public void setUsuario(String usuario) {
    
    this.usuario = usuario;
}





public String getSenha(){
    return senha;
} 
 
 public void setSenha(String senha){
     this.senha = senha;
 }
 
 
 
 
    
}
