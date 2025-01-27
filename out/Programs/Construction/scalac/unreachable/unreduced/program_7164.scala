package Program_23 

object Test {
sealed trait T_A[A]
sealed trait T_B[B, C]
case class CC_A[D](a: T_B[D, D], b: D, c: T_A[Int]) extends T_A[D]
case class CC_B(a: Boolean, b: T_A[(Char,Byte)], c: T_A[Char]) extends T_A[Char]
case class CC_C[E](a: T_A[Char], b: T_A[E], c: CC_A[E]) extends T_B[Char, E]
case class CC_D[F]() extends T_B[Char, F]

val v_a: T_B[Char, Byte] = null
val v_b: Int = v_a match{
  case CC_C(CC_A(_, _, _), CC_A(_, _, CC_A(_, _, _)), _) => 0 
  case CC_C(CC_B(_, _, CC_B(_, _, _)), CC_A(_, _, CC_A(_, _, _)), _) => 1 
  case CC_D() => 2 
}
}
// This is not matched: CC_C(CC_B(_, _, CC_A(_, _, _)), CC_A(_, _, CC_A(_, _, _)), _)