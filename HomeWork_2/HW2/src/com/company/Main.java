package com.company;

import com.company.ReproductionDevice.CDPlayer;
import com.company.ReproductionDevice.UniversalPlayer;
import com.company.ReproductionDevice.VinylTurntable;
import com.company.MediaSourse.CD;
import com.company.MediaSourse.USB;
import com.company.MediaSourse.Vinyl;

public class Main{

    /**
     * Константа для разделения выводимой информации (для более легкого восприятия выводимой информации)
     */
    public static final String SEPARATOR = "---------------------------------------------------------------------------------";


    public static void main(String[] args) {

        Composition composition1 = new Composition("\"Loqiemean\"" , "\"Хоровод\"");
        Composition composition2 = new Composition("\"Гражданская оборона\"" , "\"Долгая счастливая жизнь\"");
        Composition composition3 = new Composition("\"ATL\"" , "\"Ной\"");

        CD cd = new CD(composition1);
        Vinyl vinyl = new Vinyl(composition2);
        USB usb = new USB(composition3);

        VinylTurntable vinylTurntable = new VinylTurntable(vinyl);
        System.out.println(vinylTurntable.playMusic() + "\n");
        vinyl.setComposition(composition3);
        System.out.println(vinylTurntable.playMusic() + "\n");

        vinylTurntable.setMediaSource(cd);
        System.out.println(vinylTurntable.playMusic() + "\n");

        vinylTurntable.setMediaSource(usb);
        System.out.println(vinylTurntable.playMusic() + "\n");

        System.out.println(SEPARATOR);

        CDPlayer cdPlayer = new CDPlayer(cd);
        System.out.println(cdPlayer.playMusic() + "\n");

        cdPlayer.setMediaSource(usb);
        System.out.println(cdPlayer.playMusic() + "\n");

        cdPlayer.setMediaSource(vinyl);
        System.out.println(cdPlayer.playMusic() + "\n");

        System.out.println(SEPARATOR);

        UniversalPlayer universalPlayer = new UniversalPlayer(vinyl);
        System.out.println(universalPlayer.playMusic() + "\n");

        universalPlayer.setMediaSource(usb);
        System.out.println(universalPlayer.playMusic() + "\n");

        universalPlayer.setMediaSource(cd);
        System.out.println(universalPlayer.playMusic() + "\n");

    }
}
