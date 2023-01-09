package com.andreasekman;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;


class EntranceFeeCalculatorTest {

    @Test
    void calculate_childFeeHalfDay_returns25() {
        double entranceFee = EntranceFeeCalculator.calculate(new Visitor(6), TicketType.HALF_DAY);

        assertThat(entranceFee).isEqualTo(20.0);
    }

    @Test
    void calculate_ChildFeeFullDay_returns50() {
        double entranceFee = EntranceFeeCalculator.calculate(new Visitor(12), TicketType.FULL_DAY);

        assertThat(entranceFee).isEqualTo(50.0);
    }

    @Test
    void calculate_adultFeeHalfDay_returns25() {
        double entranceFee = EntranceFeeCalculator.calculate(new Visitor(26), TicketType.HALF_DAY);

        assertThat(entranceFee).isEqualTo(60.0);
    }

    @Test
    void calculate_adultFeeFullDay_returns25() {
        double entranceFee = EntranceFeeCalculator.calculate(new Visitor(36), TicketType.FULL_DAY);

        assertThat(entranceFee).isEqualTo(120.0);
    }


}