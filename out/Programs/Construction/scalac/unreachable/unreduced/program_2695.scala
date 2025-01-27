package Program_6 

object Test {
sealed trait T_A[A, B]
sealed trait T_B[C]
case class CC_A[D](a: T_B[T_B[D]], b: D) extends T_A[T_A[T_B[Char], T_B[Char]], D]
case class CC_B[F, E](a: Boolean, b: E, c: Boolean) extends T_A[F, E]
case class CC_C[G](a: T_A[G, G], b: CC_A[G], c: CC_B[G, G]) extends T_A[T_A[T_B[Char], T_B[Char]], G]
case class CC_D(a: CC_A[T_A[Byte, Boolean]]) extends T_B[(CC_C[Byte],Boolean)]
case class CC_E() extends T_B[(CC_C[Byte],Boolean)]
case class CC_F[H](a: CC_A[H], b: CC_E) extends T_B[(CC_C[Byte],Boolean)]

val v_a: T_A[T_A[T_B[Char], T_B[Char]], Char] = null
val v_b: Int = v_a match{
  case CC_A(_, _) => 0 
  case CC_B(_, _, _) => 1 
  case CC_C(CC_B(true, _, _), _, _) => 2 
  case CC_C(CC_B(false, _, _), _, _) => 3 
}
}