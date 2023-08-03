package hello.core.discount;

import hello.core.member.Grede;
import hello.core.member.Member;

public class FixDiscountPolicy implements DiscountPolicy{

  private int discountFixAmount = 1000;

  @Override
  public int discount(Member member, int price) {
    if (member.getGrade() == Grede.VIP) {
      return discountFixAmount;
    } else {
      return 0;
    }
  }
}
