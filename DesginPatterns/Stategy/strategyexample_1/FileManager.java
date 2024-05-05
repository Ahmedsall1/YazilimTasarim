package strategyexample_1;

import java.util.ResourceBundle;

public class FileManager {
    /**
    * Bünyesinde bir strategy nesnesi barındırır.
    */
    private Strategy strategy;
    /**
    * Singleton tasarım şablonunu kullanarak bu
    * sınıftan sadece bir nesnenin
    * oluşmasını sağlıyoruz.
    */
    public static final FileManager manager =
    new FileManager();
    /**
    * Sınıf konstrüktörü içinde strategy.properties
    * dosyasinda tanımlanmış olan
    * strategy sınıfını yükleyerek, bir strategy
    * nesnesi oluşturuyoruz.
    */
    private FileManager() {
    final String strategy =
    ResourceBundle.getBundle(
    "com/pratikprogramci/"
    + "designpatterns/bolum7/"
    + "strategy/strategy")
    .getString("strategy");
    
    try {
    setStrategy(((Strategy) Class.forName(
    strategy).newInstance()));
    } catch (final Exception e) {
    throw new RuntimeException(e);
    }
    }
    public static FileManager instance() {
    return manager;
    }
    public Strategy getStrategy() {
    return strategy;
    }
    public void setStrategy(final Strategy strategy) {
    this.strategy = strategy;
    }
    public void saveBean(final Bean bean) {
    getStrategy().save(bean);
    }
    }
