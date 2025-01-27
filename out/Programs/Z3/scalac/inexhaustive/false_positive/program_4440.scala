package Program_15 

object Test {
sealed trait T_A[A, B]
sealed trait T_B[C, D]
case class CC_C[H](a: Char) extends T_A[T_B[(Byte,Int), Char], H]

val v_a: CC_C[Boolean] = null
val v_b: Int = v_a match{
  case CC_C('x') => 0 
}
}
// This is not matched: (CC_A Int (T_A Int (T_A Int Int)))