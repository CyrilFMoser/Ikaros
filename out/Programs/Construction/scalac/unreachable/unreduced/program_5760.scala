package Program_3 

object Test {
sealed trait T_A[A]
sealed trait T_B[B, C]
case class CC_A[D](a: T_B[D, D], b: T_A[D], c: D) extends T_A[D]
case class CC_B[E](a: CC_A[E]) extends T_B[E, ((Char,Int),T_A[Boolean])]
case class CC_C[F](a: T_A[F]) extends T_B[F, ((Char,Int),T_A[Boolean])]
case class CC_D[G]() extends T_B[G, ((Char,Int),T_A[Boolean])]

val v_a: T_B[Boolean, ((Char,Int),T_A[Boolean])] = null
val v_b: Int = v_a match{
  case CC_B(CC_A(_, CC_A(_, _, _), true)) => 0 
  case CC_B(CC_A(_, CC_A(_, _, _), false)) => 1 
  case CC_D() => 2 
}
}
// This is not matched: CC_C(CC_A(_, CC_A(_, _, _), _))