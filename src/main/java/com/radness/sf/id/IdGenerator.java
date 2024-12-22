package com.radness.sf.id;

import lombok.extern.slf4j.Slf4j;
import org.hibernate.engine.spi.SharedSessionContractImplementor;
import org.hibernate.id.IdentifierGenerator;
import org.hibernate.service.ServiceRegistry;
import org.hibernate.type.Type;

import java.util.Properties;

@Slf4j
public class IdGenerator implements IdentifierGenerator {

    private String method;
    // 속성값 처리 method
    @Override
    public void configure(Type type, Properties parameters, ServiceRegistry serviceRegistry) {
        IdentifierGenerator.super.configure(type, parameters, serviceRegistry);
    }

    // ID 생선 처리 method
    @Override
    public Object generate(SharedSessionContractImplementor session, Object obj) {
        return null;
    }
}
