package Program_29 

object Test {
sealed trait T_A[A]
case class CC_C[F](a: F) extends T_A[F]

val v_a: CC_C[Char] = null
val v_b: Int = v_a match{
  case CC_C('x') => 0 
}
}
// This is not matched: (CC_C Boolean Wildcard (T_A Boolean))