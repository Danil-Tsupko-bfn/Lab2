package org.example;

import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.File;
import java.io.IOException;
import java.util.List;

public class JsonEntitySerialization implements EntitySerialization {

    private final ObjectMapper objectMapper = new ObjectMapper();

    @Override
    public void serialize(List<Object> entities, String filePath) throws IOException {

    }

    @Override
    public void serialize(Object entity, String fileName) throws IOException {
        objectMapper.writeValue(new File(fileName), entity);
    }

    @Override
    public <T> T deserialize(String fileName, Class<T> entityType) throws IOException {
        return objectMapper.readValue(new File(fileName), entityType);
    }

    @Override
    public List<Object> deserialize(String fileName) throws IOException {
        return null;
    }
}
