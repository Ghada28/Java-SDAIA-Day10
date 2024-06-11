package org.example.mappers;

import org.example.dto.JobDto;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;
import org.example.models.job;


@Mapper(componentModel = "cdi")
public interface JobMapper {
    JobMapper INSTANCE = Mappers.getMapper(JobMapper.class);


    JobDto toJobDto(job j);

    job toModel(JobDto dto);
}