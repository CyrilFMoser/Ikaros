package Program_31 

package Program_5 

object Test {
sealed trait T_A
sealed trait T_B[A, B]
case class CC_A() extends T_A
case class CC_B(a: T_B[Byte, T_A]) extends T_A
case class CC_C(a: T_A) extends T_A
case class CC_D[C](a: C, b: CC_C, c: Int) extends T_B[C, T_A]
case class CC_E(a: Int, b: CC_C, c: Char) extends T_B[CC_B, T_A]
case class CC_F[D, E, F](a: CC_B) extends T_B[D, E]

val v_a: T_B[CC_B, T_A] = null
val v_b: Int = v_a match{
  case CC_E(_, _, _) => 0 
  case CC_D(_, _, 12) => 1 
  case CC_D(_, CC_C(_), 12) => 2 
  case CC_D(CC_B(_), CC_C(_), _) => 3 
  case CC_D(CC_B(_), _, 12) => 4 
  case CC_D(_, _, _) => 5 
  case CC_D(CC_B(_), _, _) => 6 
  case CC_F(CC_B(_)) => 7 
}
}
// This is not matched: (CC_F (CC_B (T_B T_A T_A) T_A)
//      T_A
//      T_A
//      Wildcard
//      (T_B (CC_B (T_B T_A T_A) T_A) T_A))
// This is not matched: (CC_B Byte Int Wildcard Wildcard (T_A Int Byte))