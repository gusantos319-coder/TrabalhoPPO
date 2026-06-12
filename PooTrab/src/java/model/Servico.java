/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author Usuario
 */
public class Servico implements IServico {
        
private int id;
private String tipo;
private String descricao;
private double preco ;
private String confirmPagamento;
private String dataGarantia ;
private String dataExecucao ;
private String clienteNome ;
private String clienteCpf;
private String clienteTelefone;
private String clienteIdade;

    public int getId() {
        return id;
    }

    public String getTipo() {
        return tipo;
    }

    public String getDescricao() {
        return descricao;
    }

    public double getPreco() {
        return preco;
    }

    public String getConfirmPagamento() {
        return confirmPagamento;
    }

    public String getDataGarantia() {
        return dataGarantia;
    }

    public String getDataExecucao() {
        return dataExecucao;
    }

    public String getClienteNome() {
        return clienteNome;
    }

    public String getClienteCpf() {
        return clienteCpf;
    }

    public String getClienteTelefone() {
        return clienteTelefone;
    }

    public String getClienteIdade() {
        return clienteIdade;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    // começo do Builder
    
    public Servico(){
        super();
    }
    
    public static ServicoBuilder getBuilder() {
        return new ServicoBuilder();
    }

    public static class ServicoBuilder {

        Servico ser = new Servico();

        public ServicoBuilder comId(int id) {
            ser.id = id;
            return this;
        }

        public ServicoBuilder comTipo(String tipo) {
            ser.tipo = tipo;
            return this;
        }

        public ServicoBuilder comDescricao(String descricao){
            ser.descricao = descricao;
            return this;
        }

        public ServicoBuilder comPreco(double preco){
            ser.preco = preco;
            return this;
        }

        public ServicoBuilder comConfirmPagamento(String confirmPagamento){
            ser.confirmPagamento = confirmPagamento;
            return this;
        }

        public ServicoBuilder comDataGarantia(String dataGarantia){
            ser.dataGarantia = dataGarantia;
            return this;
        }

        public ServicoBuilder comDataExecucao(String dataGarantia){
            ser.dataGarantia = dataGarantia;
            return this;
        }

        public ServicoBuilder comClienteNome(String clienteNome){
                ser.clienteNome = clienteNome;
                return this;
            }

        public ServicoBuilder comClienteCpf(String clienteCpf){
                ser.clienteCpf = clienteCpf;
                return this;
            }

        public ServicoBuilder comClienteTelefone(String clienteTelefone){
                ser.clienteTelefone = clienteTelefone;
                return this;
            }

        public ServicoBuilder comClienteIdade(String clienteIdade){
                ser.clienteIdade = clienteIdade;
                return this;
            }

        public Servico constroi() {
            return ser;
        }
    }


}
