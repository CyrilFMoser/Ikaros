package Program_31 

package Program_3 

object Test {
sealed trait T_A[A]
case class CC_A[B, C](a: (Int,Int), b: T_A[C]) extends T_A[B]
case class CC_B(a: Byte, b: CC_A[Boolean, Boolean]) extends T_A[T_A[Int]]

val v_a: T_A[T_A[Int]] = null
val v_b: Int = v_a match{
  case CC_A((_,12), CC_A(_, _)) => 0 
  case CC_A((_,12), CC_B(_, _)) => 1 
  case CC_A(_, CC_A(_, _)) => 2 
  case CC_A((12,_), CC_B(_, _)) => 3 
  case CC_A((_,_), CC_A(_, _)) => 4 
  case CC_A((_,_), _) => 5 
  case CC_B(_, CC_A(_, _)) => 6 
  case CC_B(_, _) => 7 
}
}
// This is not matched: (CC_A (T_A Int) Boolean Wildcard Wildcard (T_A (T_A Int)))
// This is not matched: Pattern match is empty without constants