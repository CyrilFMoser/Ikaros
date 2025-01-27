package Program_14 

object Test {
sealed trait T_A[A, B]
sealed trait T_B[C]
case class CC_A[D](a: T_A[D, D], b: T_A[D, D], c: D) extends T_A[D, T_B[D]]
case class CC_B[E](a: Char, b: E) extends T_A[E, T_B[E]]
case class CC_C[F]() extends T_A[F, T_B[F]]
case class CC_D[G](a: CC_B[G]) extends T_B[G]

val v_a: T_A[Boolean, T_B[Boolean]] = null
val v_b: Int = v_a match{
  case CC_A(_, _, _) => 0 
  case CC_B(_, true) => 1 
  case CC_B(_, false) => 2 
  case CC_C() => 3 
}
}