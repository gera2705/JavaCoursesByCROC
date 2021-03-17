package com.company;

/**
 * Класс ChessBoard - "Шахмотная доска"
 */
public class ChessBoard implements Name{

    private static final int SIZE_BY_X = 8;
    private static final int SIZE_BY_Y = 8;

    @Override
    public String getName() {
        return "Шахмотная доска";
    }


    /**
     * Вложенный класс - "Клетка шахмотной доски"
     */
    static class Cell extends ChessBoard{
        private int x;
        private int y;
        private final char[] CELL_SYMBOLS = new char[]{'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h'};

        /**
         * Конструктор без аргументов (по умолчанию координата клетки 1 и 1 => a1)
         */
        // Самая нижняя левая клетка имеет координату a1
        // (в задании написано 1 и 1 = b2 , я посчитал что вести отчет с 0 и 0 не очень удобно для пользователя, поэтому сделал отчет с 1 и 1)
        public Cell(){
            this.x = 1;
            this.y = 1;
        }

        public Cell(int x , int y) {
            try {
                if(x < 1 || x > SIZE_BY_X || y < 1 || y > SIZE_BY_Y){
                    throw new ChessBoardCellException();
                }
                this.x = x;
                this.y = y;
            }catch (ChessBoardCellException exception){
                System.out.println("Ошибка при создании клетки");
                exception.printStackTrace();
            }

        }

        public int getX() {
            return x;
        }

        public void setX(int x){

            try {
                if(x < 1 || x > SIZE_BY_X) {
                    throw new ChessBoardCellException();
                }
                this.x = x;
            }catch (ChessBoardCellException e){
                System.out.println("Не допустимая координата X");
                e.printStackTrace();
            }

        }

        public int getY() {
            return y;
        }

        public void setY(int y){
            try {
                if(y < 1 || SIZE_BY_Y > 8) {
                    throw new ChessBoardCellException();
                }
                this.y = y;
            }catch (ChessBoardCellException e){
                System.out.println("Не допустимая координата Y");
                e.printStackTrace();
            }

        }

        /**
         * Метод для проверки находится ли клетка на территории доски
         * @param x Координата X
         * @param y Координата Y
         * @return возвращает истину есть клетка находится в диапозоне по X и Y [1,8] (т.к поле размером 8 на 8)
         */
        public boolean checkCell(int x , int y){
            return x > 0 && y > 0 && x < 9 && y < 9;
        }


        /**
         * Метод преобразует координаты X и Y в строчное представление
         * @return строку с координатами (x в буквенном формате)
         */
        @Override
        public String toString(){
            return convertXToLetter(x) + "" + y + " ";
        }

        /**
         * Метод преобразует координаты X и Y в строчное представление (имеет входные параметры, метод нужен для работы с классами "Шахматные фигуры")
         * @param x Координата X
         * @param y Координата Y
         * @return строку с координатами (x в буквенном формате)
         */
        public String toString(int x , int y){
            try {
                if(x < 1 || x > SIZE_BY_X || y < 1 || y > SIZE_BY_Y){
                    throw new ChessBoardCellException();
                }
                return convertXToLetter(x) + "" + y + " ";
            }catch (ChessBoardCellException e){
                System.out.println("Не удалось преобразовать координаты в строчное представление");
                e.printStackTrace();
            }
           return null;
        }

        /**
         * Метод для преобразования X в букву
         * @param x Координата X
         * @return символ эквивалентный циферной координаты X
         */
        private Character convertXToLetter(int x){
            try {
                if(x < 1 || x > SIZE_BY_X) {
                    throw new ChessBoardCellException();
                }
                return CELL_SYMBOLS[x-1];
            } catch (ChessBoardCellException e) {
                System.out.println("Не удалось преобразовать координату X в букву");
                e.printStackTrace();
            }

            return null;

        }

        @Override
        public String getName(){
            return "Клетка шахмотной доски";
        }


    }

}

/**
 * Класс Исключение "Ошибка клетки шахмотной доски" - наследуется от IllegalAccessException
 */
class ChessBoardCellException extends IllegalAccessException{

    /**
     * Переопрееленный метод toString
     * @return строку с ошибкой
     */
    @Override
    public String toString(){
        return "Ошибка! Использованы не корректные координаты";
    }


}
