package Program_31 

package Program_8 

object Test {
sealed trait T_A[A, B]
sealed trait T_B
case class CC_A[C](a: (T_B,T_B), b: (T_B,Int), c: C) extends T_A[C, T_A[C, C]]
case class CC_B(a: T_B) extends T_B
case class CC_C[D](a: T_B, b: D, c: D) extends T_B
case class CC_D(a: (CC_B,CC_B), b: CC_B) extends T_B

val v_a: T_B = null
val v_b: Int = v_a match{
  case CC_B(CC_D(_, _)) => 0 
  case CC_B(_) => 1 
  case CC_B(CC_B(_)) => 2 
  case CC_D(_, CC_B(_)) => 3 
  case CC_C(CC_B(_), _, _) => 4 
  case CC_C(CC_D(_, _), _, _) => 5 
  case CC_C(_, _, _) => 6 
}
}
// This is not matched: (CC_C T_B Wildcard Wildcard Wildcard T_B)
// This is not matched: Pattern match is empty without constants