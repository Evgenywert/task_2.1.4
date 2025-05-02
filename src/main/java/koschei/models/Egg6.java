package koschei.models;

import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class Egg6 {
    private final Needle7 needle;

    @Override
    public String toString() {
        return ", в яйце иголка " + needle.toString();
    }
}
