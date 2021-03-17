package com.company;

/**
 * @author  Kolosov Slava
 * @version v1
 * Home work 3
 */
public class Main {

    public final static String MARK_UP = "//////////////////////////////////////////////////////////////////////";

    public static void main(String[] args)  {

        //Создаем клетку шахмотной доски (по умолчанию координата клетки X = 1 и Y = 1)
        ChessBoard.Cell cell = new ChessBoard.Cell();

        System.out.println("Координата клетки - " + cell.toString());

        System.out.println(MARK_UP);

        //Назначаем заведомо не корректную координату Y
        cell.setY(-3);

        System.out.println("Координата клетки - " + cell.toString());

        System.out.println(MARK_UP);

        //Создаем шахмотную фигуру - Конь, в клетке cell
        ChessPiece knight = new Knight(cell);

        //Выводим расположение фигуры на доске
        System.out.println("Координата фигуры " + "\"" + knight.getName() + "\" - " + knight.toString(knight.getLocation().getX() , knight.getLocation().getY()));

        System.out.println(MARK_UP);

        //Выводим клетки в которые может сходить конь
        System.out.println("Конем можно сходить в клетки - " + knight.move());

        System.out.println(MARK_UP);

        //Меняем координаты Коня, на заведомо не корректные
        knight.setLocation(new ChessBoard.Cell(-2 , -2));

        System.out.println(MARK_UP);

        //Меняем координаты Коня, на корректные
        knight.setLocation(new ChessBoard.Cell(4 , 4));

        //Выводим клетки в которые может сходить конь
        System.out.println("Конем можно сходить из клетки " + knight.getLocation().toString()  + "в клетки - " + knight.move());

        System.out.println(MARK_UP);

        //Меняем координаты Коня, на корректные
        knight.setLocation(new ChessBoard.Cell(-1 , 8));

        //Выводим клетки в которые может сходить конь
        System.out.println("Конем можно сходить из клетки " + knight.getLocation().toString()  + "в клетки - " + knight.move());

        System.out.println(MARK_UP);

        cell.setX(8);
        cell.setY(8);

        knight.setLocation(cell);

        //Выводим клетки в которые может сходить конь
        System.out.println("Конем можно сходить из клетки " + knight.getLocation().toString()  + "в клетки - " + knight.move());

    }
}
