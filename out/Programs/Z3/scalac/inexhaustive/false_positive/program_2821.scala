package Program_31 

package Program_12 

object Test {
sealed trait T_A[A, B]
sealed trait T_B[C]
case class CC_A() extends T_A[T_A[Byte, Char], T_B[(Char,Byte)]]
case class CC_B[D]() extends T_A[T_A[CC_A, CC_A], D]
case class CC_C[E](a: T_B[CC_A], b: E, c: CC_A) extends T_A[T_A[Byte, Char], T_B[(Char,Byte)]]
case class CC_D[F](a: (Char,CC_A), b: F) extends T_B[F]
case class CC_E[G](a: G, b: Int, c: T_A[G, G]) extends T_B[G]
case class CC_F[H](a: (CC_A,CC_A), b: H, c: CC_E[H]) extends T_B[H]

val v_a: T_A[T_A[Byte, Char], T_B[(Char,Byte)]] = null
val v_b: Int = v_a match{
  case CC_A() => 0 
  case CC_C(CC_D(_, _), _, _) => 1 
  case CC_C(_, _, CC_A()) => 2 
  case CC_C(CC_F(_, _, _), _, _) => 3 
  case CC_C(CC_F(_, _, _), _, CC_A()) => 4 
  case CC_C(CC_D(_, _), _, CC_A()) => 5 
  case CC_C(CC_E(_, _, _), _, _) => 6 
}
}
// This is not matched: (CC_C Boolean
//      Wildcard
//      Wildcard
//      Wildcard
//      (T_A (T_A Byte Char) (T_B (Tuple Char Byte))))
// This is not matched: Pattern match is empty without constants