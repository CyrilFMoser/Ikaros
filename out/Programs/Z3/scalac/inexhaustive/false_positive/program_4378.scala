package Program_15 

package Program_11 

object Test {
sealed trait T_A[A]
sealed trait T_B[B, C]
case class CC_A[D](a: T_A[D], b: T_A[D]) extends T_A[D]
case class CC_B[E, F](a: CC_A[E], b: T_A[F], c: T_A[F]) extends T_A[E]
case class CC_C[H, G, I](a: Boolean, b: CC_B[G, I], c: T_A[H]) extends T_B[H, G]
case class CC_D[J](a: CC_C[J, J, J], b: T_B[J, J], c: T_A[J]) extends T_B[(Char,Byte), J]

val v_a: T_A[Int] = null
val v_b: Int = v_a match{
  case CC_A(CC_B(_, _, _), _) => 0 
  case CC_A(_, CC_A(_, _)) => 1 
  case CC_A(CC_A(_, _), CC_A(_, _)) => 2 
  case CC_A(_, CC_B(_, _, _)) => 3 
  case CC_B(_, CC_A(_, _), CC_B(_, _, _)) => 4 
  case CC_B(CC_A(_, _), CC_B(_, _, _), _) => 5 
  case CC_B(CC_A(_, _), _, CC_A(_, _)) => 6 
  case CC_B(CC_A(_, _), CC_A(_, _), CC_B(_, _, _)) => 7 
  case CC_B(_, CC_B(_, _, _), CC_B(_, _, _)) => 8 
  case CC_B(_, _, _) => 9 
  case CC_B(_, CC_A(_, _), _) => 10 
  case CC_B(CC_A(_, _), CC_A(_, _), CC_A(_, _)) => 11 
  case CC_B(CC_A(_, _), CC_A(_, _), _) => 12 
  case CC_B(_, _, CC_A(_, _)) => 13 
  case CC_B(_, CC_B(_, _, _), CC_A(_, _)) => 14 
}
}
// This is not matched: (CC_B Int Boolean Wildcard Wildcard Wildcard (T_A Int))
// This is not matched: (CC_E Wildcard Wildcard (T_B (CC_C T_A T_A T_A)))