package Program_27 

object Test {
sealed trait T_A
sealed trait T_B[A, B]
case class CC_A() extends T_A
case class CC_B(a: ((CC_A,T_A),T_B[CC_A, T_A])) extends T_A
case class CC_C(a: T_A, b: T_A) extends T_A
case class CC_D[C](a: (CC_A,CC_C), b: T_A) extends T_B[CC_C, C]

val v_a: CC_C = null
val v_b: Int = v_a match{
  case CC_C(CC_A(), CC_A()) => 0 
  case CC_C(CC_B(_), CC_A()) => 1 
  case CC_C(CC_C(CC_A(), _), CC_A()) => 2 
  case CC_C(CC_C(CC_B(_), _), CC_A()) => 3 
  case CC_C(CC_C(CC_C(_, _), _), CC_A()) => 4 
  case CC_C(CC_A(), CC_B((_,_))) => 5 
  case CC_C(CC_B(_), CC_B((_,_))) => 6 
  case CC_C(CC_C(CC_A(), _), CC_B((_,_))) => 7 
  case CC_C(CC_C(CC_B(_), _), CC_B((_,_))) => 8 
  case CC_C(CC_C(CC_C(_, _), _), CC_B((_,_))) => 9 
  case CC_C(CC_A(), CC_C(CC_A(), CC_A())) => 10 
  case CC_C(CC_B(_), CC_C(CC_A(), CC_A())) => 11 
  case CC_C(CC_C(CC_A(), _), CC_C(CC_A(), CC_A())) => 12 
  case CC_C(CC_C(CC_B(_), _), CC_C(CC_A(), CC_A())) => 13 
  case CC_C(CC_C(CC_C(_, _), _), CC_C(CC_A(), CC_A())) => 14 
  case CC_C(CC_A(), CC_C(CC_B(_), CC_A())) => 15 
  case CC_C(CC_B(_), CC_C(CC_B(_), CC_A())) => 16 
  case CC_C(CC_C(CC_A(), _), CC_C(CC_B(_), CC_A())) => 17 
  case CC_C(CC_C(CC_B(_), _), CC_C(CC_B(_), CC_A())) => 18 
  case CC_C(CC_C(CC_C(_, _), _), CC_C(CC_B(_), CC_A())) => 19 
  case CC_C(CC_A(), CC_C(CC_C(_, _), CC_A())) => 20 
  case CC_C(CC_B(_), CC_C(CC_C(_, _), CC_A())) => 21 
  case CC_C(CC_C(CC_A(), _), CC_C(CC_C(_, _), CC_A())) => 22 
  case CC_C(CC_C(CC_B(_), _), CC_C(CC_C(_, _), CC_A())) => 23 
  case CC_C(CC_C(CC_C(_, _), _), CC_C(CC_C(_, _), CC_A())) => 24 
  case CC_C(CC_A(), CC_C(CC_A(), CC_B(_))) => 25 
  case CC_C(CC_B(_), CC_C(CC_A(), CC_B(_))) => 26 
  case CC_C(CC_C(CC_A(), _), CC_C(CC_A(), CC_B(_))) => 27 
  case CC_C(CC_C(CC_B(_), _), CC_C(CC_A(), CC_B(_))) => 28 
  case CC_C(CC_C(CC_C(_, _), _), CC_C(CC_A(), CC_B(_))) => 29 
  case CC_C(CC_A(), CC_C(CC_B(_), CC_B(_))) => 30 
  case CC_C(CC_B(_), CC_C(CC_B(_), CC_B(_))) => 31 
  case CC_C(CC_C(CC_A(), _), CC_C(CC_B(_), CC_B(_))) => 32 
  case CC_C(CC_C(CC_B(_), _), CC_C(CC_B(_), CC_B(_))) => 33 
  case CC_C(CC_C(CC_C(_, _), _), CC_C(CC_B(_), CC_B(_))) => 34 
  case CC_C(CC_A(), CC_C(CC_C(_, _), CC_B(_))) => 35 
  case CC_C(CC_B(_), CC_C(CC_C(_, _), CC_B(_))) => 36 
  case CC_C(CC_C(CC_A(), _), CC_C(CC_C(_, _), CC_B(_))) => 37 
  case CC_C(CC_C(CC_B(_), _), CC_C(CC_C(_, _), CC_B(_))) => 38 
  case CC_C(CC_C(CC_C(_, _), _), CC_C(CC_C(_, _), CC_B(_))) => 39 
  case CC_C(CC_A(), CC_C(CC_A(), CC_C(_, _))) => 40 
  case CC_C(CC_B(_), CC_C(CC_A(), CC_C(_, _))) => 41 
  case CC_C(CC_C(CC_A(), _), CC_C(CC_A(), CC_C(_, _))) => 42 
  case CC_C(CC_C(CC_B(_), _), CC_C(CC_A(), CC_C(_, _))) => 43 
  case CC_C(CC_C(CC_C(_, _), _), CC_C(CC_A(), CC_C(_, _))) => 44 
  case CC_C(CC_A(), CC_C(CC_B(_), CC_C(_, _))) => 45 
  case CC_C(CC_B(_), CC_C(CC_B(_), CC_C(_, _))) => 46 
  case CC_C(CC_C(CC_A(), _), CC_C(CC_B(_), CC_C(_, _))) => 47 
  case CC_C(CC_C(CC_B(_), _), CC_C(CC_B(_), CC_C(_, _))) => 48 
  case CC_C(CC_C(CC_C(_, _), _), CC_C(CC_B(_), CC_C(_, _))) => 49 
  case CC_C(CC_A(), CC_C(CC_C(_, _), CC_C(_, _))) => 50 
  case CC_C(CC_B(_), CC_C(CC_C(_, _), CC_C(_, _))) => 51 
  case CC_C(CC_C(CC_A(), _), CC_C(CC_C(_, _), CC_C(_, _))) => 52 
  case CC_C(CC_C(CC_B(_), _), CC_C(CC_C(_, _), CC_C(_, _))) => 53 
  case CC_C(CC_C(CC_C(_, _), _), CC_C(CC_C(_, _), CC_C(_, _))) => 54 
}
}