package Program_15 

package Program_3 

object Test {
sealed trait T_A
sealed trait T_B[A]
case class CC_A() extends T_A
case class CC_B(a: CC_A) extends T_A
case class CC_C[B](a: CC_B, b: B) extends T_A
case class CC_D[C](a: C, b: (CC_A,T_A), c: C) extends T_B[C]
case class CC_E(a: T_B[Char], b: T_B[Char]) extends T_B[Char]
case class CC_F(a: T_B[CC_A], b: CC_A, c: (CC_A,Int)) extends T_B[Char]

val v_a: T_A = null
val v_b: Int = v_a match{
  case CC_B(_) => 0 
  case CC_B(CC_A()) => 1 
  case CC_A() => 2 
  case CC_C(_, _) => 3 
}
}
// This is not matched: (CC_C T_A Wildcard Wildcard T_A)
// This is not matched: (CC_A T_A)