package fr.eni.movielibrary.utils;

import fr.eni.movielibrary.bll.MovieService;
import fr.eni.movielibrary.bo.Participant;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.convert.converter.Converter;
import org.springframework.stereotype.Component;

@Component
public class IdToParticipantConverter implements Converter<String, Participant> {

    @Autowired
    MovieService movieService;
    @Override
    public Participant convert(String id) {
        return movieService.getParticipantById(Long.parseLong(id));
    }
}
