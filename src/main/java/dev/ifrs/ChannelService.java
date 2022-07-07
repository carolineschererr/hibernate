package dev.ifrs;

import javax.transaction.Transactional;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import dev.ifrs.model.Channel;

@Path("/channel")
@Transactional
public class ChannelService {

    @GET
    @Path("/create/{hash}")
    @Produces(MediaType.APPLICATION_JSON)
    public Channel create(@PathParam("hash") String hash){
        Channel channel = new Channel();
        channel.setHash(hash);
        channel.persist();
        return channel;
    }

    @GET
    @Path("/add/{idChannel}/{idUser}")
    @Produces(MediaType.APPLICATION_JSON)
    public User add(@PathParam("idChannel") Long idChannel, @PathParam("idUser") Long idUser) {
        Channel channel = Channel.findById(idChannel);
    }
    
}
