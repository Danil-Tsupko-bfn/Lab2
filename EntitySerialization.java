package org.example;
import java.io.IOException;
import java.util.List;

public interface EntitySerialization {

    void serialize(List<Object> entities, String filePath) throws IOException;

    void serialize(Object entity, String fileName) throws IOException;

    <T> T deserialize(String fileName, Class<T> entityType) throws IOException;

    List<Object> deserialize(String fileName) throws IOException;
}
