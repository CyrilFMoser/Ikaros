package Program_8 

object Test {
sealed trait T_A[A, B]
sealed trait T_B
case class CC_A[C](a: T_A[C, C]) extends T_A[C, T_A[Boolean, Char]]
case class CC_B[D, E](a: (Char,T_B)) extends T_A[D, T_A[Boolean, Char]]
case class CC_C() extends T_B

val v_a: T_A[Int, T_A[Boolean, Char]] = null
val v_b: Int = v_a match{
  case CC_A(_) => 0 
  case CC_B(('x',CC_C())) => 1 
  case CC_B((_,CC_C())) => 2 
}
}