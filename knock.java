package kaprixal.Cadence;

import java.util.Random;

import net.dv8tion.jda.api.EmbedBuilder;
import net.dv8tion.jda.api.events.message.guild.GuildMessageReceivedEvent;
import net.dv8tion.jda.api.hooks.ListenerAdapter;

public class knock extends ListenerAdapter{
		String[] Part1 = {
				  "Goliath.",
				  "Broccoli.",
				  "Amish",
				  "Atch",
				  "A little old lady.",
				  "Cows go",
				  "Cash",
				  "Canoe"
				};
		String[] Part2 = {
				  "Goliath down, you look-eth tired!",
				  "Broccoli doesn’t have a last name, silly.",
				  "Really?  You don’t look like a shoe!",
				  "Bless you!",
				  "I didn’t know you could yodel!",
				  "Cows go who? No silly, cows go MOO!",
				  "Cash who? No thanks, but I’ll take a peanut if you have one!",
				  "Canoe come out and play with me?",
				};
		

		
		public void onGuildMessageReceived(GuildMessageReceivedEvent event) {
			
			String[] args = event.getMessage().getContentRaw().split("\\s+");
			
			
			Random rand = new Random();
			int number = rand.nextInt(8);

			
			if (args[0].equalsIgnoreCase(Main.prefix + "knock"))
					
			{
			
			EmbedBuilder pt4 = new EmbedBuilder();
			pt4.setTitle("Cadence");
			pt4.setDescription("Knock Knock!");
			pt4.setColor(0xf45642);
			
			event.getChannel().sendTyping().queue();
			event.getChannel().sendMessage(pt4.build()).queue();
			
			EmbedBuilder pt5 = new EmbedBuilder();
			pt5.setTitle("Response");
			pt5.setDescription("Who's There");
			
			event.getChannel().sendTyping().queue();
			event.getChannel().sendMessage(pt5.build()).queue();

			EmbedBuilder pt1 = new EmbedBuilder();
			pt1.setTitle("Cadence");
			pt1.setDescription(Part1[number]);
			pt1.setColor(0xf45642);
					
			event.getChannel().sendTyping().queue();
			event.getChannel().sendMessage(pt1.build()).queue();
				
			EmbedBuilder pt3= new EmbedBuilder();
			pt3.setTitle("Response");
			pt3.setDescription(Part1[number]+ " who?");
				
			event.getChannel().sendTyping().queue();
			event.getChannel().sendMessage(pt3.build()).queue();
				
			EmbedBuilder pt2= new EmbedBuilder();
			pt2.setTitle("Cadence");
			pt2.setDescription(Part2[number]);
			pt2.setColor(0xf45642);
				
			event.getChannel().sendTyping().queue();
			event.getChannel().sendMessage(pt2.build()).queue();

			}				
			  				
		}
	}
		
			
			
	
		
						
				


