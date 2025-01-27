package Program_30 

package Program_1 

object Test {
sealed trait T_A[A, B]
case class CC_A[D, C, E]() extends T_A[C, D]

val v_a: T_A[Boolean, Boolean] = null
val v_b: Int = v_a match{
  case CC_A() => 0 
}
}
// This is not matched: (CC_A Boolean Boolean Boolean (T_A Boolean Boolean))
// This is not matched: Pattern match is empty without constants