package Program_22 

object Test {
sealed trait T_A[A]
sealed trait T_B[B, C]
case class CC_A[D](a: (T_B[Char, Int],T_A[Char]), b: T_B[D, D], c: T_A[D]) extends T_A[D]
case class CC_B[E](a: T_B[E, E]) extends T_A[E]
case class CC_C[F]() extends T_A[F]
case class CC_D[G](a: ((Int,Int),CC_B[Boolean]), b: (T_A[Char],Int), c: CC_B[G]) extends T_B[Byte, G]

val v_a: T_A[Char] = null
val v_b: Int = v_a match{
  case CC_B(_) => 0 
  case CC_C() => 1 
}
}
// This is not matched: CC_A(_, _, _)