package Program_15 

package Program_11 

object Test {
sealed trait T_A[A]
sealed trait T_B[B, C]
case class CC_A[D]() extends T_A[D]
case class CC_B() extends T_A[CC_A[Byte]]
case class CC_C[E, F](a: Byte, b: Boolean) extends T_A[E]

val v_a: T_A[CC_A[Byte]] = null
val v_b: Int = v_a match{
  case CC_A() => 0 
  case CC_B() => 1 
  case CC_C(_, _) => 2 
  case CC_C(0, _) => 3 
}
}
// This is not matched: (CC_C (CC_A Byte Boolean) Boolean Wildcard Wildcard (T_A (CC_A Byte Boolean)))
// This is not matched: (CC_E T_B)