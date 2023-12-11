package org.example;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class TxtEntitySerializer implements EntitySerialization {

    @Override
    public void serialize(List<Object> entities, String filePath) throws IOException {
        try (PrintWriter writer = new PrintWriter(new FileWriter(filePath))) {
            for (Object entity : entities) {
                writer.println(entity.toString());
            }
        }
    }

    @Override
    public void serialize(Object entity, String fileName) throws IOException {
        try (PrintWriter writer = new PrintWriter(new FileWriter(fileName))) {
            writer.println(entity.toString());
        }
    }

    @Override
    public <T> T deserialize(String fileName, Class<T> entityType) throws IOException {
        try (BufferedReader reader = new BufferedReader(new FileReader(fileName))) {
            String line = reader.readLine();
            return convertStringToObject(line, entityType);
        }
    }

    @Override
    public List<Object> deserialize(String filePath) throws IOException {
        try (BufferedReader reader = new BufferedReader(new FileReader(filePath))) {
            List<Object> entities = new ArrayList<>();
            String line;
            while ((line = reader.readLine()) != null) {
                entities.add(convertStringToObject(line, Object.class));
            }
            return entities;
        }
    }

    private <T> T convertStringToObject(String line, Class<T> entityType) {
        return (T) line;
    }
}
