package Program_18 

object Test {
sealed trait T_A
sealed trait T_B[A, B]
case class CC_A(a: T_B[Int, Char], b: Int, c: T_B[Int, T_A]) extends T_A
case class CC_B(a: T_A, b: CC_A, c: ((CC_A,T_A),CC_A)) extends T_A
case class CC_C[C](a: Int, b: CC_B, c: T_B[C, C]) extends T_A
case class CC_D[D](a: CC_A, b: D, c: T_A) extends T_B[T_B[CC_A, CC_C[CC_A]], D]
case class CC_E[E](a: CC_A) extends T_B[T_B[CC_A, CC_C[CC_A]], E]
case class CC_F[F]() extends T_B[T_B[CC_A, CC_C[CC_A]], F]

val v_a: T_B[T_B[CC_A, CC_C[CC_A]], CC_A] = null
val v_b: Int = v_a match{
  case CC_D(CC_A(_, _, _), _, _) => 0 
  case CC_E(_) => 1 
  case CC_F() => 2 
}
}