package jdriven.course.mongodb.config;

import java.util.UUID;
import java.util.function.Supplier;

@FunctionalInterface
public interface MongoDbIdProvider {
	UUID provide();
}
