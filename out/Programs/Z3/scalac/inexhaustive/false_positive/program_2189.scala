package Program_31 

package Program_5 

object Test {
sealed trait T_A[A]
case class CC_A[B](a: T_A[B], b: T_A[B]) extends T_A[B]
case class CC_B[C, D](a: T_A[C]) extends T_A[C]

val v_a: T_A[Int] = null
val v_b: Int = v_a match{
  case CC_B(_) => 0 
  case CC_A(CC_B(_), CC_B(_)) => 1 
  case CC_A(_, _) => 2 
  case CC_A(CC_A(_, _), CC_A(_, _)) => 3 
  case CC_A(CC_A(_, _), _) => 4 
}
}
// This is not matched: (CC_B Int Boolean Wildcard (T_A Int))
// This is not matched: (CC_A Int Boolean Wildcard (T_A (Tuple Byte Char) Int))