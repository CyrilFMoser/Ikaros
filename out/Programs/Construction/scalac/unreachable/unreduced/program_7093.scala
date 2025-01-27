package Program_14 

object Test {
sealed trait T_A[A, B]
sealed trait T_B[C, D]
case class CC_A[E, F](a: T_A[E, E], b: T_B[E, F], c: F) extends T_A[E, F]
case class CC_B[H, G, I]() extends T_A[H, G]
case class CC_C[J](a: CC_B[J, J, J]) extends T_B[Byte, J]

val v_a: T_A[Char, Int] = null
val v_b: Int = v_a match{
  case CC_A(_, _, _) => 0 
  case CC_B() => 1 
}
}