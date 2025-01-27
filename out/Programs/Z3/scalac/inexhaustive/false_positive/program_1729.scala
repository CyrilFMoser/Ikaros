package Program_31 

object Test {
sealed trait T_A[A, B]
case class CC_B[E, F](a: E) extends T_A[F, E]

val v_a: CC_B[Byte, Int] = null
val v_b: Int = v_a match{
  case CC_B(0) => 0 
}
}
// This is not matched: (CC_A T_A)