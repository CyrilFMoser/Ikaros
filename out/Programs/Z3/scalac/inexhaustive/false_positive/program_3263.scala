package Program_15 

package Program_9 

object Test {
sealed trait T_A[A, B]
sealed trait T_B[C, D]
case class CC_A[E, F](a: T_B[Char, F], b: ((Char,Boolean),Boolean), c: T_B[Byte, E]) extends T_A[E, F]
case class CC_B[G, H](a: T_A[G, H], b: T_A[H, H]) extends T_A[Int, G]
case class CC_C[I](a: T_A[I, I]) extends T_B[I, T_A[Boolean, Int]]

val v_a: T_A[Int, Int] = null
val v_b: Int = v_a match{
  case CC_A(_, ((_,_),_), _) => 0 
  case CC_B(CC_A(_, _, _), _) => 1 
  case CC_B(CC_B(_, _), CC_B(_, _)) => 2 
  case CC_B(CC_A(_, _, _), CC_A(_, _, _)) => 3 
  case CC_B(CC_B(_, _), _) => 4 
  case CC_B(_, _) => 5 
  case CC_B(_, CC_B(_, _)) => 6 
}
}
// This is not matched: (CC_B Int Boolean Wildcard Wildcard (T_A Int Int))
// This is not matched: (CC_C Char Wildcard Wildcard Wildcard (T_A Char Boolean))