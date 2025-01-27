package Program_22 

object Test {
sealed trait T_A[A, B]
sealed trait T_B[C, D]
case class CC_A[E, F](a: T_B[E, F], b: T_A[F, F]) extends T_A[F, E]
case class CC_B[G, H](a: T_A[H, H]) extends T_A[H, G]
case class CC_C(a: Char, b: Boolean, c: T_A[Char, T_B[Byte, Char]]) extends T_B[CC_B[CC_B[Boolean, Int], T_A[Boolean, Char]], T_A[T_A[Byte, Int], (Byte,Int)]]
case class CC_D(a: (CC_A[(Byte,Char), CC_C],CC_A[Char, Byte]), b: CC_C, c: T_A[CC_B[Int, CC_C], T_A[CC_C, Byte]]) extends T_B[CC_B[CC_B[Boolean, Int], T_A[Boolean, Char]], T_A[T_A[Byte, Int], (Byte,Int)]]

val v_a: T_B[CC_B[CC_B[Boolean, Int], T_A[Boolean, Char]], T_A[T_A[Byte, Int], (Byte,Int)]] = null
val v_b: Int = v_a match{
  case CC_C(_, _, CC_A(_, _)) => 0 
  case CC_C(_, _, CC_B(_)) => 1 
  case CC_D((_,_), CC_C(_, _, _), CC_A(_, _)) => 2 
}
}
// This is not matched: CC_D((_,_), CC_C(_, _, _), CC_B(_))