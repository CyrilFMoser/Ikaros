package Program_15 

object Test {
sealed trait T_A[A, B]
case class CC_C[E](a: Int) extends T_A[E, T_A[E, E]]

val v_a: CC_C[Boolean] = null
val v_b: Int = v_a match{
  case CC_C(12) => 0 
}
}
// This is not matched: (CC_A Boolean Boolean Wildcard Wildcard (T_A Boolean Boolean))