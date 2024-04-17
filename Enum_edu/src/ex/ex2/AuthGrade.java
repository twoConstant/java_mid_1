package ex.ex2;

public enum AuthGrade {
    GUEST(1, "손님"), LOGIN(2, "로그인 회원"), ADMIN(3, "관리자");

    final int level;
    final String description;

    // 생성자
    AuthGrade(int level, String description) {
        this.level = level;
        this.description = description;
    }

    public void getContent(){
        System.out.println(this.name());
        System.out.println("level=" + this.level);
        System.out.println("description" + this.description);
    }

    public int getLevel(){
        return this.level;
    }

    public String getDescription(){
        return this.description;
    }


}
