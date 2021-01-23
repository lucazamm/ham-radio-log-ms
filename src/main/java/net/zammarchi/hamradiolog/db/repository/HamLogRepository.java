package net.zammarchi.hamradiolog.db.repository;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;

import net.zammarchi.hamradiolog.db.entity.HamLog;

public interface HamLogRepository extends MongoRepository<HamLog, String> {


}