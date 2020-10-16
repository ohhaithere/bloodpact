package com.ohhaithere.bloodpactpactservice.mapper;

import com.ohhaithere.bloodpactpactservice.dto.PactDto;
import com.ohhaithere.bloodpactpactservice.model.Pact;
import ma.glasnost.orika.MapperFacade;
import ma.glasnost.orika.MapperFactory;
import ma.glasnost.orika.impl.DefaultMapperFactory;
import org.springframework.stereotype.Service;

@Service
public class PactMapper {

    MapperFactory mapperFactory = new DefaultMapperFactory.Builder().build();

    public Pact mapDtoToPact(PactDto pactDto) {
        mapperFactory.classMap(PactDto.class, Pact.class)
                .field("user1", "user")
                .field("user2", "user2")
                .field("name", "name")
                .byDefault()
                .register();
        MapperFacade mapper = mapperFactory.getMapperFacade();
        Pact pactToReturn = mapper.map(pactDto, Pact.class);
        return pactToReturn;
    }

    public PactDto mapPactToDto(Pact pact) {
        mapperFactory.classMap(Pact.class, PactDto.class)
                .field("user1", "user")
                .field("user2", "user2")
                .field("name", "name")
                .byDefault()
                .register();
        MapperFacade mapper = mapperFactory.getMapperFacade();
        PactDto dtoToReturn = mapper.map(pact, PactDto.class);
        return dtoToReturn;
    }

}
