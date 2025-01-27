package Program_14 

object Test {
sealed trait T_A[A, B]
case class CC_B[F, E](a: E) extends T_A[E, F]

val v_a: CC_B[Int, Byte] = null
val v_b: Int = v_a match{
  case CC_B(0) => 0 
}
}
// This is not matched: (CC_A Wildcard T_A)