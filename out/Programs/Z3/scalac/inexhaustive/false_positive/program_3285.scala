package Program_14 

package Program_7 

object Test {
sealed trait T_A[A]
sealed trait T_B[B]
case class CC_A(a: (Char,Byte), b: Char) extends T_A[Boolean]
case class CC_B(a: T_A[Boolean], b: Byte, c: T_A[CC_A]) extends T_A[Boolean]
case class CC_C() extends T_A[Boolean]
case class CC_D[C, D]() extends T_B[C]

val v_a: T_B[Byte] = null
val v_b: Int = v_a match{
  case CC_D() => 0 
}
}
// This is not matched: (CC_D Byte Boolean (T_B Byte))
// This is not matched: (CC_C (CC_C (CC_B T_B) Wildcard Wildcard T_B) Wildcard Wildcard T_B)