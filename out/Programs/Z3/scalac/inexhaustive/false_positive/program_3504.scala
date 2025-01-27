package Program_13 

package Program_12 

object Test {
sealed trait T_A[A]
case class CC_A[B](a: T_A[Boolean]) extends T_A[T_A[Int]]
case class CC_B(a: CC_A[Byte], b: CC_A[Char], c: CC_A[Boolean]) extends T_A[T_A[Int]]

val v_a: T_A[T_A[Int]] = null
val v_b: Int = v_a match{
  case CC_A(_) => 0 
  case CC_B(_, CC_A(_), CC_A(_)) => 1 
  case CC_B(_, CC_A(_), _) => 2 
  case CC_B(CC_A(_), _, CC_A(_)) => 3 
  case CC_B(CC_A(_), CC_A(_), _) => 4 
}
}
// This is not matched: (CC_A Boolean Wildcard (T_A (T_A Int)))
// This is not matched: Pattern match is empty without constants