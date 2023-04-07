package com.example.StaticDynamicFilteringDemo.DynamicFiltering;

import com.fasterxml.jackson.databind.ser.BeanPropertyFilter;
import com.fasterxml.jackson.databind.ser.FilterProvider;
import com.fasterxml.jackson.databind.ser.impl.SimpleBeanPropertyFilter;
import com.fasterxml.jackson.databind.ser.impl.SimpleFilterProvider;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.converter.json.MappingJacksonValue;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.Mapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StudentController
{

    @GetMapping("/students")
    public MappingJacksonValue getStudent()
    {
        Student student= new Student(1L,"UP",60000);
        SimpleBeanPropertyFilter propertyFilter =
                SimpleBeanPropertyFilter.filterOutAllExcept("salary");
        FilterProvider provider = new SimpleFilterProvider().addFilter("empFilter",propertyFilter);
        MappingJacksonValue value = new MappingJacksonValue(student);
        value.setFilters(provider);
        return value;

        }


}




