package Program_25 

object Test {
sealed trait T_A[A, B]
case class CC_A[C](a: T_A[C, C], b: Char) extends T_A[C, T_A[Int, T_A[Int, Int]]]
case class CC_B[D]() extends T_A[D, T_A[Int, T_A[Int, Int]]]
case class CC_C[E](a: CC_B[E]) extends T_A[E, T_A[Int, T_A[Int, Int]]]

val v_a: T_A[Byte, T_A[Int, T_A[Int, Int]]] = null
val v_b: Int = v_a match{
  case CC_A(_, _) => 0 
  case CC_B() => 1 
}
}
// This is not matched: CC_C(CC_B())