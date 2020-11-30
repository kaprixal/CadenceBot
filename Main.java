package kaprixal.Cadence;

import javax.security.auth.login.LoginException;

import net.dv8tion.jda.api.JDA;
import net.dv8tion.jda.api.JDABuilder;
import net.dv8tion.jda.api.OnlineStatus;


public class Main {
	public static JDA jda;
	public static String prefix = "-";
	//Main method
public static void main(String[] args) throws LoginException {
	jda = JDABuilder.createDefault("Nzc0NzA1MjA5MjgwMjk5MDE4.X6bqcw.m5Fl63e1JkaOud80GE4zNYt5OwA").build();
	jda.getPresence().setStatus(OnlineStatus.ONLINE);
	
	jda.addEventListener(new info());
	jda.addEventListener(new dad());
	jda.addEventListener(new mom());
	jda.addEventListener(new knock());
	
	}
}
