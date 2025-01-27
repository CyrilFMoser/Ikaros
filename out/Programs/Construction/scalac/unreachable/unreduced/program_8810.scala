package Program_8 

object Test {
sealed trait T_A[A]
sealed trait T_B[B, C]
case class CC_A(a: T_B[Boolean, T_A[Int]], b: T_A[Boolean]) extends T_A[Boolean]
case class CC_B(a: T_A[Byte], b: Int, c: (Byte,Int)) extends T_A[Boolean]
case class CC_C[D, E](a: T_B[E, E], b: E) extends T_B[E, D]
case class CC_D[F, G](a: CC_C[CC_A, G], b: CC_C[G, F], c: Byte) extends T_B[F, G]
case class CC_E(a: T_B[CC_B, T_A[CC_A]], b: CC_C[T_A[Int], T_B[CC_B, Char]]) extends T_B[Char, CC_B]

val v_a: T_A[Boolean] = null
val v_b: Int = v_a match{
  case CC_A(_, _) => 0 
  case CC_B(_, 12, (_,_)) => 1 
}
}
// This is not matched: CC_B(_, _, (_,_))