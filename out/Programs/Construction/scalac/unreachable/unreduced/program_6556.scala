package Program_15 

object Test {
sealed trait T_A[A, B]
sealed trait T_B[C]
case class CC_A[D](a: T_A[D, D]) extends T_A[T_B[(Byte,Char)], D]
case class CC_B(a: CC_A[(Byte,Int)], b: T_A[CC_A[Byte], T_A[(Int,Int), Byte]], c: Boolean) extends T_A[T_B[(Byte,Boolean)], CC_A[T_B[Char]]]
case class CC_C() extends T_A[T_B[(Byte,Boolean)], CC_A[T_B[Char]]]
case class CC_D[E]() extends T_B[E]
case class CC_E[F](a: CC_A[F]) extends T_B[F]
case class CC_F[G](a: CC_C) extends T_B[G]

val v_a: T_B[CC_C] = null
val v_b: Int = v_a match{
  case CC_E(CC_A(_)) => 0 
  case CC_F(CC_C()) => 1 
}
}
// This is not matched: CC_D()