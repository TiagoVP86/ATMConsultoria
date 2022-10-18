package com.example.atmconsultoria.ui.sobre;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.atmconsultoria.R;

import mehdi.sakout.aboutpage.AboutPage;
import mehdi.sakout.aboutpage.Element;

public class SobreFragment extends Fragment {

  public SobreFragment() {

  }

  @Override
  public View onCreateView(LayoutInflater inflater, ViewGroup container,
                           Bundle savedInstanceState) {

    Element versao = new Element();
    versao.setTitle("Versão 1.0");

    return new AboutPage(getActivity())
        .setImage(R.drawable.logo)

        .addGroup("Entre em contato")
        .addEmail("atendimento@atmconsultoria.com", "Enviar um email")
        .addWebsite("https://www.google.com.br/", "Acesse nosso site")

        .addGroup("Redes Sociais")
        .addFacebook("the.medy", "Facebook")
        .addInstagram("https://www.instagram.com/", "Instagram")
        .addTwitter("https://twitter.com/?lang=pt-br", "Twiter")
        .addYoutube("https://www.youtube.com/", "You Tube")

        .addItem(versao)
        .create()
        ;

    //return inflater.inflate(R.layout.fragment_sobre, container, false);
  }
}