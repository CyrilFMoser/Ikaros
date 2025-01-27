package Program_10 

object Test {
sealed trait T_A[A]
sealed trait T_B[B]
case class CC_A[C](a: T_B[T_A[C]]) extends T_A[C]
case class CC_B[D](a: T_A[D], b: T_B[T_A[D]], c: T_A[D]) extends T_A[D]
case class CC_C[E](a: T_A[CC_A[E]]) extends T_A[E]
case class CC_D(a: CC_B[T_B[Byte]], b: Char, c: T_A[Byte]) extends T_B[Boolean]
case class CC_E(a: CC_A[T_A[CC_D]], b: T_B[Boolean], c: CC_C[Boolean]) extends T_B[((CC_D,Byte),(CC_D,CC_D))]

val v_a: T_A[CC_E] = null
val v_b: Int = v_a match{
  case CC_A(_) => 0 
  case CC_C(_) => 1 
}
}
// This is not matched: CC_B(_, _, _)