package Program_16 

object Test {
sealed trait T_A[A, B]
sealed trait T_B[C]
case class CC_A[D, E](a: D, b: T_A[T_A[D, D], D]) extends T_A[E, D]
case class CC_B[F]() extends T_A[T_B[F], F]
case class CC_C(a: T_B[T_B[Int]], b: T_A[CC_A[Int, Byte], CC_A[Int, (Char,Byte)]]) extends T_B[Int]
case class CC_D() extends T_B[Int]
case class CC_E(a: T_A[CC_B[CC_D], Boolean], b: T_B[Int], c: T_A[T_A[CC_C, CC_C], CC_A[Boolean, CC_C]]) extends T_B[Int]

val v_a: T_B[Int] = null
val v_b: Int = v_a match{
  case CC_C(_, _) => 0 
  case CC_E(_, _, _) => 1 
}
}
// This is not matched: CC_D()