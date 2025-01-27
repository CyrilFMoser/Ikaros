package Program_30 

package Program_5 

object Test {
sealed trait T_A[A, B]
case class CC_A[D, C, E]() extends T_A[C, D]

val v_a: T_A[Byte, Boolean] = null
val v_b: Int = v_a match{
  case CC_A() => 0 
}
}
// This is not matched: (CC_A Boolean Byte Boolean (T_A Byte Boolean))
// This is not matched: Pattern match is empty without constants