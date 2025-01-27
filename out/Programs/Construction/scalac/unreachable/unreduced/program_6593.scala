package Program_26 

object Test {
sealed trait T_A[A, B]
sealed trait T_B[C, D]
case class CC_A[E]() extends T_A[E, Int]
case class CC_B[F](a: T_A[F, F], b: F, c: T_A[F, F]) extends T_B[T_B[F, F], F]
case class CC_C[G, H]() extends T_B[G, H]
case class CC_D(a: (CC_A[Char],Char), b: CC_C[CC_A[Int], Byte], c: T_B[T_B[Char, Char], Char]) extends T_B[T_B[CC_B[Int], CC_B[Int]], CC_B[Int]]

val v_a: T_B[T_B[CC_B[Int], CC_B[Int]], CC_B[Int]] = null
val v_b: Int = v_a match{
  case CC_B(_, _, _) => 0 
  case CC_C() => 1 
  case CC_D(_, CC_C(), CC_B(_, _, _)) => 2 
}
}
// This is not matched: CC_D(_, CC_C(), CC_C())