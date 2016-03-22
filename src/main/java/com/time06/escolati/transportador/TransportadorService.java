package com.time06.escolati.transportador;

import java.util.List;
import java.util.Map;

import org.springframework.jdbc.core.namedparam.MapSqlParameterSource;

public class TransportadorService {

	public List<Transportador> GetAll() {
		List<Map<String, Object>> transportadores = jdbcTemplate.query(
                "select p.id,"
                + " t.nome,"
                + " t.codigo,"
                + " t.cnpj_cpf,"
                + " t.razaoSocial,"
                + " t.inscricaoEstadual,"
                + " t.dtNascimento,"
                + " t.tipoPessoa,"
                + " t.tipoPessoa,"
                + " t.tipoPessoa,"
                + " t.foto "
                + " from transportador t "
                , new(), new MapRowMapper()
        );
		return transportadores;
	}

}
