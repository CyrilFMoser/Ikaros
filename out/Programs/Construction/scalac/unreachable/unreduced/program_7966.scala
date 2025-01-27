package Program_19 

object Test {
sealed trait T_A[A, B]
sealed trait T_B[C]
case class CC_A[D](a: T_B[D], b: Boolean, c: T_A[D, D]) extends T_A[D, Char]
case class CC_B[E](a: T_B[E]) extends T_A[E, Char]
case class CC_C(a: CC_A[T_A[(Boolean,Int), Char]], b: Boolean) extends T_A[T_A[T_B[Boolean], Char], Char]
case class CC_D[F]() extends T_B[F]
case class CC_E[G](a: G) extends T_B[G]

val v_a: T_A[Byte, Char] = null
val v_b: Int = v_a match{
  case CC_A(CC_D(), _, _) => 0 
  case CC_A(CC_E(_), _, _) => 1 
  case CC_B(CC_E(_)) => 2 
}
}
// This is not matched: CC_B(CC_D())