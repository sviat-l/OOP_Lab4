package lotr;

import org.reflections.Reflections;
import java.lang.reflect.Modifier;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Set;

public class CharacterFactory {
    public static Character createCharacter(){
        Reflections reflections = new Reflections("lotr");

        Set<Class<? extends Character>> subClasses = reflections.getSubTypesOf(Character.class);
        List<Class<? extends Character>> subTypes = new ArrayList<>();
        for(Class<? extends Character> current_class:subClasses){
            if (!Modifier.isAbstract(current_class.getModifiers())){
                subTypes.add(current_class);
            }
        }
        try {
            return subTypes.get(new Random().nextInt(subTypes.size())).getDeclaredConstructor().newInstance();
        } catch ( NoSuchMethodException|InvocationTargetException| InstantiationException| IllegalAccessException e){
            throw new RuntimeException(e);
        }
    }
}
