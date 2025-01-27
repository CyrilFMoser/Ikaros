package Program_6 

object Test {
sealed trait T_A[A]
sealed trait T_B[B]
case class CC_A[C]() extends T_A[T_A[T_B[Byte]]]
case class CC_B[D](a: T_A[T_B[D]], b: D, c: T_A[D]) extends T_B[D]
case class CC_C[E](a: T_A[E], b: CC_B[E], c: Char) extends T_B[E]
case class CC_D[F]() extends T_B[F]

val v_a: T_B[Byte] = null
val v_b: Int = v_a match{
  case CC_B(_, _, _) => 0 
  case CC_C(_, _, _) => 1 
  case CC_D() => 2 
}
}