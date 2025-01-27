package Program_31 

object Test {
sealed trait T_A[A, B]
case class CC_B[F, E](a: E) extends T_A[E, F]

val v_a: CC_B[Boolean, Char] = null
val v_b: Int = v_a match{
  case CC_B('x') => 0 
}
}
// This is not matched: (CC_A Int Wildcard (T_A Int))