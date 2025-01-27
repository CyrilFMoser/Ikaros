package Program_14 

object Test {
sealed trait T_A[A, B]
case class CC_A[C](a: Char) extends T_A[C, (Int,Boolean)]

val v_a: CC_A[Boolean] = null
val v_b: Int = v_a match{
  case CC_A('x') => 0 
}
}
// This is not matched: (CC_B Wildcard Wildcard Wildcard (T_A Int))