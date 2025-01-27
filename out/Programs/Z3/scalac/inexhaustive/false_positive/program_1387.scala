package Program_31 

package Program_5 

object Test {
sealed trait T_A[A, B]
sealed trait T_B[C]
case class CC_A[D, E, F](a: Int, b: T_B[D], c: F) extends T_A[E, D]
case class CC_B[G, H](a: T_A[G, G], b: T_A[G, H], c: Byte) extends T_A[G, H]
case class CC_C[I](a: T_A[I, I]) extends T_A[I, T_A[Int, Char]]
case class CC_D[J](a: CC_C[J], b: T_B[J]) extends T_B[J]

val v_a: T_A[Char, Int] = null
val v_b: Int = v_a match{
  case CC_A(_, _, _) => 0 
  case CC_B(_, CC_A(_, _, _), 0) => 1 
  case CC_B(_, _, _) => 2 
  case CC_B(_, CC_B(_, _, _), _) => 3 
  case CC_B(CC_A(_, _, _), CC_A(_, _, _), 0) => 4 
  case CC_B(CC_A(_, _, _), CC_B(_, _, _), _) => 5 
  case CC_B(CC_A(_, _, _), _, 0) => 6 
  case CC_B(CC_B(_, _, _), CC_B(_, _, _), 0) => 7 
}
}
// This is not matched: (CC_A Int
//      Char
//      (T_B (T_A (T_A Boolean (T_A Boolean Boolean)) Boolean))
//      Wildcard
//      Wildcard
//      Wildcard
//      (T_A Char Int))
// This is not matched: (CC_A (T_A Boolean) (T_A (T_A Boolean)))