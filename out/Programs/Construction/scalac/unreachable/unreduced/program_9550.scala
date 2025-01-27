package Program_11 

object Test {
sealed trait T_A[A]
sealed trait T_B[B, C]
case class CC_A[D](a: T_B[D, D]) extends T_A[D]
case class CC_B[E](a: CC_A[E], b: T_B[E, E]) extends T_A[E]
case class CC_C[F]() extends T_A[F]
case class CC_D(a: T_A[CC_C[Byte]]) extends T_B[CC_C[CC_B[Int]], Char]

val v_a: T_A[Int] = null
val v_b: Int = v_a match{
  case CC_A(_) => 0 
  case CC_B(_, _) => 1 
  case CC_C() => 2 
}
}