package com.company;

/**
 * Класс "Конь", наследник класса "Шахматная фигура"
 */
public class Knight extends ChessPiece implements Name {

    public Knight(ChessBoard.Cell chessBoard){
        super(chessBoard);
    }

    /**
     * Метод move - метод для генерации строки хранящей в себе координаты , всех возможный для перемещения, клеток
     * @return строку с координатами
     */
    @Override
    public String move() {

        try {

            int x = getLocation().getX();
            int y = getLocation().getY();

            if (!getLocation().checkCell(x , y)){
                throw new ChessBoardCellException();
            }


            String result;

            result = possibleCell(x - 2, y + 1);

            result = result + possibleCell(x - 2, y - 1);

            result = result + possibleCell(x + 2, y + 1);

            result = result + possibleCell(x + 2, y - 1);

            result = result + possibleCell(x + 1, y + 2);

            result = result + possibleCell(x - 1, y + 2);

            result = result + possibleCell(x + 1, y - 2);

            result = result + possibleCell(x - 1, y - 2);

            return result;
        }catch (ChessBoardCellException e) {
            e.printStackTrace();
        }
        return null;

    }

    /**
     * Метод possibleCell - метод для проверки возможно ли переместиться в клетку с координатами X и Y
     * @param x - Координата клетки X
     * @param y - Координата клетки Y
     * @return если перемещение возможно , то возвращает координаты клетки в строковом представлении (Например а4 , b1) ,
     * если не возможно , то пустую строку
     */
    public String possibleCell(int x , int y ){

        if(getLocation().checkCell(x, y )){
            return toString(x  , y );
        }else {
            return "";
        }
    }

    /**
     * Метод для получения имени фигуры
     * @return
     */
    @Override
    public String getName() {
        return "Конь";
    }
}
