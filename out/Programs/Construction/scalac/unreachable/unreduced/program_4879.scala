package Program_12 

object Test {
sealed trait T_A[A, B]
sealed trait T_B[C]
case class CC_A[D]() extends T_A[T_A[T_A[Byte, Char], T_B[Int]], D]
case class CC_B[E](a: T_A[E, E], b: CC_A[E]) extends T_A[T_A[T_A[Byte, Char], T_B[Int]], E]
case class CC_C[F](a: T_B[F], b: CC_A[F]) extends T_B[F]
case class CC_D[G]() extends T_B[G]
case class CC_E(a: T_A[CC_D[Boolean], CC_A[Boolean]], b: CC_C[T_B[Int]], c: T_B[CC_A[Byte]]) extends T_B[CC_D[T_A[Boolean, Int]]]

val v_a: T_A[T_A[T_A[Byte, Char], T_B[Int]], CC_E] = null
val v_b: Int = v_a match{
  case CC_A() => 0 
  case CC_B(_, _) => 1 
}
}