package Program_31 

object Test {
sealed trait T_A[A, B]
sealed trait T_B
case class CC_A[F, E](a: Byte) extends T_A[E, F]

val v_a: CC_A[T_B, Int] = null
val v_b: Int = v_a match{
  case CC_A(0) => 0 
}
}
// This is not matched: (CC_A Wildcard T_A)