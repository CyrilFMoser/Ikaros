package Program_29 

object Test {
sealed trait T_A[A]
sealed trait T_B[B, C]
case class CC_A[D]() extends T_A[D]
case class CC_B[E]() extends T_A[E]
case class CC_C(a: CC_B[T_A[(Byte,Char)]], b: CC_A[T_A[Char]]) extends T_A[T_A[T_A[Int]]]
case class CC_D[G, F](a: Byte, b: CC_A[F], c: CC_B[G]) extends T_B[G, F]

val v_a: CC_C = null
val v_b: Int = v_a match{
  case CC_C(_, _) => 0 
}
}