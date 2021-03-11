package com.company.MediaSourse;

import com.company.Composition;

/**
 * Класс Vinyl - наследник MediaSource
 * Реализует методы родительского класса для носителя - "Виниловая пластинка"
 */
public class Vinyl extends MediaSource {

    public Vinyl(Composition composition) {
        super(composition);
    }

    /**
     * Метод getName() - метод получения имени музыкального носителя
     * @return строку "Виниловая пластинка"
     */
    @Override
    public String getName() {
        return "Виниловая пластинка";
    }
}
