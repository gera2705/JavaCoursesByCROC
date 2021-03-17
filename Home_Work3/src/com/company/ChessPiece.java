package com.company;

/**
 * Абстрактный класс "Шахматная фигура" реализует Интерфейс Name
 */
public abstract class ChessPiece implements Name {

    //Поле хранящее координаты клетки на которой стоит фигура
    private ChessBoard.Cell location;

    public ChessPiece(ChessBoard.Cell cell){
        this.location = cell;
    }

    /**
     * Абстрактный метод для генерации строки хранящей в себе координаты , всех возможный для перемещения, клеток
     * @return строку с координатами
     */
    public abstract String move();

    /**
     * Метод получения имени
     * @return строку "Шахматная фигура"
     */
    @Override
    public String getName(){
        return "Шахматная фигура";
    }

    public ChessBoard.Cell getLocation() {
        return location;
    }

    public void setLocation(ChessBoard.Cell location) {
        this.location = location;
    }

    public String toString(int x , int y){
        return location.toString(x , y);
    }
}
