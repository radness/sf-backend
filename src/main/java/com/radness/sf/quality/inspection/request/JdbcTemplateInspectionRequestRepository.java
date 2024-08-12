package com.radness.sf.quality.inspection.request;

import com.radness.sf.quality.inspection.InspectionType;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.jdbc.core.namedparam.MapSqlParameterSource;
import org.springframework.jdbc.core.simple.SimpleJdbcInsert;

import javax.sql.DataSource;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;

public class JdbcTemplateInspectionRequestRepository implements InspectionRequestRepository {

    private final JdbcTemplate jdbcTemplate;

    public JdbcTemplateInspectionRequestRepository(DataSource dataSource) {
        jdbcTemplate = new JdbcTemplate(dataSource);
    }

    @Override
    public Optional<InspectionRequest> findByInspectionId(Long inspectionId) {
        List<InspectionRequest> result = jdbcTemplate.query("select * from inspection_request where inspection_id = ?", inspReqRowMapper(), inspectionId);
        return result.stream().findAny();
    }

    @Override
    public Optional<InspectionRequest> findByInspectionDescription(String inspectionDescription) {
        List<InspectionRequest> result = jdbcTemplate.query("select * from inspection_request where inspection_description = ?", inspReqRowMapper(), inspectionDescription);
        return result.stream().findAny();
    }

    @Override
    public List<InspectionRequest> findAll() {
        return jdbcTemplate.query("select * from inspection_request", inspReqRowMapper());
    }

    @Override
    public InspectionRequest save(InspectionRequest inspectionRequest) {
        // SimpleJdbcInsert 를 사용하면 쿼리를 작성할 필요가 없다.
        SimpleJdbcInsert jdbcInsert = new SimpleJdbcInsert(this.jdbcTemplate);
        jdbcInsert.withTableName("inspection_request").usingGeneratedKeyColumns("inspection_id");

        Map<String, Object> params = new HashMap<>();
//        params.put("inspection_id", inspectionRequest.getInspectionId());
        params.put("inspection_description", inspectionRequest.getInspectionDescription());
        params.put("inspection_type", inspectionRequest.getInspectionType());
//        params.put("delivery_qty", inspectionRequest.getDeliveryQty());
//        params.put("inspection_request_qty", inspectionRequest.getInspectionRequestQty());
//        params.put("judgement_qty", inspectionRequest.getJudgmentQty());
//        params.put("delivery_seq", inspectionRequest.getDeliverySeq());
//        params.put("purchase_order_seq", inspectionRequest.getPurchaseOrderSeq());

        Number key = jdbcInsert.executeAndReturnKey(new MapSqlParameterSource(params));
        inspectionRequest.setInspectionId(key.longValue());
        return inspectionRequest;
    }

    private RowMapper<InspectionRequest> inspReqRowMapper() {
        return (rs, rowNum) -> {
            InspectionRequest inspReq = new InspectionRequest();
            inspReq.setInspectionId(rs.getLong("inspectionId"));
            inspReq.setInspectionDescription(rs.getString("inspectionDescription"));
            inspReq.setInspectionType(InspectionType.valueOf(rs.getString("inspectionType")));
            return inspReq;
        };
    }
}
