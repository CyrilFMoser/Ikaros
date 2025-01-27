package Program_16 

object Test {
sealed trait T_A[A, B]
sealed trait T_B[C]
case class CC_A[D](a: T_A[T_A[Byte, D], D]) extends T_A[Byte, D]
case class CC_B[E](a: (T_B[Char],T_B[(Boolean,Int)]), b: T_A[T_A[Byte, E], E]) extends T_A[Byte, E]
case class CC_C[F](a: T_A[Byte, F]) extends T_A[Byte, F]

val v_a: T_A[Byte, Int] = null
val v_b: Int = v_a match{
  case CC_B(_, _) => 0 
  case CC_C(_) => 1 
}
}
// This is not matched: CC_A(_)