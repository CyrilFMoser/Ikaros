package Program_15 

package Program_8 

object Test {
sealed trait T_A
sealed trait T_B
case class CC_A[A](a: A, b: Byte, c: T_A) extends T_A
case class CC_B(a: T_A) extends T_A
case class CC_C(a: Boolean, b: Boolean) extends T_A
case class CC_D(a: T_B, b: T_A) extends T_B
case class CC_E() extends T_B

val v_a: CC_B = null
val v_b: Int = v_a match{
  case CC_B(CC_A(_, _, _)) => 0 
  case CC_B(CC_C(_, _)) => 1 
  case CC_B(CC_B(_)) => 2 
}
}
// This is not matched: (CC_B (CC_A Boolean Boolean Byte (CC_C Wildcard Boolean T_A) T_A) T_A)
// This is not matched: (CC_A (T_A (T_B (Tuple Byte Int))))