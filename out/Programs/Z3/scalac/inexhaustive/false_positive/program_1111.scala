package Program_31 

package Program_2 

object Test {
sealed trait T_A[A]
case class CC_A[B](a: Byte) extends T_A[B]
case class CC_B[C, D](a: T_A[D], b: Char, c: T_A[C]) extends T_A[C]

val v_a: T_A[Boolean] = null
val v_b: Int = v_a match{
  case CC_A(_) => 0 
  case CC_B(CC_A(_), 'x', _) => 1 
  case CC_B(_, _, _) => 2 
  case CC_B(CC_A(_), _, CC_B(_, _, _)) => 3 
  case CC_B(_, _, CC_A(_)) => 4 
}
}
// This is not matched: (CC_B Boolean Boolean Wildcard Char Wildcard (T_A Boolean))
// This is not matched: (CC_A (CC_B Int (T_A Boolean) (T_A (T_A Boolean)))
//      Wildcard
//      Wildcard
//      Wildcard
//      (T_A (CC_B Int (T_A Boolean) (T_A (T_A Boolean)))))