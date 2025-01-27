package Program_31 

package Program_13 

object Test {
sealed trait T_A[A, B]
sealed trait T_B[C]
case class CC_A[E, D, F]() extends T_A[D, E]

val v_a: T_A[Boolean, Byte] = null
val v_b: Int = v_a match{
  case CC_A() => 0 
}
}
// This is not matched: (CC_A Byte Boolean Boolean (T_A Boolean Byte))
// This is not matched: (CC_D Wildcard T_B)