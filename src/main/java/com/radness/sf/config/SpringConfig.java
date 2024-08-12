package com.radness.sf.config;

import com.radness.sf.quality.inspection.request.InspectionRequestRepository;
import com.radness.sf.quality.inspection.request.InspectionRequestService;
import com.radness.sf.quality.inspection.request.JdbcTemplateInspectionRequestRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import javax.sql.DataSource;

@Configuration
public class SpringConfig {

    private final DataSource dataSource;

    @Autowired
    public SpringConfig(DataSource dataSource) {
        this.dataSource = dataSource;
    }

    @Bean
    public InspectionRequestService inspectionRequestService() {
        return new InspectionRequestService(inspectionRequestRepository());
    }

    @Bean
    public InspectionRequestRepository inspectionRequestRepository() {
        return new JdbcTemplateInspectionRequestRepository(dataSource);
    }

}
