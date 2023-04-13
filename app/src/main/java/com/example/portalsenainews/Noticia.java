package com.example.portalsenainews;

import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class Noticia {
    public String manchete, data, conteudoNews, autor, imagem;

    public Noticia(String manchete, String data, String conteudoNews, String autor, String imagem) {
        this.manchete = manchete;
        this.data = data;
        this.conteudoNews = conteudoNews;
        this.autor = autor;
        this.imagem = imagem;
    }
}
