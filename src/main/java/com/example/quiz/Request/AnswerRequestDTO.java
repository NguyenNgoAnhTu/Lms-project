package com.example.quiz.Request;

import lombok.Data;

import java.util.ArrayList;
import java.util.List;

@Data
public class AnswerRequestDTO {
    private List<AnswerOptionRequestDTO> answerOptions = new ArrayList<>();  // Danh sách các lựa chọn (A, B, C, D)
}
