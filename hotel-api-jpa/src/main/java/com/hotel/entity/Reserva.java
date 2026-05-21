package com.hotel.entity;
import jakarta.persistence.*;
import java.time.LocalDate;
@Entity
@Table(name = "reservas")
public class Reserva {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String nome;
    private String sexo;
    private String email;
    @Column(name = "data_chegada")
    private LocalDate dataChegada;
    @Column(name = "numero_noites")
    private Integer numeroNoites;
    @Column(name = "numero_hospedes")
    private Integer numeroHospedes;
    private String mensagem;
    public Integer getId() { return id; }
    public void setId(Integer id) { this.id = id; }
    public String getNome() { return nome; }
    public void setNome(String nome) { this.nome = nome; }
    public String getSexo() { return sexo; }
    public void setSexo(String sexo) { this.sexo = sexo; }
    public String getEmail() { return email; }
    public void setEmail(String email) { this.email = email; }
    public LocalDate getDataChegada() { return dataChegada; }
    public void setDataChegada(LocalDate dataChegada) { this.dataChegada = dataChegada; }
    public Integer getNumeroNoites() { return numeroNoites; }
    public void setNumeroNoites(Integer numeroNoites) { this.numeroNoites = numeroNoites; }
    public Integer getNumeroHospedes() { return numeroHospedes; }
    public void setNumeroHospedes(Integer numeroHospedes) { this.numeroHospedes = numeroHospedes; }
    public String getMensagem() { return mensagem; }
    public void setMensagem(String mensagem) { this.mensagem = mensagem; }
}
