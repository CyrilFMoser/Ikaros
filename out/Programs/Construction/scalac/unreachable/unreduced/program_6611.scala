package Program_24 

object Test {
sealed trait T_A[A, B]
sealed trait T_B[C]
case class CC_A[D](a: D, b: T_A[T_A[T_A[Int, Int], T_A[Int, Int]], T_B[T_A[T_A[Int, Int], T_A[Int, Int]]]]) extends T_A[D, T_B[D]]
case class CC_B(a: Int, b: T_A[T_A[Char, Char], T_B[T_A[Char, Char]]]) extends T_A[CC_A[T_B[Int]], T_B[CC_A[T_B[Int]]]]
case class CC_C[F]() extends T_A[F, T_B[F]]

val v_a: CC_A[CC_B] = null
val v_b: Int = v_a match{
  case CC_A(CC_B(_, _), CC_A(_, CC_A(_, _))) => 0 
  case CC_A(CC_B(_, _), CC_A(_, CC_C())) => 1 
  case CC_A(CC_B(_, _), CC_C()) => 2 
}
}