import java.util.ArrayList;
import java.util.Arrays;
import java.util.Objects;

public class ConcreteSheet extends Sheet{
    // ------------ Attribute ------------

    // ----------- Constructor -----------.
    public ConcreteSheet(String name) {
        this.sheet_name = name;
    }

    @Override
    public void setOwner(User owner) {
        this.Owner = owner;
    }

    // ------------ Method --------------
}
