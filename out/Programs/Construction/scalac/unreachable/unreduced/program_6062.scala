package Program_26 

object Test {
sealed trait T_A[A, B]
sealed trait T_B[C]
case class CC_A[D](a: D, b: Byte, c: D) extends T_A[D, T_B[D]]
case class CC_B[E](a: T_A[E, Boolean], b: T_A[E, Boolean], c: T_A[E, Boolean]) extends T_A[E, Boolean]
case class CC_C[F](a: T_A[F, T_A[F, Boolean]], b: CC_B[F], c: T_A[F, Boolean]) extends T_A[F, Boolean]
case class CC_D[G](a: T_A[G, Boolean]) extends T_B[G]
case class CC_E(a: (T_B[Char],T_A[Int, (Boolean,Boolean)]), b: Byte) extends T_B[CC_D[T_B[Boolean]]]
case class CC_F(a: CC_C[CC_B[CC_E]]) extends T_B[CC_D[T_B[Boolean]]]

val v_a: T_B[CC_D[T_B[Boolean]]] = null
val v_b: Int = v_a match{
  case CC_D(CC_B(CC_B(_, _, _), CC_B(_, _, _), CC_B(_, _, _))) => 0 
  case CC_D(CC_B(CC_B(_, _, _), CC_C(_, _, _), CC_B(_, _, _))) => 1 
  case CC_D(CC_B(CC_C(_, _, _), CC_B(_, _, _), CC_B(_, _, _))) => 2 
  case CC_D(CC_B(CC_C(_, _, _), CC_C(_, _, _), CC_B(_, _, _))) => 3 
  case CC_D(CC_B(CC_B(_, _, _), CC_B(_, _, _), CC_C(_, _, _))) => 4 
  case CC_D(CC_B(CC_B(_, _, _), CC_C(_, _, _), CC_C(_, _, _))) => 5 
  case CC_D(CC_B(CC_C(_, _, _), CC_B(_, _, _), CC_C(_, _, _))) => 6 
  case CC_D(CC_B(CC_C(_, _, _), CC_C(_, _, _), CC_C(_, _, _))) => 7 
  case CC_D(CC_C(_, CC_B(_, _, _), CC_B(_, _, _))) => 8 
  case CC_D(CC_C(_, CC_B(_, _, _), CC_C(_, _, _))) => 9 
  case CC_E((CC_D(_),_), _) => 10 
  case CC_F(CC_C(_, CC_B(_, _, _), _)) => 11 
}
}