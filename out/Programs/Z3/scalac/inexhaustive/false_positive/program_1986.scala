package Program_29 

object Test {
sealed trait T_A
sealed trait T_B[A, B]
case class CC_A() extends T_A
case class CC_D[E, F](a: Int) extends T_B[F, E]

val v_a: CC_D[CC_A, Int] = null
val v_b: Int = v_a match{
  case CC_D(12) => 0 
}
}
// This is not matched: (CC_A (Tuple (CC_B Wildcard T_A) (CC_C Wildcard T_A)) T_A)