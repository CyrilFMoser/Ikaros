package Program_11 

object Test {
sealed trait T_A[A, B]
sealed trait T_B[C, D]
case class CC_A[E](a: T_B[E, E], b: (T_B[Char, (Byte,Char)],(Int,Char))) extends T_A[E, T_B[E, E]]
case class CC_B[F](a: F, b: (Char,T_A[Int, Byte])) extends T_B[F, CC_A[F]]
case class CC_C[G](a: G, b: T_B[G, G]) extends T_B[G, CC_A[G]]
case class CC_D[H](a: Int, b: T_B[H, CC_A[H]], c: CC_B[H]) extends T_B[H, CC_C[CC_A[(Int,Int)]]]

val v_a: T_B[Byte, CC_C[CC_A[(Int,Int)]]] = null
val v_b: Int = v_a match{
  case CC_D(_, CC_B(_, _), CC_B(_, _)) => 0 
  case CC_D(_, CC_C(0, _), CC_B(_, _)) => 1 
}
}
// This is not matched: CC_D(_, CC_C(_, _), CC_B(_, _))