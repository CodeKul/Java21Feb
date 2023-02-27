package basic;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public class Room {

    public String fan;

    public String tv;

    public void show(int i){
        System.out.println(i);
    }

    public static void main(String[] args) throws InstantiationException, IllegalAccessException, NoSuchMethodException, InvocationTargetException, CloneNotSupportedException {
        System.out.println("Hii");

        Room room = new Room();

        Room r1 =(Room) room.clone();

        Room room1 = Room.class.newInstance();
        room1.show(3);

        Constructor<Room> roomConstructor = Room.class.getConstructor();
        Room room2 = roomConstructor.newInstance();
        room2.show(10);

        room.show(2);
//        System.out.println(obj.fan);

//        DataTypesDemo.show("");
    }
}
