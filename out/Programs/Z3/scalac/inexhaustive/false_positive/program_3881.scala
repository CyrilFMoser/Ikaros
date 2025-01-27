package Program_15 

package Program_2 

object Test {
sealed trait T_A
sealed trait T_B[A, B]
case class CC_A[C]() extends T_A
case class CC_B(a: Byte, b: Boolean, c: T_A) extends T_A
case class CC_C[D]() extends T_B[CC_B, D]
case class CC_D(a: CC_C[CC_B], b: (T_A,Char), c: Int) extends T_B[CC_B, CC_A[CC_B]]

val v_a: CC_B = null
val v_b: Int = v_a match{
  case CC_B(0, _, _) => 0 
  case CC_B(0, _, CC_A()) => 1 
}
}
// This is not matched: Pattern match is empty without constants
// This is not matched: (CC_C Boolean (T_A Boolean (T_A Boolean Boolean)))