package com.anita.plagiarism;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;

@Service
@AllArgsConstructor
public class PlagiarismCheckService {
    private final PlagiarismCheckHistoryRepository plagiarismCheckHistoryRepository;

    public boolean isPlagiaristStudent(Long studentId) {
        plagiarismCheckHistoryRepository.save(
                PlagiarismCheckHistory.builder()
                        .studentId(studentId)
                        .isPlagiarist(false)
                        .createdAt(LocalDateTime.now()).build()
        );
        return false;
    }
}
