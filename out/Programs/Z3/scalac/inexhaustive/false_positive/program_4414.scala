package Program_12 

package Program_5 

object Test {
sealed trait T_A[A, B]
case class CC_A[D, C, E](a: T_A[E, E]) extends T_A[D, C]

val v_a: T_A[Int, Boolean] = null
val v_b: Int = v_a match{
  case CC_A(_) => 0 
}
}
// This is not matched: (CC_A Int Boolean Boolean Wildcard (T_A Int Boolean))
// This is not matched: (CC_B T_A)