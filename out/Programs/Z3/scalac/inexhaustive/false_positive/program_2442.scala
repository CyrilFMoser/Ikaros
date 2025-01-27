package Program_31 

package Program_11 

object Test {
sealed trait T_A[A]
case class CC_A[B, C]() extends T_A[B]
case class CC_B[D](a: D, b: T_A[D], c: D) extends T_A[D]

val v_a: CC_B[Byte] = null
val v_b: Int = v_a match{
  case CC_B(0, CC_A(), _) => 0 
  case CC_B(0, CC_A(), 0) => 1 
  case CC_B(_, CC_A(), _) => 2 
  case CC_B(0, CC_B(_, _, _), _) => 3 
  case CC_B(_, CC_B(_, _, _), _) => 4 
}
}
// This is not matched: (CC_B Byte Wildcard (CC_A Byte Boolean (T_A Byte)) Wildcard (T_A Byte))
// This is not matched: (CC_C Wildcard T_A)