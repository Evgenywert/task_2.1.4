package koschei.models;

import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class Rabbit4 {
    private final Duck5 duck;

    @Override
    public String toString() {

        return ", в зайце утка " + duck.toString();
    }
}
