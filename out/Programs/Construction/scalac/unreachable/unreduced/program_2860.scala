package Program_13 

object Test {
sealed trait T_A[A]
sealed trait T_B[B, C]
case class CC_A[D]() extends T_A[D]
case class CC_B(a: CC_A[CC_A[Char]], b: CC_A[Char]) extends T_A[T_B[CC_A[Byte], T_B[Char, Char]]]
case class CC_C[E](a: T_B[E, E], b: Boolean, c: E) extends T_A[E]
case class CC_D[F](a: T_A[F], b: CC_C[F]) extends T_B[F, CC_A[Boolean]]
case class CC_E(a: T_B[(CC_B,CC_B), CC_B], b: CC_C[CC_C[CC_B]], c: T_B[T_B[CC_B, CC_B], T_A[Char]]) extends T_B[CC_B, CC_A[Boolean]]

val v_a: T_A[Int] = null
val v_b: Int = v_a match{
  case CC_A() => 0 
  case CC_C(_, _, _) => 1 
}
}