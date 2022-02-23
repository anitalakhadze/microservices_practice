package com.anita.plagiarism;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.time.LocalDateTime;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class PlagiarismCheckHistory {
    @Id
    @SequenceGenerator(
            name = "plagiarism_id_sequence",
            sequenceName = "plagiarism_id_sequence"
    )
    @GeneratedValue(
            strategy = GenerationType.SEQUENCE,
            generator = "plagiarism_id_sequence"
    )
    private Long id;
    private Long studentId;
    private Boolean isPlagiarist;
    private LocalDateTime createdAt;
}