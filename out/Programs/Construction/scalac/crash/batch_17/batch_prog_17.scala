package Program_17 

object Test {
sealed trait T_A
case class CC_A() extends T_A
case class CC_B(a: T_A, b: T_A) extends T_A
case class CC_C[A](a: (T_A,Byte), b: (T_A,CC_B)) extends T_A

val v_a: T_A = null
val v_b: Int = v_a match{
  case CC_A() => 0 
  case CC_B(CC_A(), CC_A()) => 1 
  case CC_B(CC_A(), CC_B(CC_A(), CC_A())) => 2 
  case CC_B(CC_A(), CC_B(CC_A(), CC_B(_, _))) => 3 
  case CC_B(CC_A(), CC_B(CC_A(), CC_C(_, _))) => 4 
  case CC_B(CC_A(), CC_B(CC_B(_, _), CC_A())) => 5 
  case CC_B(CC_A(), CC_B(CC_B(_, _), CC_B(_, _))) => 6 
  case CC_B(CC_A(), CC_B(CC_B(_, _), CC_C(_, _))) => 7 
  case CC_B(CC_A(), CC_B(CC_C(_, _), CC_A())) => 8 
  case CC_B(CC_A(), CC_B(CC_C(_, _), CC_B(_, _))) => 9 
  case CC_B(CC_A(), CC_B(CC_C(_, _), CC_C(_, _))) => 10 
  case CC_B(CC_A(), CC_C((_,_), _)) => 11 
  case CC_B(CC_B(CC_A(), _), CC_A()) => 12 
  case CC_B(CC_B(CC_A(), _), CC_B(CC_A(), CC_A())) => 13 
  case CC_B(CC_B(CC_A(), _), CC_B(CC_A(), CC_C(_, _))) => 14 
  case CC_B(CC_B(CC_A(), _), CC_B(CC_B(_, _), CC_A())) => 15 
  case CC_B(CC_B(CC_A(), _), CC_B(CC_B(_, _), CC_B(_, _))) => 16 
  case CC_B(CC_B(CC_A(), _), CC_B(CC_B(_, _), CC_C(_, _))) => 17 
  case CC_B(CC_B(CC_A(), _), CC_B(CC_C(_, _), CC_A())) => 18 
  case CC_B(CC_B(CC_A(), _), CC_B(CC_C(_, _), CC_B(_, _))) => 19 
  case CC_B(CC_B(CC_A(), _), CC_B(CC_C(_, _), CC_C(_, _))) => 20 
  case CC_B(CC_B(CC_A(), _), CC_C((_,_), _)) => 21 
  case CC_B(CC_B(CC_B(_, _), _), CC_A()) => 22 
  case CC_B(CC_B(CC_B(_, _), _), CC_B(CC_A(), CC_A())) => 23 
  case CC_B(CC_B(CC_B(_, _), _), CC_B(CC_A(), CC_B(_, _))) => 24 
  case CC_B(CC_B(CC_B(_, _), _), CC_B(CC_A(), CC_C(_, _))) => 25 
  case CC_B(CC_B(CC_B(_, _), _), CC_B(CC_B(_, _), CC_A())) => 26 
  case CC_B(CC_B(CC_B(_, _), _), CC_B(CC_B(_, _), CC_B(_, _))) => 27 
  case CC_B(CC_B(CC_B(_, _), _), CC_B(CC_B(_, _), CC_C(_, _))) => 28 
  case CC_B(CC_B(CC_B(_, _), _), CC_B(CC_C(_, _), CC_A())) => 29 
  case CC_B(CC_B(CC_B(_, _), _), CC_B(CC_C(_, _), CC_B(_, _))) => 30 
  case CC_B(CC_B(CC_B(_, _), _), CC_B(CC_C(_, _), CC_C(_, _))) => 31 
  case CC_B(CC_B(CC_B(_, _), _), CC_C((_,_), _)) => 32 
  case CC_B(CC_B(CC_C(_, _), _), CC_A()) => 33 
  case CC_B(CC_B(CC_C(_, _), _), CC_B(CC_A(), CC_A())) => 34 
  case CC_B(CC_B(CC_C(_, _), _), CC_B(CC_A(), CC_B(_, _))) => 35 
  case CC_B(CC_B(CC_C(_, _), _), CC_B(CC_A(), CC_C(_, _))) => 36 
  case CC_B(CC_B(CC_C(_, _), _), CC_B(CC_B(_, _), CC_A())) => 37 
  case CC_B(CC_B(CC_C(_, _), _), CC_B(CC_B(_, _), CC_B(_, _))) => 38 
  case CC_B(CC_B(CC_C(_, _), _), CC_B(CC_B(_, _), CC_C(_, _))) => 39 
  case CC_B(CC_B(CC_C(_, _), _), CC_B(CC_C(_, _), CC_A())) => 40 
  case CC_B(CC_B(CC_C(_, _), _), CC_B(CC_C(_, _), CC_B(_, _))) => 41 
  case CC_B(CC_B(CC_C(_, _), _), CC_B(CC_C(_, _), CC_C(_, _))) => 42 
  case CC_B(CC_B(CC_C(_, _), _), CC_C((_,_), _)) => 43 
  case CC_B(CC_C((_,_), (_,_)), CC_A()) => 44 
  case CC_B(CC_C((_,_), (_,_)), CC_B(CC_A(), CC_A())) => 45 
  case CC_B(CC_C((_,_), (_,_)), CC_B(CC_A(), CC_B(_, _))) => 46 
  case CC_B(CC_C((_,_), (_,_)), CC_B(CC_A(), CC_C(_, _))) => 47 
  case CC_B(CC_C((_,_), (_,_)), CC_B(CC_B(_, _), CC_A())) => 48 
  case CC_B(CC_C((_,_), (_,_)), CC_B(CC_B(_, _), CC_B(_, _))) => 49 
  case CC_B(CC_C((_,_), (_,_)), CC_B(CC_B(_, _), CC_C(_, _))) => 50 
  case CC_B(CC_C((_,_), (_,_)), CC_B(CC_C(_, _), CC_A())) => 51 
  case CC_B(CC_C((_,_), (_,_)), CC_B(CC_C(_, _), CC_B(_, _))) => 52 
  case CC_B(CC_C((_,_), (_,_)), CC_B(CC_C(_, _), CC_C(_, _))) => 53 
  case CC_B(CC_C((_,_), (_,_)), CC_C((_,_), _)) => 54 
  case CC_C((CC_A(),0), (CC_A(),CC_B(_, _))) => 55 
  case CC_C((CC_A(),0), (CC_B(_, _),CC_B(_, _))) => 56 
  case CC_C((CC_A(),0), (CC_C(_, _),CC_B(_, _))) => 57 
  case CC_C((CC_A(),_), (CC_A(),CC_B(_, _))) => 58 
  case CC_C((CC_A(),_), (CC_B(_, _),CC_B(_, _))) => 59 
  case CC_C((CC_A(),_), (CC_C(_, _),CC_B(_, _))) => 60 
  case CC_C((CC_B(_, _),0), (CC_A(),CC_B(_, _))) => 61 
  case CC_C((CC_B(_, _),0), (CC_B(_, _),CC_B(_, _))) => 62 
  case CC_C((CC_B(_, _),0), (CC_C(_, _),CC_B(_, _))) => 63 
  case CC_C((CC_B(_, _),_), (CC_A(),CC_B(_, _))) => 64 
  case CC_C((CC_B(_, _),_), (CC_B(_, _),CC_B(_, _))) => 65 
  case CC_C((CC_B(_, _),_), (CC_C(_, _),CC_B(_, _))) => 66 
  case CC_C((CC_C(_, _),0), (CC_A(),CC_B(_, _))) => 67 
  case CC_C((CC_C(_, _),0), (CC_B(_, _),CC_B(_, _))) => 68 
  case CC_C((CC_C(_, _),0), (CC_C(_, _),CC_B(_, _))) => 69 
  case CC_C((CC_C(_, _),_), (CC_A(),CC_B(_, _))) => 70 
  case CC_C((CC_C(_, _),_), (CC_B(_, _),CC_B(_, _))) => 71 
  case CC_C((CC_C(_, _),_), (CC_C(_, _),CC_B(_, _))) => 72 
}
}
// This is not matched: CC_B(CC_B(CC_A(), _), CC_B(CC_A(), CC_B(_, _)))