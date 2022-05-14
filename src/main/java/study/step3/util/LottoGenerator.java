package study.step3.util;

import java.util.ArrayList;
import java.util.List;
import study.step3.Lotto;

public class LottoGenerator {
    private LottoGenerator() {
    }

    public static List<Lotto> generate(int genSize) {
        validate(genSize);
        List<Lotto> result = new ArrayList<>();
        for (int i = 0; i < genSize; i++) {
            result.add(new Lotto());
        }
        return result;
    }

    private static void validate(int genSize) {
        if (genSize < 1) {
            throw new IllegalArgumentException("한 개 이상의 숫자를 입력해주세요.");
        }
    }
}