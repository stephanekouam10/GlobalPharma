package com.example.globalpharma.Views;

public class Actusante {

    public String Titre;
    public int Image;
    public String Description;


    public Actusante(String titre, int image, String description) {
        Titre = titre;
        Image = image;
        Description = description;
    }

    public String getTitre() {
        return Titre;
    }

    public void setTitre(String titre) {
        Titre = titre;
    }

    public int getImage() {
        return Image;
    }

    public void setImage(int image) {
        Image = image;
    }

    public String getDescription() {
        return Description;
    }

    public void setDescription(String description) {
        Description = description;
    }


}
