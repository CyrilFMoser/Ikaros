package Program_29 

object Test {
sealed trait T_A[A, B]
sealed trait T_B[C]
case class CC_A[D]() extends T_A[D, T_A[D, D]]
case class CC_B[E]() extends T_A[E, T_A[E, E]]
case class CC_C[F](a: T_A[F, T_A[F, F]]) extends T_A[T_B[CC_A[Byte]], T_A[T_B[CC_A[Byte]], T_B[CC_A[Byte]]]]
case class CC_D[G](a: Int) extends T_B[G]
case class CC_E() extends T_B[(T_B[(Boolean,Byte)],Int)]
case class CC_F[H](a: T_A[H, H]) extends T_B[H]

val v_a: T_B[Int] = null
val v_b: Int = v_a match{
  case CC_D(12) => 0 
  case CC_D(_) => 1 
  case CC_F(_) => 2 
}
}