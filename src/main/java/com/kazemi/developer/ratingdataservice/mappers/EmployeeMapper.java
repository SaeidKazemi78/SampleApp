package com.kazemi.developer.ratingdataservice.mappers;

import com.kazemi.developer.ratingdataservice.dto.EmployeeDTO;
import com.kazemi.developer.ratingdataservice.model.Employee;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;

@Mapper(componentModel = "spring")
public interface EmployeeMapper {

    @Mappings({
            @Mapping(target = "employeeId", source = "entity.id"),
            @Mapping(target = "employeeName", source = "entity.name"),
            @Mapping(target = "employeeStartDt", source = "entity.startDt",dateFormat = "HH:mm:ss")
    })
    EmployeeDTO employeeToEmployeeDTO(Employee entity);

    @Mappings({
            @Mapping(target = "id", source = "dto.employeeId"),
            @Mapping(target = "name", source = "dto.employeeName"),
            @Mapping(target = "startDt", source = "dto.employeeStartDt",dateFormat = "HH:mm:ss")
    })
    Employee employeeDTOtoEmployee(EmployeeDTO dto);

}
