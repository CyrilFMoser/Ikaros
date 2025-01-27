package Program_31 

package Program_7 

object Test {
sealed trait T_A[A, B]
case class CC_A[C, D, E](a: T_A[E, E]) extends T_A[C, D]
case class CC_B[G, F](a: CC_A[F, G, F], b: G, c: T_A[F, F]) extends T_A[G, F]
case class CC_C[H, I](a: T_A[Byte, H], b: (Char,Char)) extends T_A[CC_A[H, H, H], H]

val v_a: T_A[Byte, Int] = null
val v_b: Int = v_a match{
  case CC_B(CC_A(_), 0, _) => 0 
  case CC_B(CC_A(_), _, CC_B(_, _, _)) => 1 
  case CC_B(CC_A(_), _, _) => 2 
  case CC_B(_, 0, CC_A(_)) => 3 
  case CC_B(CC_A(_), 0, CC_B(_, _, _)) => 4 
  case CC_B(_, _, CC_B(_, _, _)) => 5 
  case CC_B(_, 0, CC_B(_, _, _)) => 6 
  case CC_B(_, _, CC_A(_)) => 7 
  case CC_A(_) => 8 
}
}
// This is not matched: (CC_A Byte
//      Int
//      (CC_C Boolean Boolean Boolean (T_A Boolean (T_A Boolean Boolean)) Boolean)
//      Wildcard
//      (T_A Byte Int))
// This is not matched: (CC_A Int
//      Boolean
//      (CC_B Int (Tuple Int Boolean) Byte (T_A Int (Tuple Int Boolean)))
//      Wildcard
//      (T_A Int Boolean))