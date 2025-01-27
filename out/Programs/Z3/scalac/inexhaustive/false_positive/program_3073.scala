package Program_14 

object Test {
sealed trait T_A[A, B]
case class CC_A[E, F](a: Int) extends T_A[F, E]

val v_a: CC_A[Int, Boolean] = null
val v_b: Int = v_a match{
  case CC_A(12) => 0 
}
}
// This is not matched: (CC_A (Tuple (CC_C T_A Int T_A) (CC_C Wildcard Wildcard T_A)) T_A)