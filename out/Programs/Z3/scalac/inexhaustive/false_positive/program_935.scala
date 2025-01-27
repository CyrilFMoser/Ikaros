package Program_31 

object Test {
sealed trait T_A[A]
sealed trait T_B[B]
case class CC_A(a: T_A[Char], b: T_A[Boolean], c: T_B[Boolean]) extends T_A[T_B[Int]]
case class CC_C[C]() extends T_B[C]
case class CC_D[D]() extends T_B[D]

val v_a: T_A[T_B[Int]] = null
val v_b: Int = v_a match{
  case CC_A(_, _, CC_D()) => 0 
}
}
// This is not matched: (CC_B T_A)