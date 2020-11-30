package kaprixal.Cadence;

import net.dv8tion.jda.api.EmbedBuilder;
import net.dv8tion.jda.api.events.message.guild.GuildMessageReceivedEvent;
import net.dv8tion.jda.api.hooks.ListenerAdapter;

public class info extends ListenerAdapter{
	
	public void onGuildMessageReceived(GuildMessageReceivedEvent event) {
		
	
	String[] args = event.getMessage().getContentRaw().split("\\s+");
	
	if (args[0].equalsIgnoreCase(Main.prefix + "info")) {	
		EmbedBuilder info = new EmbedBuilder();
		
		info.setTitle("Cadence Information");
		info.setDescription("Use the prefix '-' to communicate to me :)\n\n- Type 'mom' after the prefix to get a Yo Mamma Joke\n\n- Type 'dad' to get a Dad Joke\n\n- Type 'knock' to get a knock knock joke");
		info.setColor(0xf45642);
		
		event.getChannel().sendTyping().queue();
		event.getChannel().sendMessage(info.build()).queue();
		info.clear();
		
		}
	
	}
}

