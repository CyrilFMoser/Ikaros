package Program_15 

package Program_6 

object Test {
sealed trait T_A[A]
sealed trait T_B[B]
case class CC_A(a: (Char,(Int,Char))) extends T_A[T_A[Char]]
case class CC_B[C](a: T_A[C]) extends T_A[T_A[Char]]
case class CC_C[D](a: T_B[D], b: T_B[D], c: CC_A) extends T_B[D]
case class CC_D[E](a: T_B[E], b: T_B[CC_A]) extends T_B[E]
case class CC_E[F](a: CC_B[F], b: F) extends T_B[F]

val v_a: T_A[T_A[Char]] = null
val v_b: Int = v_a match{
  case CC_A((_,(_,_))) => 0 
  case CC_B(CC_B(_)) => 1 
}
}
// This is not matched: (CC_B (T_A Char)
//      (CC_B (T_A (T_A (T_A Boolean))) Wildcard (T_A (T_A Char)))
//      (T_A (T_A Char)))
// This is not matched: (CC_C Boolean
//      (Tuple Char Wildcard)
//      Wildcard
//      Char
//      (T_A (T_A (Tuple Byte Char) (Tuple Char Boolean)) Boolean))