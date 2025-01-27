package Program_15 

package Program_15 

object Test {
sealed trait T_A[A, B]
sealed trait T_B[C, D]
case class CC_A[E, F](a: T_B[F, F], b: T_A[F, E], c: T_A[E, F]) extends T_A[E, T_B[E, E]]
case class CC_B(a: T_A[Byte, Int], b: CC_A[Char, Byte]) extends T_A[(Char,Char), T_B[(Char,Char), (Char,Char)]]
case class CC_C() extends T_A[(Char,Char), T_B[(Char,Char), (Char,Char)]]
case class CC_D[H, G](a: T_B[H, H]) extends T_B[H, G]

val v_a: T_A[(Char,Char), T_B[(Char,Char), (Char,Char)]] = null
val v_b: Int = v_a match{
  case CC_C() => 0 
  case CC_B(_, CC_A(_, _, _)) => 1 
  case CC_A(CC_D(_), _, CC_C()) => 2 
  case CC_A(_, _, _) => 3 
  case CC_A(_, _, CC_B(_, _)) => 4 
  case CC_A(_, _, CC_A(_, _, _)) => 5 
  case CC_A(CC_D(_), _, _) => 6 
}
}
// This is not matched: (CC_A (Tuple Char Char)
//      Boolean
//      Wildcard
//      Wildcard
//      Wildcard
//      (T_A (Tuple Char Char) (T_B (Tuple Char Char) (Tuple Char Char))))
// This is not matched: (CC_A (Tuple Char Char)
//      Boolean
//      Wildcard
//      Wildcard
//      Wildcard
//      (T_A (Tuple Char Char) (T_B (Tuple Char Char) (Tuple Char Char))))