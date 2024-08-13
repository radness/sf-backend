package com.radness.sf.quality.inspection.item;

import com.radness.sf.quality.inspection.InspectionType;
import com.radness.sf.quality.inspection.request.InspectionRequest;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.jdbc.core.namedparam.BeanPropertySqlParameterSource;
import org.springframework.jdbc.core.namedparam.MapSqlParameterSource;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.jdbc.core.namedparam.SqlParameterSource;
import org.springframework.jdbc.support.GeneratedKeyHolder;
import org.springframework.jdbc.support.KeyHolder;

import javax.sql.DataSource;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

public class NamedParameterJdbcTemplateInspectionItemRepository implements InspectionItemRepository {

    private final NamedParameterJdbcTemplate namedParameterJdbcTemplate;

    public NamedParameterJdbcTemplateInspectionItemRepository(DataSource dataSource) {
        this.namedParameterJdbcTemplate = new NamedParameterJdbcTemplate(dataSource);
    }

    @Override
    public InspectionItem findByInspectionItemCode(Long id) {
        String sql = "select * from inspection_items where inspection_item_code = :inspectionItemCode";
        Map<String, Object> params = new HashMap<>();
        params.put("inspectionItemCode", id);

        return namedParameterJdbcTemplate.queryForObject(sql, params, inspItemRowMapper());
    }

    @Override
    public InspectionItem save(InspectionItem inspectionItem) {
        String sql = "insert into inspection_items(inspection_item_code, inspection_item_description) values (:inspectionItemCode, :inspectionItemDescription)";

        SqlParameterSource namedParameters = new BeanPropertySqlParameterSource(inspectionItem);
        KeyHolder keyHolder = new GeneratedKeyHolder();

        /* sql 을 사용해서 쿼리를 수행하는 방법 3가지
        * 1. BeanPropertySqlParameterSource
        * 2. MapSqlParameterSource()
        * 3. Map
        */
        namedParameterJdbcTemplate.update(sql, namedParameters, keyHolder);
        Long key = (Long) Objects.requireNonNull(keyHolder.getKeys()).get("inspection_item_code");
        inspectionItem.setInspectionItemCode(key);
        return inspectionItem;
    }

    private RowMapper<InspectionItem> inspItemRowMapper() {
        return BeanPropertyRowMapper.newInstance(InspectionItem.class);
    }
}
