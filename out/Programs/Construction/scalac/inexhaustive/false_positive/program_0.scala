package Program_63 

object Test {
sealed trait T_A[A]
sealed trait T_B[C, D]
case class CC_A(a: T_B[T_B[Char, Boolean], T_A[Int]], b: T_A[T_B[Char, Byte]]) extends T_A[Byte]
case class CC_C[F, E]() extends T_B[E, F]
case class CC_D[H, G]() extends T_B[H, G]

val v_a: CC_A = null
val v_b: Int = v_a match{
  case CC_A(CC_C(), _) => 0 
}
}
// This is not matched: CC_B(CC_A(_, _, _), _, CC_A(_, _, _))