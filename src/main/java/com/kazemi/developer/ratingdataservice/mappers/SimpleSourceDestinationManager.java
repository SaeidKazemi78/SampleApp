package com.kazemi.developer.ratingdataservice.mappers;

import com.kazemi.developer.ratingdataservice.dto.SimpleSource;
import com.kazemi.developer.ratingdataservice.model.SimpleDestination;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;


//We set componentModel = 'spring' In order to use Spring DI
@Mapper(componentModel = "spring")
public interface SimpleSourceDestinationManager {

    @Mappings({
            @Mapping(target = "name", source = "source.nameS"),
            @Mapping(target = "description", source = "source.descriptionS")
    })
    SimpleDestination sourceToDestination(SimpleSource source);

    @Mappings({
            @Mapping(target = "nameS" , source = "destination.name"),
            @Mapping(target = "descriptionS" , source = "destination.description")
    })
    SimpleSource destinationToSource(SimpleDestination destination);
}
