package strategyexample_2;

public class StrategyExample_2 {
    public static void main(String[] args) {
        
        // Arkadaşınızla bağlantı kurmak için sosyal Medya Bağlantı Nesnesi oluşturma
		// herhangi bir sosyal medya stratejisi.
		SocialMediaContext context = new SocialMediaContext();

		// Setting Facebook strategy.
		context.setSocialmediaStrategy(new FacebookStrategy());
		context.connect("Lokesh");

		System.out.println("====================");

		// Setting Twitter strategy.
		context.setSocialmediaStrategy(new TwitterStrategy());
		context.connect("Lokesh");

		System.out.println("====================");

		// Setting GooglePlus strategy.
		context.setSocialmediaStrategy(new GooglePlusStrategy());
		context.connect("Lokesh");

		System.out.println("====================");

		// Setting Orkut strategy.
		context.setSocialmediaStrategy(new OrkutStrategy());
		context.connect("Lokesh");
    }
}
