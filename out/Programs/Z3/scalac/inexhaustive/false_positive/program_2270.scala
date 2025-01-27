package Program_31 

package Program_3 

object Test {
sealed trait T_A
sealed trait T_B
case class CC_A(a: T_B, b: T_A, c: Byte) extends T_A
case class CC_B(a: T_A, b: CC_A) extends T_B
case class CC_C[A]() extends T_B

val v_a: T_B = null
val v_b: Int = v_a match{
  case CC_C() => 0 
  case CC_B(CC_A(_, _, _), _) => 1 
}
}
// This is not matched: (CC_C T_A T_B)
// This is not matched: (CC_A (CC_A Byte Boolean Boolean)
//      Wildcard
//      (T_A (CC_A Byte Boolean Boolean)
//           (T_A (CC_A Byte Boolean Boolean) (CC_A Byte Boolean Boolean))))