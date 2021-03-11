package com.company.ReproductionDevice;

import com.company.MediaSourse.CD;
import com.company.MediaSourse.MediaSource;

/**
 * Класс CDPlayer - наследник AudioReproducingDevice
 * Реализует методы родительского класса для CD проигрователя
 */
public class CDPlayer extends AudioReproducingDevice {
    public CDPlayer(MediaSource mediaSource) {
        super(mediaSource);
    }

    /**
     * Метод checkSource() - метод для проверки возможности воспроизведения композиции на СД проигрователе с предлогаемого носителя
     * @return true/false , true - если cd диск   , false - если виниловая пластинка или usb флешка
     */
    @Override
    public boolean checkSource() {
        return getMediaSource().getClass() == CD.class;
    }

    /**
     * Метод getName() - метод получения имени звуковоспроизводящего устройства
     * @return строку "СД проигрователь"
     */
    @Override
    public String getName() {
        return "СД проигрователь";
    }


}
