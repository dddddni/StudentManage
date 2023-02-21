import Entity.Professor;
import Entity.Student;
import Entity.Subject;

import java.lang.reflect.Array;
import java.util.*;

public class Main {
    public static void main(String[] args) throws NotExistCode {

        // 학생 List 생성
        ArrayList<Student> studentArrayList = new ArrayList<>();
        studentArrayList.add(new Student("김서현", 26, 1000,null));
        studentArrayList.add(new Student("김민지", 20, 1001,null));
        studentArrayList.add(new Student("강해린", 23, 1002,null));

        // 교수 List 생성
        ArrayList<Professor> professorArrayList = new ArrayList<>();
        professorArrayList.add(new Professor("팜하니", "베트남어", 2000));
        professorArrayList.add(new Professor("다니엘", "영어"   , 2001));
        professorArrayList.add(new Professor("이혜인", "한국어" , 2002));

        Scanner sc = new Scanner(System.in);
        while(true){
            System.out.println("교직원/학생 코드를 입력해 주세요");
            int number = sc.nextInt();

            Professor loginProfessor = null;
            Student loginStudent = null;

            // 학생 검색
            for (Student s : studentArrayList) {
                if (number == s.getNumber()) {
                    loginStudent = new Student(s.getName(), s.getAge(), s.getNumber(), s.getSubjects());
                }
            }

            // 교수 검색
            for (Professor s : professorArrayList) {
                if (number == s.getNumber()) {
                    loginProfessor = new Professor(s.getName(), s.getSubject(), s.getNumber());
                }
            }

            // 존재 하지 않는 코드
            if(loginProfessor != null){
                System.out.println(loginProfessor.getName() + "교수님, 환영합니다.");
            }else if (loginStudent != null){
                System.out.println(loginStudent.getName() + "학우님, 환영합니다.");
            }else {
                throw new NotExistCode("존재하지 않는 코드 입니다.");
            }

            // 로그인 한 경우
            // 학생 : 자기 과목 점수 조회
            // 교수 : 자기 과목 점수 등록
            if(loginProfessor != null){
                System.out.println("점수를 입력할 학생이름을 입력해 주세요");
                String student = sc.next();

                System.out.println("과목의 등급을 입력해 주세요");
                String grade = sc.next();

                // 데이터 넣을 학생 정보 입력
                for (Student s : studentArrayList) {
                    if (student.equals(s.getName())) {
                        if (s.getSubjects() == null) {
                            s.setSubjects(new ArrayList<>());
                            System.out.println("과목 정보 생성");
                        }
                        ArrayList<Subject> subjects = s.getSubjects();
                        subjects.add(new Subject(loginProfessor.getSubject(), grade));
                        System.out.println(student + "성적 입력 완료");
                    }else{
                        System.out.println("학생 정보가 존재하지 않습니다.");
                    }
                }
            }else if (loginStudent != null){
                System.out.println(loginStudent.getName() + "님의 기본정보");
                System.out.println("====================================");
                System.out.println("이름 : " + loginStudent.getName());
                System.out.println("나이 : " + loginStudent.getAge());
                System.out.println("학번 : " + loginStudent.getNumber());
                System.out.println("====================================");
                System.out.println(loginStudent.getName() + "님의 성적정보");
                System.out.println("====================================");
                if(loginStudent.getSubjects() == null){
                    System.out.println("성적 정보가 존재하지 않습니다.");
                }else{
                    for (Subject s : loginStudent.getSubjects()) {
                        System.out.println(s.getSubject() + " 과목의 성적은 " + s.getGrade());
                    }
                }

                System.out.println("====================================");
            }
        }
        
    }
}

class NotExistCode extends Exception{
    public NotExistCode(String message) {
        super(message);
    }
}