package Program_15 

object Test {
sealed trait T_A[A]
sealed trait T_B[B, C]
case class CC_A[D](a: T_A[D], b: D) extends T_A[D]
case class CC_B(a: T_A[T_A[Char]], b: T_A[T_A[Int]], c: (T_A[(Char,Int)],T_A[Boolean])) extends T_A[T_A[T_A[Byte]]]
case class CC_C[F, E](a: E) extends T_B[E, F]
case class CC_D[G](a: CC_B) extends T_B[CC_B, G]
case class CC_E[I, H]() extends T_B[H, I]

val v_a: T_A[Boolean] = null
val v_b: Int = v_a match{
  case CC_A(_, _) => 0 
}
}