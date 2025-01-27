package Program_10 

object Test {
sealed trait T_A[A]
sealed trait T_B[B, C]
case class CC_A(a: T_B[Char, T_B[Char, Int]], b: T_A[T_B[Int, Int]], c: (Int,T_A[Byte])) extends T_A[((Int,Int),T_B[Boolean, Boolean])]
case class CC_B(a: T_B[Boolean, Char], b: (T_A[Byte],CC_A)) extends T_A[((Int,Int),T_B[Boolean, Boolean])]
case class CC_C(a: T_A[CC_A], b: CC_A, c: CC_B) extends T_A[((Int,Int),T_B[Boolean, Boolean])]
case class CC_D[D, E](a: T_A[D], b: T_A[E], c: T_B[E, Boolean]) extends T_B[E, D]
case class CC_E[G, F](a: CC_C, b: Int, c: T_B[F, F]) extends T_B[F, G]
case class CC_F[H]() extends T_B[H, CC_E[T_B[CC_A, CC_C], CC_C]]

val v_a: T_B[CC_B, CC_A] = null
val v_b: Int = v_a match{
  case CC_D(_, _, _) => 0 
  case CC_E(_, _, _) => 1 
}
}