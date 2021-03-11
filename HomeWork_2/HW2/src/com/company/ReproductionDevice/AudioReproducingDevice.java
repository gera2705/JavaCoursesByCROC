package com.company.ReproductionDevice;

import com.company.Composition;
import com.company.MediaSourse.MediaSource;

/**
 * Абстактный класс AudioReproducingDevice , описывает общие свойтва и поведение музыкального проигрователя
 * Содержит приватоное поле - mediaSource (музыкальный носитель)
 */
public abstract class AudioReproducingDevice {

    private MediaSource mediaSource;

    public AudioReproducingDevice(MediaSource mediaSource){
        this.mediaSource = mediaSource;
    }

    /**
     * getter для приватного поля mediaSource
     * @return значение приватного поля mediaSource
     */
    public MediaSource getMediaSource() {
        return mediaSource;
    }

    /**
     * setter для приватного поля mediaSource
     * @param mediaSource - в качестве аргумента передаем экземпляр класса MediaSource
     */
    public void setMediaSource(MediaSource mediaSource) {
        this.mediaSource = mediaSource;
    }

    /**
     * Метод playMusic() - это метод для воспроизведения музыки
     * @return строку с информацией о проигроваемой композиции или информацию об ошибке , в случае неудачного воспроизведения
     */
    public String playMusic(){
        Composition composition = mediaSource.getComposition();
        if(checkSource()) {
            return "Сейчас играет композиция - " + composition.getCompositionName() + ". Группа - " + composition.getGroupName() + "\n" +
                    "Носитель - " + mediaSource.getName() + "\n" +
                    "Проигрователь - " + getName();
        }else {
            return "Ошибка! " + getName() + " не может воспроизвести с носителя - " + getMediaSource().getName();
        }
    }

    /**
     * Абстрактный метод checkSource() - метод для проверки возможности воспроизведения композиции с предлогаемого носителя
     * @return true/false , true - возможно , false - невозможно
     */
    public abstract boolean checkSource();

    /**
     * Абстрактный метод getName() - метод получения имени звуковоспроизводящего устройства
     * @return строку содержащую имя звуковоспроизводящего устройства
     */
    public abstract String getName();

}
