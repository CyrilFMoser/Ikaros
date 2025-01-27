package Program_30 

package Program_5 

object Test {
sealed trait T_A[A, B]
case class CC_A[D, C, E]() extends T_A[D, C]

val v_a: T_A[Int, Boolean] = null
val v_b: Int = v_a match{
  case CC_A() => 0 
}
}
// This is not matched: (CC_A Int Boolean Boolean (T_A Int Boolean))
// This is not matched: (CC_B Int Wildcard Wildcard Wildcard (T_A Int))