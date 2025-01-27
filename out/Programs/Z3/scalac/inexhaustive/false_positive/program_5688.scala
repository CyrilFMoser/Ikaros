package Program_12 

package Program_4 

object Test {
sealed trait T_A[A]
case class CC_A[B](a: T_A[B]) extends T_A[B]
case class CC_B[C]() extends T_A[C]
case class CC_C[D, E](a: CC_B[D]) extends T_A[D]

val v_a: T_A[Char] = null
val v_b: Int = v_a match{
  case CC_B() => 0 
  case CC_C(CC_B()) => 1 
  case CC_A(_) => 2 
  case CC_A(CC_B()) => 3 
}
}
// This is not matched: (CC_C Char (T_A Boolean) Wildcard (T_A Char))
// This is not matched: (CC_A T_A T_A)