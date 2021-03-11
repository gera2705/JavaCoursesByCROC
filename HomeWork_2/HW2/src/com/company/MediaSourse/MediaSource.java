package com.company.MediaSourse;

import com.company.Composition;

/**
 * Абстактный класс MediaSource , описывает общие свойтва и поведение носителя музыкальных композиций
 * Содержит приватное поле - composition (музыкальная композиция)
 */
public abstract class MediaSource {

    private Composition composition;

    public MediaSource(Composition composition){
        this.composition = composition;
    }

    /**
     * getter для приватного поля composition
     * @return значение приватного поля composition
     */
    public Composition getComposition() {
        return composition;
    }

    /**
     * setter для приватного поля mediaSource
     * @param composition - в качестве аргумента передаем экземпляр класса Composition
     */
    public void setComposition(Composition composition) {
        this.composition = composition;
    }

    /**
     * Абстрактный метод getName() - метод получения имени музыкального носителя
     * @return строку содержащую имя музыкального носителя
     */
    public abstract String getName();

}
