import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.temporal.Temporal;
import java.time.temporal.TemporalAmount;
import java.time.temporal.TemporalUnit;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.List;
import java.util.OptionalInt;
import java.util.Random;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Test01 {

	public static void main(String[] args) {
		LocalTime t=LocalTime.of(10, 11);
		t.plus(new TemporalAmount() {
			
			@Override
			public Temporal subtractFrom(Temporal temporal) {
				// TODO Auto-generated method stub
				return null;
			}
			
			@Override
			public List<TemporalUnit> getUnits() {
				// TODO Auto-generated method stub
				return null;
			}
			
			@Override
			public long get(TemporalUnit unit) {
				// TODO Auto-generated method stub
				return 0;
			}
			
			@Override
			public Temporal addTo(Temporal temporal) {
				// TODO Auto-generated method stub
				return null;
			}
		});

	}
}
