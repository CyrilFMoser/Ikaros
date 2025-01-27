package Program_17 

object Test {
sealed trait T_A[A, B]
case class CC_A[C](a: Int, b: T_A[C, C], c: T_A[C, T_A[C, C]]) extends T_A[C, T_A[C, C]]
case class CC_B[D]() extends T_A[D, T_A[D, D]]
case class CC_C[E](a: T_A[CC_B[E], T_A[CC_B[E], CC_B[E]]], b: CC_A[E]) extends T_A[CC_B[CC_B[Byte]], E]

val v_a: T_A[CC_B[CC_B[Byte]], T_A[CC_B[CC_B[Byte]], CC_B[CC_B[Byte]]]] = null
val v_b: Int = v_a match{
  case CC_A(_, _, CC_A(_, CC_C(_, _), CC_A(_, _, _))) => 0 
  case CC_A(_, _, CC_A(_, CC_C(_, _), CC_B())) => 1 
  case CC_A(_, _, CC_A(_, CC_C(_, _), CC_C(_, _))) => 2 
  case CC_A(_, _, CC_B()) => 3 
  case CC_A(_, _, CC_C(CC_A(_, _, _), _)) => 4 
  case CC_A(_, _, CC_C(CC_B(), _)) => 5 
  case CC_B() => 6 
  case CC_C(CC_A(_, _, _), _) => 7 
  case CC_C(CC_B(), _) => 8 
}
}