package lotto.View;

import lotto.type.RankType;

import java.util.List;
import java.util.Map;

public class OutputView {

    public static void printPurchaseLotto(int lottoCount, List<String> lottos) {
        System.out.printf("%d개를 구매했습니다.", lottoCount);
        for (String lotto : lottos) {
            System.out.println(lotto);
        }
    }

    public static void printWinningStatistics(Map<RankType, Integer> rank, int earningRate) {
        System.out.println("당첨 통계");
        System.out.println("---");

        for (RankType rankType : rank.keySet()) {
            if (rankType == RankType.NOTHING) {
                continue;
            }
            String format = String.format("%,d", rankType.getPrizeMoney());
            System.out.printf("%s (%s원) - %d개", rankType.getResult(), format, rank.get(rankType));
        }
        System.out.printf("총 수익률은 %d입니다.", earningRate);
    }
}
