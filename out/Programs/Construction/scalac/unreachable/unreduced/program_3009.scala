package Program_29 

object Test {
sealed trait T_A[A]
sealed trait T_B[B, C]
case class CC_A[D](a: T_B[D, D]) extends T_A[D]
case class CC_B[E]() extends T_A[E]
case class CC_C(a: T_A[(Int,Boolean)], b: T_A[T_A[Byte]], c: CC_A[T_A[Int]]) extends T_A[Byte]
case class CC_D[F](a: T_B[F, F], b: CC_A[F]) extends T_B[F, Char]
case class CC_E(a: T_B[Char, Char], b: Int) extends T_B[Int, Int]

val v_a: T_A[Byte] = null
val v_b: Int = v_a match{
  case CC_A(_) => 0 
  case CC_B() => 1 
}
}
// This is not matched: CC_C(_, _, CC_A(_))