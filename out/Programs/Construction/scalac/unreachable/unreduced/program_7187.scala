package Program_2 

object Test {
sealed trait T_A[A, B]
sealed trait T_B[C]
case class CC_A[D](a: T_A[D, (Boolean,Int)], b: D, c: D) extends T_A[T_B[Char], D]
case class CC_B[E](a: T_A[T_B[Char], T_A[E, E]], b: CC_A[E], c: T_A[T_B[Char], E]) extends T_A[T_B[Char], E]
case class CC_C[F]() extends T_A[T_B[Char], F]
case class CC_D(a: T_A[T_B[Char], CC_A[Char]]) extends T_B[CC_C[CC_C[Int]]]
case class CC_E[G]() extends T_B[G]
case class CC_F(a: T_A[T_B[Char], Char], b: CC_D) extends T_B[CC_C[CC_C[Int]]]

val v_a: CC_F = null
val v_b: Int = v_a match{
  case CC_F(CC_A(_, _, _), CC_D(CC_A(_, _, _))) => 0 
  case CC_F(CC_B(_, _, _), CC_D(CC_A(_, _, _))) => 1 
  case CC_F(CC_C(), CC_D(CC_A(_, _, _))) => 2 
  case CC_F(CC_A(_, _, _), CC_D(CC_B(_, _, _))) => 3 
  case CC_F(CC_B(_, _, _), CC_D(CC_B(_, _, _))) => 4 
  case CC_F(CC_C(), CC_D(CC_B(_, _, _))) => 5 
  case CC_F(CC_A(_, _, _), CC_D(CC_C())) => 6 
  case CC_F(CC_B(_, _, _), CC_D(CC_C())) => 7 
  case CC_F(CC_C(), CC_D(CC_C())) => 8 
}
}