package Program_28 

object Test {
sealed trait T_A[A, B]
sealed trait T_B[C]
case class CC_A[D]() extends T_A[T_A[D, D], D]
case class CC_B[E]() extends T_B[E]
case class CC_C[F](a: T_A[F, F]) extends T_B[F]
case class CC_D(a: CC_A[CC_C[Boolean]], b: T_B[CC_C[Char]]) extends T_B[T_B[CC_C[(Byte,Int)]]]

val v_a: T_B[Byte] = null
val v_b: Int = v_a match{
  case CC_B() => 0 
  case CC_C(_) => 1 
}
}