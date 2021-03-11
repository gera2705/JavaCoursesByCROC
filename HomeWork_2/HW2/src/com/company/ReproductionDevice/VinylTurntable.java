package com.company.ReproductionDevice;

import com.company.MediaSourse.MediaSource;
import com.company.MediaSourse.Vinyl;

/**
 * Класс VinylTurntable - наследник AudioReproducingDevice
 * Реализует методы родительского класса для Виниловой вертушки
 */
public class VinylTurntable extends AudioReproducingDevice {


    public VinylTurntable(MediaSource mediaSource) {
        super(mediaSource);
    }

    /**
     * Метод checkSource() - метод для проверки возможности воспроизведения композиции на виниловой вертушке с предлогаемого носителя
     * @return true/false , true - если виниловая пластинка  , false - если cd диск или usb флешка
     */
    @Override
    public boolean checkSource() {
        return getMediaSource().getClass() == Vinyl.class;
    }

    /**
     * Метод getName() - метод получения имени звуковоспроизводящего устройства
     * @return строку "Виниловая вертушка"
     */
    @Override
    public String getName() {
        return "Виниловая вертушка";
    }


}
