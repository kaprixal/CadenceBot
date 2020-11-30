package kaprixal.Cadence;

import java.util.Random;

import net.dv8tion.jda.api.EmbedBuilder;
import net.dv8tion.jda.api.events.message.guild.GuildMessageReceivedEvent;
import net.dv8tion.jda.api.hooks.ListenerAdapter;

public class dad extends ListenerAdapter{

	String [] dadjokes = {
			  "I used to be afraid of hurdles, but I got over it.",
			  "What do you call a fake noodle? An Impasta.",
			  "I would avoid the sushi if I was you. It’s a little fishy.",
			  "Want to hear a joke about paper? Nevermind it’s tearable.",
			  "Why did the cookie cry? Because his father was a wafer so long!",
			  "I used to work in a shoe recycling shop. It was sole destroying.",
			  "What do you call a belt with a watch on it? A waist of time.",
			  "How do you organize an outer space party? You planet.",
			  "Do you know where you can get chicken broth in bulk? The stock market.",
			  "I cut my finger chopping cheese, but I think that I may have greater problems.",
			  "My cat was just sick on the carpet, I don’t think it’s feline well.",
			  "What did daddy spider say to baby spider? You spend too much time on the web.",
			  "There’s a new type of broom out, it’s sweeping the nation.",
			  "What cheese can never be yours? Nacho cheese.",
			  "What did the Buffalo say to his little boy when he dropped him off at school? Bison.",
			  "Have you ever heard of a music group called Cellophane? They mostly wrap.",
			  "Why does Superman gets invited to dinners? Because he is a Supperhero.",
			  "Did you hear about the guy who lost the left side of his body? He's alright now.",
			  "I did a theatrical performance on puns. It was a play on words.", 
			  "What do you do with a dead chemist? You barium.", 
			  "I bet the person who created the door knocker won a Nobel prize.", 
			  "Towels can’t tell jokes. They have a dry sense of humor."
			  };
	
	public void onGuildMessageReceived(GuildMessageReceivedEvent event) {
		
		String[] args = event.getMessage().getContentRaw().split("\\s+");
		
		if (args[0].equalsIgnoreCase(Main.prefix + "dad")) {	
			
			Random rand = new Random();
			int number = rand.nextInt(dadjokes.length);
			
			
			EmbedBuilder info = new EmbedBuilder();
			
			info.setTitle("Cadence");
			info.setDescription(dadjokes[number]);
			info.setColor(0xf45642);
			
			event.getChannel().sendTyping().queue();
			event.getChannel().sendMessage(info.build()).queue();
			info.clear();
			
			}
	}
}
