package Program_30 

package Program_3 

object Test {
sealed trait T_A[A]
sealed trait T_B
case class CC_A[B](a: T_A[Char], b: T_B) extends T_A[Char]
case class CC_B(a: Boolean, b: T_A[T_B], c: T_A[Char]) extends T_B

val v_a: T_A[Char] = null
val v_b: Int = v_a match{
  case CC_A(_, _) => 0 
  case CC_A(CC_A(_, _), CC_B(_, _, _)) => 1 
}
}
// This is not matched: (CC_A T_B
//      (CC_A T_B Wildcard (CC_B Boolean Wildcard Wildcard T_B) (T_A Char))
//      Wildcard
//      (T_A Char))
// This is not matched: (CC_A Int Boolean (T_A Int Boolean))