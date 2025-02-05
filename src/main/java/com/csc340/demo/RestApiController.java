package com.csc340.demo;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;


@RestController


public class RestApiController {
    @GetMapping("/artist")
    public Object getArtist(@RequestParam(value = "num", defaultValue = "27") String id) throws JsonProcessingException {

        String url = "https://api.deezer.com/artist/" + id;
        RestTemplate restTemplate = new RestTemplate();
        ObjectMapper mapper = new ObjectMapper();

        String jsonListResponse = restTemplate.getForObject(url, String.class);
        JsonNode root = mapper.readTree(jsonListResponse);

        Artist artist = new Artist(root.get("name").asText(), root.get("nb_album").asInt(),
                root.get("nb_fan").asInt());
        return artist;

    }
}

