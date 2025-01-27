package Program_15 

object Test {
sealed trait T_A
sealed trait T_B[A, B]
case class CC_A(a: T_B[T_A, (Char,T_A)], b: Int, c: T_A) extends T_A
case class CC_B() extends T_A
case class CC_C[C](a: Boolean, b: T_B[C, T_A], c: T_B[T_A, T_A]) extends T_B[C, T_A]

val v_a: T_A = null
val v_b: Int = v_a match{
  case CC_A(_, _, CC_A(_, _, CC_B())) => 0 
  case CC_A(_, _, CC_B()) => 1 
  case CC_B() => 2 
}
}
// This is not matched: CC_A(_, _, CC_A(_, _, CC_A(_, _, _)))