import static org.junit.jupiter.api.Assertions.*;

class MainTest {
    @org.junit.jupiter.api.Test
    void checkGetYearFunziona() {
        assertEquals("Anno 2023", "Anno 2023");
    }

    @org.junit.jupiter.api.Test
    void checkGetYearNonFunziona() {
        assertEquals("Anno 2023", "Anno 2024");
    }
    @org.junit.jupiter.api.Test
    void checkGetMonthFunziona() {
        assertEquals("Mese marzo", "Mese marzo");
    }

    @org.junit.jupiter.api.Test
    void checkGetMonthNonFunziona() {
        assertEquals("Mese marzo", "Mese aprile");
    }

    @org.junit.jupiter.api.Test
    void checkGetDayFunziona() {
        assertEquals("Giorno del mese 1", "Giorno del mese 1");
    }

    @org.junit.jupiter.api.Test
    void checkGetDayNonFunziona() {
        assertEquals("Giorno del mese 1", "Giorno del mese 2");
    }

    @org.junit.jupiter.api.Test
    void checkGetDayOfWeekFunziona() {
        assertEquals("Giorno della settimana mercoledì", "Giorno della settimana mercoledì");
    }

    @org.junit.jupiter.api.Test
    void checkGetDayOfWeekNonFunziona() {
        assertEquals("Giorno della settimana mercoledì", "Giorno della settimana giovedì");
    }

}