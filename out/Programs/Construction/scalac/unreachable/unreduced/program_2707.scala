package Program_7 

object Test {
sealed trait T_A[A, B]
sealed trait T_B[C]
case class CC_A[E, D, F](a: F, b: T_A[F, T_A[E, D]], c: T_B[D]) extends T_A[E, D]
case class CC_B(a: CC_A[T_A[Int, Byte], CC_A[Char, Int, Boolean], T_A[(Int,Int), (Char,Byte)]]) extends T_B[Boolean]
case class CC_C(a: CC_A[T_B[CC_B], T_A[Boolean, CC_B], T_B[CC_B]], b: CC_B, c: Int) extends T_B[Boolean]

val v_a: T_B[Boolean] = null
val v_b: Int = v_a match{
  case CC_B(_) => 0 
  case CC_C(CC_A(_, _, _), CC_B(CC_A(_, _, _)), 12) => 1 
}
}
// This is not matched: CC_C(CC_A(_, _, _), CC_B(CC_A(_, _, _)), _)