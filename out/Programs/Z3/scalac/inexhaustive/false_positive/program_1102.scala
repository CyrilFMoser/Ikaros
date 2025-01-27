package Program_31 

package Program_10 

object Test {
sealed trait T_A[A]
sealed trait T_B
case class CC_A[B](a: Char, b: T_A[B]) extends T_A[B]
case class CC_B(a: T_B, b: (Char,T_B)) extends T_B
case class CC_C(a: (CC_B,T_B)) extends T_B
case class CC_D[C](a: CC_C, b: CC_C) extends T_B

val v_a: T_B = null
val v_b: Int = v_a match{
  case CC_C(_) => 0 
  case CC_D(CC_C(_), CC_C(_)) => 1 
  case CC_D(_, _) => 2 
  case CC_B(CC_C(_), (_,CC_B(_, _))) => 3 
  case CC_B(CC_D(_, _), ('x',CC_D(_, _))) => 4 
  case CC_B(_, _) => 5 
}
}
// This is not matched: (CC_D T_B Wildcard Wildcard T_B)
// This is not matched: (CC_B Wildcard Wildcard T_B)