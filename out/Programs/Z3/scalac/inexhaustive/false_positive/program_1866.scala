package Program_31 

object Test {
sealed trait T_A[A, B]
case class CC_B[F, E](a: F) extends T_A[F, E]

val v_a: CC_B[Int, Byte] = null
val v_b: Int = v_a match{
  case CC_B(12) => 0 
}
}
// This is not matched: (CC_B Wildcard (T_A (CC_A Boolean Char Boolean Boolean Boolean)))