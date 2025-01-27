package Program_31 

package Program_3 

object Test {
sealed trait T_A
sealed trait T_B[A, B]
case class CC_A() extends T_A
case class CC_B(a: Byte, b: T_A, c: CC_A) extends T_A
case class CC_C() extends T_A
case class CC_D[C](a: C) extends T_B[Boolean, CC_C]

val v_a: T_B[Boolean, CC_C] = null
val v_b: Int = v_a match{
  case CC_D(_) => 0 
}
}
// This is not matched: (CC_D (Tuple Boolean Boolean) (Tuple Boolean Wildcard) (T_B Boolean (CC_C T_A)))
// This is not matched: (CC_A Wildcard Wildcard (T_A (T_A Int)))