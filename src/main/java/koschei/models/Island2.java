package koschei.models;

import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class Island2 {

    private final Wood3 wood;



    @Override
    public String toString() {

    return ", на острове дерево " + wood.toString();
    }
}
