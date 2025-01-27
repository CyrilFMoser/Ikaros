package Program_2 

object Test {
sealed trait T_A[A]
sealed trait T_B[B, C]
case class CC_A[D](a: T_A[D], b: T_B[D, D], c: T_A[D]) extends T_A[D]
case class CC_B[E]() extends T_A[E]
case class CC_C[F](a: F, b: T_A[F]) extends T_B[F, (CC_B[Int],T_A[Char])]

val v_a: T_A[Char] = null
val v_b: Int = v_a match{
  case CC_A(CC_B(), _, _) => 0 
  case CC_B() => 1 
}
}
// This is not matched: CC_A(CC_A(_, _, _), _, _)