package br.com.ft.gdp.models.dto;

import java.io.Serializable;
import java.time.LocalDateTime;

import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.format.annotation.DateTimeFormat.ISO;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

/**
 * Classe VisitEventDTO.java
 * 
 * @author <a href="mailto:viniciosarodrigues@gmail.com">Vinícios Rodrigues</a>
 * 
 * @since 18 de nov de 2019
 */

@Data
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode
public class VisitEventDTO implements Serializable {

    private static final long serialVersionUID = -5192545539633937184L;

    private Long id;

    @DateTimeFormat(iso = ISO.DATE_TIME)
    private LocalDateTime datetime;

    private String description;

    private Long documentId;
}
