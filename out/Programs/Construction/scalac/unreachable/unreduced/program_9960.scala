package Program_26 

object Test {
sealed trait T_A
sealed trait T_B[A]
case class CC_A(a: ((T_A,T_A),T_B[T_A]), b: T_B[T_A], c: T_A) extends T_A
case class CC_B(a: T_A, b: T_B[(T_A,T_A)]) extends T_A
case class CC_C() extends T_A
case class CC_D(a: CC_A, b: CC_A) extends T_B[T_B[(CC_B,T_A)]]
case class CC_E(a: CC_B, b: Int) extends T_B[T_B[(CC_B,T_A)]]

val v_a: T_A = null
val v_b: Int = v_a match{
  case CC_A(((_,_),_), _, CC_A((_,_), _, CC_A(_, _, _))) => 0 
  case CC_A(((_,_),_), _, CC_A((_,_), _, CC_B(_, _))) => 1 
  case CC_A(((_,_),_), _, CC_A((_,_), _, CC_C())) => 2 
  case CC_A(((_,_),_), _, CC_B(_, _)) => 3 
  case CC_A(((_,_),_), _, CC_C()) => 4 
  case CC_B(CC_A((_,_), _, CC_A(_, _, _)), _) => 5 
  case CC_B(CC_A((_,_), _, CC_B(_, _)), _) => 6 
  case CC_B(CC_A((_,_), _, CC_C()), _) => 7 
  case CC_B(CC_B(CC_A(_, _, _), _), _) => 8 
  case CC_B(CC_B(CC_B(_, _), _), _) => 9 
  case CC_B(CC_B(CC_C(), _), _) => 10 
  case CC_B(CC_C(), _) => 11 
  case CC_C() => 12 
}
}