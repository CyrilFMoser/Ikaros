package Program_14 

object Test {
sealed trait T_A[A]
case class CC_A[B](a: B) extends T_A[B]

val v_a: CC_A[Char] = null
val v_b: Int = v_a match{
  case CC_A('x') => 0 
}
}
// This is not matched: (CC_A Wildcard Wildcard Wildcard (T_A Int))