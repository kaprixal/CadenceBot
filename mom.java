package kaprixal.Cadence;

import java.util.Random;

import net.dv8tion.jda.api.EmbedBuilder;
import net.dv8tion.jda.api.events.message.guild.GuildMessageReceivedEvent;
import net.dv8tion.jda.api.hooks.ListenerAdapter;

public class mom extends ListenerAdapter{
	
	String [] yomamajokes = {
			  "Yo momma is so fat when she got on the scale it said, 'I need your weight not your phone number'.", 
			  "Yo momma is so fat, I took a picture of her last Christmas and it's still printing.", 
			  "Yo momma is so ugly she made One Direction go another direction.", 
			  "Yo momma's so stupid, she put two quarters in her ears and thought she was listening to 50 Cent.", 
			  "Yo momma is so stupid she climbed over a glass wall to see what was on the other side.",
			  "Yo mamma is so fat she doesn't need the internet, because she's already world wide.", 
			  "Yo momma is so stupid she took a ruler to bed to see how long she slept.", 
			  "Yo mama so ugly when she went into a haunted house she came out with a job application.", 
			  "Yo momma is so ugly even Hello Kitty said, 'Goodbye' to her", 
			  "Yo momma is so dumb that she thought Dunkin' Donuts was a basketball team.", 
			  "Yo momma is so stupid when your dad sad it was chilly outside, she ran out the door with a spoon!", 
			  "Yo momma's so fat, she got baptized at Sea World.", 
			  "Yo momma is so ugly she turned Medusa into stone.", 
			  "Yo momma is so stupid that she sat on the TV to watch the couch.", 
			  "Yo Momma's teeth are so yellow, that when she smiles, traffic slows down!", 
			  "Yo mamma so stupid she tried to put M&M's in alphabetical order.", 
			  "Yo momma so ugly, she had to get the baby drunk so that she could breastfeed it", 
			  "Yo mama so dumb she tried to make an appointment with Dr. Pepper.", 
			  "Yo mama's so poor that ducks throw bread at her.", 
			  "Yo mama so stupid, she tried to save a fish from drowning.", 
			  "Yo momma is so ugly her parents had to feed her with a slingshot."};
	
public void onGuildMessageReceived(GuildMessageReceivedEvent event) {
		
		String[] args = event.getMessage().getContentRaw().split("\\s+");
		
		if (args[0].equalsIgnoreCase(Main.prefix + "mom")) {	
			
			Random rand = new Random();
			int number = rand.nextInt(yomamajokes.length);
			
			
			EmbedBuilder info = new EmbedBuilder();
			
			info.setTitle("Cadence");
			info.setDescription(yomamajokes[number]);
			info.setColor(0xf45642);
			
			event.getChannel().sendTyping().queue();
			event.getChannel().sendMessage(info.build()).queue();
			
			}
	}
}


