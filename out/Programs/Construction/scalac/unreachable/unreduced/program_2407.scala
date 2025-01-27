package Program_16 

object Test {
sealed trait T_A[A]
sealed trait T_B[B]
case class CC_A(a: T_A[T_B[Int]], b: T_A[T_B[Boolean]], c: T_A[T_B[Int]]) extends T_A[T_A[T_B[Boolean]]]
case class CC_B(a: T_A[CC_A]) extends T_A[T_A[T_B[Boolean]]]
case class CC_C[C](a: CC_A, b: CC_A, c: C) extends T_B[C]
case class CC_D[D]() extends T_B[D]
case class CC_E(a: Int) extends T_B[T_B[T_B[CC_A]]]

val v_a: T_B[Boolean] = null
val v_b: Int = v_a match{
  case CC_C(CC_A(_, _, _), _, _) => 0 
  case CC_D() => 1 
}
}