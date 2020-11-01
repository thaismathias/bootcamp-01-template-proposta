package com.proposta.criacaocartao;

import com.proposta.criacaobiometria.Biometria;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.List;
import java.util.Set;

@Entity
public class Cartao {

    @Id
    @NotBlank
    private String id;

    @NotNull
    private LocalDateTime emitidoEm;

    @NotBlank
    private String titular;

    @ElementCollection
    private Set<Bloqueios> bloqueios;

    @ElementCollection
    private Set<Avisos> avisos;

    @ElementCollection
    private Set<Carteiras> carteiras;

    @ElementCollection
    private Set<Parcelas> parcelas;

    private BigDecimal limite;

    @ElementCollection
    private Set<Renegociacao> renegociacao;

    @ElementCollection
    private Set<Vencimento> vencimento;

    private String idProposta;

    @OneToMany(cascade = CascadeType.ALL)
    private List<Biometria> biometrias;

    @Deprecated
    public Cartao() {}

    public Cartao(String id, @NotBlank LocalDateTime emitidoEm, @NotBlank String titular,
                  Set<Bloqueios> bloqueios, Set<Avisos> avisos, Set<Carteiras> carteiras,
                  Set<Parcelas> parcelas, BigDecimal limite, Set<Renegociacao> renegociacao,
                  Set<Vencimento> vencimento, String idProposta) {
        this.id = id;
        this.emitidoEm = emitidoEm;
        this.titular = titular;
        this.bloqueios = bloqueios;
        this.avisos = avisos;
        this.carteiras = carteiras;
        this.parcelas = parcelas;
        this.limite = limite;
        this.renegociacao = renegociacao;
        this.vencimento = vencimento;
        this.idProposta = idProposta;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public LocalDateTime getEmitidoEm() {
        return emitidoEm;
    }

    public void setEmitidoEm(LocalDateTime emitidoEm) {
        this.emitidoEm = emitidoEm;
    }

    public String getTitular() {
        return titular;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }

    public Set<Bloqueios> getBloqueios() {
        return bloqueios;
    }

    public void setBloqueios(Set<Bloqueios> bloqueios) {
        this.bloqueios = bloqueios;
    }

    public Set<Avisos> getAvisos() {
        return avisos;
    }

    public void setAvisos(Set<Avisos> avisos) {
        this.avisos = avisos;
    }

    public Set<Carteiras> getCarteiras() {
        return carteiras;
    }

    public void setCarteiras(Set<Carteiras> carteiras) {
        this.carteiras = carteiras;
    }

    public Set<Parcelas> getParcelas() {
        return parcelas;
    }

    public void setParcelas(Set<Parcelas> parcelas) {
        this.parcelas = parcelas;
    }

    public BigDecimal getLimite() {
        return limite;
    }

    public void setLimite(BigDecimal limite) {
        this.limite = limite;
    }

    public Set<Renegociacao> getRenegociacao() {
        return renegociacao;
    }

    public void setRenegociacao(Set<Renegociacao> renegociacao) {
        this.renegociacao = renegociacao;
    }

    public Set<Vencimento> getVencimento() {
        return vencimento;
    }

    public void setVencimento(Set<Vencimento> vencimento) {
        this.vencimento = vencimento;
    }

    public String getIdProposta() {
        return idProposta;
    }

    public void setIdProposta(String idProposta) {
        this.idProposta = idProposta;
    }

    public List<Biometria> getBiometrias() {
        return biometrias;
    }

    public void setBiometrias(List<Biometria> biometrias) {
        this.biometrias = biometrias;
    }
}