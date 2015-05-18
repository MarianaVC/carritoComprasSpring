package com.carritocompras.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.ResultSetExtractor;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.stereotype.Component;

@Component("usuarioDao")
public class UsuarioDAO {

	private JdbcTemplate jdbc;
	
	public UsuarioDAO(){
		System.out.println("Succesfully loaded Usuario DAO");
	}
	@Autowired
	public void setDataSource(DataSource jdbc) {
		this.jdbc = new JdbcTemplate(jdbc);
	}

	public List<Usuario> getUsuario() {
		return jdbc.query("select * from usuario", new RowMapper<Usuario>() {

			@Override
			public Usuario mapRow(ResultSet rs, int rowNum) throws SQLException {
				Usuario usuario = new Usuario();
				
				usuario.setNombre(rs.getString("nombre"));
				usuario.setApaterno(rs.getString("apaterno"));
				usuario.setAmaterno(rs.getString("amaterno"));
				usuario.setCorreo(rs.getString("correo"));
				usuario.setPass(rs.getString("pass"));
				
				return usuario;
				
			}
		});
	}

}
