package Program_31 

package Program_7 

object Test {
sealed trait T_A
sealed trait T_B
case class CC_A(a: T_B, b: T_B, c: T_A) extends T_A
case class CC_B[A]() extends T_B

val v_a: T_B = null
val v_b: Int = v_a match{
  case CC_B() => 0 
}
}
// This is not matched: (CC_B T_A T_B)
// This is not matched: (CC_C Char Wildcard (T_A (T_A Byte Char) Char))