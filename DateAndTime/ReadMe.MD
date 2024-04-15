[Object 주요 메서드] 자바의 모든 클래스는 묵시적으로 Object 객체를 상속받는다.
	toString() : 객체의 정보를 제공
	equals() : 객체의 동등성 비교(heap영역)
	getClass() : 객체의 클래스 정보를 제공

[날짜와 시간]
라이브러리(페키지) : Java.time
time에서 제공하는 여러 Class
	Year : 년, YYYY
	YearMonth : 년월, YYYY-MM
	MonthDay : 월일, MM-DD
	LocalDate : 년월일, YYYY-MM-DD
	LocalTime : 시분초, HH:MM:SS.mmm
	LocalDateTime : 년월일시분초 : YYYY-MM-DDTHH:MM:SS.mmm
	
	DayOfWeek : 월, 화, 수, 목, 금, 토, 일
	Month : 월: AUGUST
	Period : P10D(10 days), 년, 월, 일 단위로 기간을 설정 가능
	Duration : PT20H(20 hours) 시, 분 초 단위로 기간을 설정 가능하다.
	
주요 메서드 TimeClass는 time라이브러리에서 제공하는 여러 클래스라고 가정한다. 
	[boolean] = TimeInstance.isBefor(TimeInstance)
	[boolean] = TimeInstance.isAfter(TimeInstance)
	[boolean] = TimeInstance.isEqual(TimeInstance)

	사용자 지정 날짜 생성 new 가 필요없다?!
	[TimeInstance] = TimeClass.of(YYYY, MM, DD...기타 형식에 따라 변동)
	객체 생성 날짜 생성
	[TimeInstance] = TimeClass.now()
	특정 TimeInstance 기준 시간 더하기 => 불변 객체이기 때문에 새로 "생성"필수
	[TimeInstance] = TimeInstance.plus???(amount of time)

	isEqual(time 메서드) vs equals()(Object method) : 전지구적으로 동시간대면 True vs 단순 시간 toStirng을 했을때 같아야 True
ZonedDateTime : LocalDateTime + offSet + ZoneId => ZoneId에 해당하는 시간을 알려준다.
	ZoneId : 동일 시간을 갖는 시간 영역대
	OffSet : UTC 기준 해당 시간대의 시차 정보
Instant : Epoch시간으로 1970-01-01T00:00:00을 기준으로 나노초까지의 누적 시간을 나타낸다. 따라서 시간대의 영향을 받지않는다.
	ZonedDateTime => Instant : Instant.from(ZonedDateTime)
	Instant => ZonedDateTime : ZonedDateTime.ofInstant(utc, ZoneId.of("contry/local"))

Period vs Duration : 년월일 vs 시분초나노초==> 그 자체가 시간양을 의미하며 해당 정보로 계산을 할 수도 아니면 기간의 차이를 계산 할 수 도 있다.
[Period 주요 메서드] => 기간을 정해 계산하거나 기간의 차이를 계산할 수 있다.
	ofxxx() : Period 시간 양 정의
	between([localDate], [localDate])
	getYears() : 총 시간 차이가 환산되는것이 아니다.
	getMonth() : 총 시간 차이가 환산되는것이 아니다.
	getDayse() : 총 시간 차이가 환산되는것이 아니다.
[Duration 주요 메서드]
	toHours() : 총 시간 차이가 시간으로 환산되어 반환된다. 소수점 버림
	toMinutes() :  총 시간 차이가 분으로 환산되어 반환된다. 소수점 버림
	toSecounds() = getSecounds() : 총 시간 차이가 초로 환산되어 반환된다.
	getNano()

	toHoursPart() : 시차만을 반환
	toMinutesPart() : 분차만을 반환
	toSecoundsPart() : 초차만을 반환
Duration과 Period는 자유롭게 TimeInstance의 형식만 맞다면 plue로 연산이 가능하다. ex1참고


ChronoUnit : TemporalUnit의 구현체로 총량을 다양한 시간 단위로 환산시 사용한다.
	ChronoUnit.DAYS.between(startDate, endDate)
		나노초, 초, 분, 시, 일, 주, 월, 년 그냥 다된다. 
ChronoField : TemporalField의 구현체로 다양한 시간의 단위로 추출시 사용한다.
.with() 는 TimeInstance의 특정 부분만 변경 할 수 있으며 TemporalAdjusters(구현체 확인 필)과 함께 편하게 날짜를 조작 할 수 있다.
.dayOfWeek는 특정 LocalDate의 요일을 반환한다.

문제풀이
Ex2 : 년월일을 계산할땐 Period, 시분초를 계산할땐 Duration 헷갈리지 말자!
Ex3 : ChronoUnit의 활용법
Ex4 : with()와 dayOfWeek() 활용법