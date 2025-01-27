package Program_29 

package Program_5 

object Test {
sealed trait T_A
sealed trait T_B
case class CC_A(a: T_A, b: T_B, c: T_A) extends T_A
case class CC_B(a: T_A, b: Char) extends T_A
case class CC_C(a: T_A) extends T_B
case class CC_D() extends T_B
case class CC_E[A]() extends T_B

val v_a: T_B = null
val v_b: Int = v_a match{
  case CC_D() => 0 
  case CC_C(_) => 1 
  case CC_E() => 2 
}
}
// This is not matched: (CC_E T_A T_B)
// This is not matched: Pattern match is empty without constants