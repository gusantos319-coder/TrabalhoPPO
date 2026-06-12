/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package util;



/**
 *
 * @author 
 */
public class FabricaConexao {
    public static Conexao getConexao(String tipo) {

        if (tipo.equalsIgnoreCase("mysql")) {
            return new ConexaoMySQL();
        }

        if (tipo.equalsIgnoreCase("postgres")) {
            return new ConexaoPostgres();
        }

        throw new IllegalArgumentException("Tipo de banco inválido");
    }
   

}
