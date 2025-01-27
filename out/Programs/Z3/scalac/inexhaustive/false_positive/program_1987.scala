package Program_31 

package Program_3 

object Test {
sealed trait T_A[A]
sealed trait T_B[B, C]
case class CC_A[D](a: T_B[D, D], b: T_B[D, D], c: T_A[D]) extends T_A[D]
case class CC_B[E](a: T_B[E, E], b: (Boolean,Byte), c: T_B[E, E]) extends T_A[E]
case class CC_C[F, G, H](a: T_A[H], b: T_B[Byte, F], c: T_B[H, Boolean]) extends T_B[G, F]
case class CC_D[J, I]() extends T_B[J, I]

val v_a: T_B[Int, Boolean] = null
val v_b: Int = v_a match{
  case CC_D() => 0 
  case CC_C(CC_B(_, _, _), _, _) => 1 
  case CC_C(CC_A(_, _, _), _, CC_D()) => 2 
  case CC_C(CC_A(_, _, _), _, _) => 3 
  case CC_C(CC_A(_, _, _), CC_D(), CC_D()) => 4 
  case CC_C(_, CC_D(), _) => 5 
  case CC_C(CC_A(_, _, _), CC_D(), _) => 6 
  case CC_C(CC_A(_, _, _), CC_C(_, _, _), CC_C(_, _, _)) => 7 
  case CC_C(CC_B(_, _, _), CC_D(), _) => 8 
  case CC_C(CC_A(_, _, _), _, CC_C(_, _, _)) => 9 
  case CC_C(CC_B(_, _, _), CC_C(_, _, _), CC_D()) => 10 
  case CC_C(CC_B(_, _, _), CC_C(_, _, _), _) => 11 
  case CC_C(_, _, CC_C(_, _, _)) => 12 
  case CC_C(CC_B(_, _, _), _, CC_C(_, _, _)) => 13 
  case CC_C(CC_A(_, _, _), CC_C(_, _, _), _) => 14 
  case CC_C(_, _, CC_D()) => 15 
  case CC_C(_, CC_C(_, _, _), CC_D()) => 16 
}
}
// This is not matched: (CC_C Boolean Int Boolean Wildcard Wildcard Wildcard (T_B Int Boolean))
// This is not matched: (CC_A Boolean
//      Int
//      Wildcard
//      (CC_B Int Boolean (T_A Int Boolean))
//      (Tuple Wildcard Wildcard)
//      (T_A Boolean Int))