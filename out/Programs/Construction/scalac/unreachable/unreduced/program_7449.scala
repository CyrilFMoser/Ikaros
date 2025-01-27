package Program_13 

object Test {
sealed trait T_A[A]
sealed trait T_B[B, C]
case class CC_A[D](a: D, b: T_A[D]) extends T_A[D]
case class CC_B(a: T_A[T_A[Int]], b: T_B[T_A[Boolean], Byte], c: Boolean) extends T_A[Int]
case class CC_C[E](a: T_A[E], b: T_A[E], c: T_A[Int]) extends T_B[(T_A[(Int,Boolean)],CC_B), E]
case class CC_D[F](a: (Char,T_A[Char]), b: T_B[F, T_A[F]], c: (CC_B,CC_A[CC_B])) extends T_B[F, T_A[F]]

val v_a: T_B[(T_A[(Int,Boolean)],CC_B), Int] = null
val v_b: Int = v_a match{
  case CC_C(CC_A(_, _), CC_A(_, CC_A(_, _)), CC_A(_, _)) => 0 
  case CC_C(CC_A(_, _), CC_A(_, CC_A(_, _)), CC_B(_, _, _)) => 1 
  case CC_C(CC_B(_, _, _), CC_A(_, CC_A(_, _)), CC_A(_, _)) => 2 
  case CC_C(CC_B(_, _, _), CC_A(_, CC_A(_, _)), CC_B(_, _, _)) => 3 
  case CC_C(CC_A(_, _), CC_A(_, CC_B(_, _, _)), CC_A(_, _)) => 4 
  case CC_C(CC_A(_, _), CC_A(_, CC_B(_, _, _)), CC_B(_, _, _)) => 5 
  case CC_C(CC_B(_, _, _), CC_A(_, CC_B(_, _, _)), CC_A(_, _)) => 6 
  case CC_C(CC_B(_, _, _), CC_A(_, CC_B(_, _, _)), CC_B(_, _, _)) => 7 
  case CC_C(CC_A(_, _), CC_B(_, _, _), CC_A(_, _)) => 8 
  case CC_C(CC_A(_, _), CC_B(_, _, _), CC_B(_, _, _)) => 9 
  case CC_C(CC_B(_, _, _), CC_B(_, _, _), CC_B(_, _, _)) => 10 
}
}
// This is not matched: CC_C(CC_B(_, _, _), CC_B(_, _, _), CC_A(_, _))