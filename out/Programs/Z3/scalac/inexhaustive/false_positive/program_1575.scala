package Program_31 

package Program_13 

object Test {
sealed trait T_A
sealed trait T_B[A]
case class CC_A() extends T_A
case class CC_B(a: CC_A) extends T_A
case class CC_C() extends T_B[CC_A]
case class CC_D[B, C](a: C, b: Byte, c: T_B[B]) extends T_B[B]

val v_a: T_B[Int] = null
val v_b: Int = v_a match{
  case CC_D(_, _, _) => 0 
  case CC_D(_, _, CC_D(_, _, _)) => 1 
}
}
// This is not matched: (CC_D Int T_A Wildcard Wildcard Wildcard (T_B Int))
// This is not matched: (CC_A Wildcard Wildcard (T_A (T_A Int)))