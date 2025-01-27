package Program_15 

object Test {
sealed trait T_A[A]
sealed trait T_B[B, C]
case class CC_A[D](a: T_B[D, D]) extends T_A[D]
case class CC_B[E](a: Char, b: Boolean, c: T_A[E]) extends T_A[E]
case class CC_C[F]() extends T_A[F]
case class CC_D[G](a: CC_C[G], b: CC_B[G], c: T_A[G]) extends T_B[T_A[CC_A[Byte]], G]

val v_a: T_A[Byte] = null
val v_b: Int = v_a match{
  case CC_A(_) => 0 
  case CC_B(_, _, CC_A(_)) => 1 
  case CC_B(_, _, CC_B(_, _, _)) => 2 
  case CC_B(_, _, CC_C()) => 3 
  case CC_C() => 4 
}
}