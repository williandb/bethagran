package com.betha.exemplo.exemplo.model;

import com.betha.exemplo.exemplo.enterprise.AbstractEntity;
import com.betha.exemplo.exemplo.enterprise.IPublicavel;

import java.util.Set;

import java.time.LocalDate;

public class Feed extends AbstractEntity implements IPublicavel {

    private ContaUsuario contaUsuario;
    private TipoPublicacao tipoPublicacao;
    private String linkPublicacaoS3;
    private LocalDate dataPublicacao;
    private String textoPublicacao;
    private Set<Comentario> comentarios;
    private Set<Curtida> curtidas;
    private LocalizacaoPostagem localizacaoPostagem;

    public ContaUsuario getContaUsuario() {
        return contaUsuario;
    }

    public void setContaUsuario(ContaUsuario contaUsuario) {
        this.contaUsuario = contaUsuario;
    }

    public TipoPublicacao getTipoPublicacao() {
        return tipoPublicacao;
    }

    public void setTipoPublicacao(TipoPublicacao tipoPublicacao) {
        this.tipoPublicacao = tipoPublicacao;
    }

    public String getLinkPublicacaoS3() {
        return linkPublicacaoS3;
    }

    public void setLinkPublicacaoS3(String linkPublicacaoS3) {
        this.linkPublicacaoS3 = linkPublicacaoS3;
    }

    public LocalDate getDataPublicacao() {
        return dataPublicacao;
    }

    public void setDataPublicacao(LocalDate dataPublicacao) {
        this.dataPublicacao = dataPublicacao;
    }

    public String getTextoPublicacao() {
        return textoPublicacao;
    }

    public void setTextoPublicacao(String textoPublicacao) {
        this.textoPublicacao = textoPublicacao;
    }

    @Override
    public Set<Comentario> getComentarios() {
        return comentarios;
    }

    public void setComentarios(Set<Comentario> comentarios) {
        this.comentarios = comentarios;
    }

    public Set<Curtida> getCurtidas() {
        return curtidas;
    }

    public void setCurtidas(Set<Curtida> curtidas) {
        this.curtidas = curtidas;
    }

    public LocalizacaoPostagem getLocalizacaoPostagem() {
        return localizacaoPostagem;
    }

    public void setLocalizacaoPostagem(LocalizacaoPostagem localizacaoPostagem) {
        this.localizacaoPostagem = localizacaoPostagem;
    }

    @Override
    public String toString() {
        return "Feed{" +
                "contaUsuario=" + contaUsuario +
                ", tipoPublicacao=" + tipoPublicacao +
                ", dataPublicacao=" + dataPublicacao +
                '}';
    }

    @Override
    public ContaUsuario getUsuarioPublicou() {
        return getUsuarioPublicou();
    }
}
