package Program_16 

object Test {
sealed trait T_A[A, B]
case class CC_A[C](a: C, b: T_A[C, C]) extends T_A[Boolean, C]
case class CC_B[D](a: (Char,CC_A[Char]), b: D, c: T_A[Boolean, D]) extends T_A[Boolean, D]

val v_a: T_A[Boolean, Int] = null
val v_b: Int = v_a match{
  case CC_A(12, _) => 0 
  case CC_A(_, _) => 1 
  case CC_B(_, _, _) => 2 
}
}