package Program_12 

package Program_12 

object Test {
sealed trait T_A[A]
sealed trait T_B
case class CC_A[B, C](a: C, b: C, c: B) extends T_A[B]
case class CC_B() extends T_A[T_A[T_B]]
case class CC_C(a: (CC_B,CC_B), b: CC_B, c: (T_B,T_B)) extends T_B
case class CC_D(a: Byte) extends T_B
case class CC_E(a: T_B, b: CC_A[Char, (Char,Char)], c: CC_B) extends T_B

val v_a: T_A[CC_E] = null
val v_b: Int = v_a match{
  case CC_A(_, _, _) => 0 
}
}
// This is not matched: (CC_A (CC_E T_B T_B T_B T_B)
//      (CC_B T_B)
//      (CC_B (T_A (T_A T_B)))
//      Wildcard
//      Wildcard
//      (T_A (CC_E T_B T_B T_B T_B)))
// This is not matched: (CC_A Wildcard (T_A (T_A Char)))