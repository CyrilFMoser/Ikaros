package Program_31 

package Program_0 

object Test {
sealed trait T_A[A]
sealed trait T_B[B]
case class CC_A[C](a: C) extends T_A[C]
case class CC_B[D, E]() extends T_A[D]

val v_a: T_A[Boolean] = null
val v_b: Int = v_a match{
  case CC_A(_) => 0 
  case CC_B() => 1 
}
}
// This is not matched: (CC_B Boolean Boolean (T_A Boolean))
// This is not matched: (CC_A (CC_A Wildcard T_A) T_A)