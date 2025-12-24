# Design Patterns Practice

디자인 패턴을 직접 리팩토링하며 학습하는 저장소입니다.

## 학습 방식

1. Before 코드의 문제점 파악
2. 패턴 적용하여 직접 리팩토링
3. After 코드로 개선 확인

## 참고 자료

- [Refactoring Guru - Design Patterns](https://refactoring.guru/ko/design-patterns)

## 패키지 구조
```
src/
├── A_factorymethod/
│   ├── before/
│   └── after/
├── B_abstractfactory/
│   ├── before/
│   └── after/
├── C_builder/
│   ├── before/
│   └── after/
├── D_prototype/
│   ├── before/
│   └── after/
└── ...
```

## 패턴 목록

### 생성 패턴 (Creational)

| 패턴 | 설명 | 상태 |
|------|------|------|
| Factory Method | 객체 생성을 서브클래스에 위임 | ✅ |
| Abstract Factory | 관련 객체군을 일관되게 생성 | ✅ |
| Builder | 복잡한 객체를 단계별로 생성 | ✅ |
| Prototype | 기존 객체를 복제하여 생성 | ✅ |
| Singleton | 인스턴스를 하나만 생성 | ⏭️ |

### 구조 패턴 (Structural)

| 패턴 | 설명 | 상태 |
|------|------|------|
| Adapter | 호환되지 않는 인터페이스 연결 | |
| Bridge | 추상화와 구현 분리 | |
| Composite | 객체를 트리 구조로 구성 | |
| Decorator | 객체에 동적으로 책임 추가 | |
| Facade | 복잡한 시스템에 단순한 인터페이스 제공 | |
| Flyweight | 공유로 메모리 사용 최적화 | |
| Proxy | 객체 접근 제어 | |

### 행동 패턴 (Behavioral)

| 패턴 | 설명 | 상태 |
|------|------|------|
| Chain of Responsibility | 요청을 핸들러 체인으로 전달 | |
| Command | 요청을 객체로 캡슐화 | |
| Iterator | 컬렉션 요소 순차 접근 | |
| Mediator | 객체 간 통신 중재 | |
| Memento | 객체 상태 저장/복원 | |
| Observer | 상태 변경 시 의존 객체에 알림 | |
| State | 상태에 따라 행동 변경 | |
| Strategy | 알고리즘을 캡슐화하여 교체 | |
| Template Method | 알고리즘 골격 정의, 일부 단계는 서브클래스에 위임 | |
| Visitor | 객체 구조와 연산 분리 | |
| Interpreter | 언어 문법 해석 | |