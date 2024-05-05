package strategyexample_1;

import java.io.FileOutputStream;
import java.io.ObjectOutput;
import java.io.ObjectOutputStream;

public class SerializeStrategy implements Strategy {
    @Override
    public void save(final Bean bean) {
    try {
    final ObjectOutput out = new ObjectOutputStream(
    new FileOutputStream("c:/temp/bean.ser"));
    out.writeObject(bean);
    out.close();
    } catch (final Exception e) {
    throw new RuntimeException(e);
    }
    }
    }
