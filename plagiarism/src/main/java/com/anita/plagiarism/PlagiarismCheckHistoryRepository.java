package com.anita.plagiarism;

import org.springframework.data.jpa.repository.JpaRepository;

public interface PlagiarismCheckHistoryRepository extends JpaRepository<PlagiarismCheckHistory, Long> {
}
