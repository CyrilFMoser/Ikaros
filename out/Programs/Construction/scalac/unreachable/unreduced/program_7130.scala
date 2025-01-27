package Program_16 

object Test {
sealed trait T_A[A]
sealed trait T_B[B, C]
case class CC_A(a: Byte, b: T_A[Boolean], c: T_B[T_B[Byte, (Byte,Boolean)], T_B[Byte, Boolean]]) extends T_A[T_B[T_A[Int], (Int,Byte)]]
case class CC_B(a: T_A[CC_A], b: T_A[CC_A]) extends T_A[CC_A]
case class CC_C[D](a: T_A[CC_A], b: T_B[T_B[CC_A, CC_B], D], c: T_A[CC_A]) extends T_B[T_B[CC_A, CC_B], D]
case class CC_D[E](a: T_A[CC_A], b: CC_C[Byte], c: Char) extends T_B[T_B[CC_A, CC_B], E]
case class CC_E[F](a: T_B[T_B[CC_A, CC_B], F], b: CC_A) extends T_B[T_B[CC_A, CC_B], F]

val v_a: T_B[T_B[CC_A, CC_B], T_A[CC_A]] = null
val v_b: Int = v_a match{
  case CC_C(_, CC_C(CC_B(_, _), CC_C(_, _, _), _), CC_B(CC_B(_, _), _)) => 0 
  case CC_C(_, CC_C(CC_B(_, _), CC_D(_, _, _), _), CC_B(CC_B(_, _), _)) => 1 
  case CC_C(_, CC_C(CC_B(_, _), CC_E(_, _), _), CC_B(CC_B(_, _), _)) => 2 
  case CC_C(_, CC_D(_, CC_C(_, _, _), 'x'), CC_B(CC_B(_, _), _)) => 3 
  case CC_C(_, CC_D(_, CC_C(_, _, _), _), CC_B(CC_B(_, _), _)) => 4 
  case CC_C(_, CC_E(_, CC_A(_, _, _)), CC_B(CC_B(_, _), _)) => 5 
  case CC_D(_, _, _) => 6 
  case CC_E(_, _) => 7 
}
}