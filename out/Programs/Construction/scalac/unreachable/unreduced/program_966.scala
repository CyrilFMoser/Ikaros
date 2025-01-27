package Program_6 

object Test {
sealed trait T_A[A]
sealed trait T_B[B]
case class CC_A(a: Int) extends T_A[T_A[Int]]
case class CC_B(a: T_B[CC_A], b: T_B[T_A[CC_A]]) extends T_A[T_A[Int]]
case class CC_C[C](a: T_A[T_A[Int]], b: C, c: T_A[C]) extends T_B[C]
case class CC_D[D, E]() extends T_B[D]
case class CC_E[F](a: T_B[F], b: (CC_C[CC_B],Int), c: T_A[F]) extends T_B[F]

val v_a: T_A[T_A[Int]] = null
val v_b: Int = v_a match{
  case CC_A(_) => 0 
  case CC_B(CC_C(_, _, _), CC_C(_, _, _)) => 1 
  case CC_B(CC_D(), CC_C(_, _, _)) => 2 
  case CC_B(CC_E(_, _, _), CC_C(_, _, _)) => 3 
  case CC_B(CC_C(_, _, _), CC_D()) => 4 
  case CC_B(CC_D(), CC_D()) => 5 
  case CC_B(CC_E(_, _, _), CC_D()) => 6 
  case CC_B(CC_C(_, _, _), CC_E(_, _, _)) => 7 
  case CC_B(CC_D(), CC_E(_, _, _)) => 8 
}
}
// This is not matched: CC_B(CC_E(_, _, _), CC_E(_, _, _))