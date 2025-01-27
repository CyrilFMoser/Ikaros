package Program_17 

object Test {
sealed trait T_A[A, B]
sealed trait T_B[C]
case class CC_A[D](a: T_A[D, D], b: T_A[D, D], c: D) extends T_A[D, Boolean]
case class CC_B(a: T_A[Boolean, T_A[Boolean, Int]], b: CC_A[T_A[Int, Byte]]) extends T_B[Boolean]
case class CC_C[E](a: CC_B, b: E) extends T_B[E]
case class CC_D(a: T_B[CC_A[Int]], b: Char) extends T_B[Boolean]

val v_a: T_B[Boolean] = null
val v_b: Int = v_a match{
  case CC_B(_, _) => 0 
  case CC_C(CC_B(_, CC_A(_, _, _)), _) => 1 
  case CC_D(CC_C(_, _), 'x') => 2 
  case CC_D(CC_C(_, _), _) => 3 
}
}