package com.company.ReproductionDevice;

import com.company.MediaSourse.CD;
import com.company.MediaSourse.MediaSource;
import com.company.MediaSourse.USB;

/**
 * Класс UniversalPlayer - наследник AudioReproducingDevice
 * Реализует методы родительского класса для Универсального проигрователя
 */
public class UniversalPlayer extends AudioReproducingDevice {

    public UniversalPlayer(MediaSource mediaSource) {
        super(mediaSource);
    }

    /**
     * Метод checkSource() - метод для проверки возможности воспроизведения композиции на универсальном проигрователе с предлогаемого носителя
     * @return true/false , true - если cd диск или usb флешка , false - если виниловая пластинка
     */
    @Override
    public boolean checkSource() {
        return getMediaSource().getClass() == CD.class || getMediaSource().getClass() == USB.class;
    }

    /**
     * Метод getName() - метод получения имени звуковоспроизводящего устройства
     * @return строку "Универсальный проигрователь"
     */
    @Override
    public String getName() {
        return "Универсальный проигрователь";
    }


}
