package Program_18 

object Test {
sealed trait T_A[A]
sealed trait T_B[B, C]
case class CC_A[D](a: (Char,T_A[Int])) extends T_A[D]
case class CC_B(a: CC_A[(Char,Int)], b: CC_A[T_B[Byte, Int]]) extends T_A[T_B[Boolean, T_A[Char]]]
case class CC_C[E](a: E) extends T_B[T_A[((Boolean,Boolean),CC_B)], E]
case class CC_D[F](a: Int, b: T_B[F, F]) extends T_B[T_A[((Boolean,Boolean),CC_B)], F]
case class CC_E[G]() extends T_B[T_A[((Boolean,Boolean),CC_B)], G]

val v_a: T_B[T_A[((Boolean,Boolean),CC_B)], Boolean] = null
val v_b: Int = v_a match{
  case CC_C(_) => 0 
  case CC_D(_, _) => 1 
  case CC_E() => 2 
}
}