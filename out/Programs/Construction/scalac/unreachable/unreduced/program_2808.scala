package Program_9 

object Test {
sealed trait T_A[A, B]
case class CC_A[C]() extends T_A[C, T_A[C, C]]
case class CC_B[D](a: Byte, b: T_A[D, T_A[D, D]]) extends T_A[D, T_A[D, D]]
case class CC_C[E](a: (Char,T_A[Char, Int]), b: (CC_A[Byte],CC_A[Int])) extends T_A[E, T_A[E, E]]

val v_a: T_A[Boolean, T_A[Boolean, Boolean]] = null
val v_b: Int = v_a match{
  case CC_A() => 0 
  case CC_B(_, CC_A()) => 1 
  case CC_B(_, CC_B(_, CC_A())) => 2 
  case CC_B(_, CC_B(_, CC_B(_, _))) => 3 
  case CC_B(_, CC_B(_, CC_C(_, _))) => 4 
  case CC_B(_, CC_C((_,_), _)) => 5 
  case CC_C(('x',_), _) => 6 
  case CC_C((_,_), _) => 7 
}
}