package com.estudos.Modelos;

public class FiltroRecomendacao {
    private String recomendacao;

    public void filter(Classificavel classificavel) {
        if (classificavel.getClassificacao() >= 4) {
            recomendacao = " Esta entre os preferidos do momento!";
            System.out.println(recomendacao);
        } else if (classificavel.getClassificacao() >= 2) {
            recomendacao = " Nao esta entre  os preferidos do momento!";
            System.out.println(recomendacao);
        } else {
            recomendacao = "Coloque na sua lista para assistir depois!";
            System.out.println(recomendacao);
        }
    }
}
