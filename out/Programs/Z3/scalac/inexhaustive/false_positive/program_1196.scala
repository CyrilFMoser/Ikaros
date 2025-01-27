package Program_31 

package Program_6 

object Test {
sealed trait T_A
sealed trait T_B[A, B]
case class CC_A() extends T_A
case class CC_B(a: T_B[T_A, CC_A], b: CC_A) extends T_A
case class CC_C[C, D]() extends T_B[C, Byte]

val v_a: T_B[CC_A, Byte] = null
val v_b: Int = v_a match{
  case CC_C() => 0 
}
}
// This is not matched: (CC_C (CC_A (T_B T_A T_A)) T_A (T_B (CC_A (T_B T_A T_A)) Byte))
// This is not matched: (CC_A Wildcard Wildcard T_A)