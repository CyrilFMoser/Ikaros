package Program_0 

object Test {
sealed trait T_A[A]
sealed trait T_B[B, C]
case class CC_A(a: T_B[Boolean, T_A[Int]], b: Int, c: T_B[T_A[Char], Byte]) extends T_A[T_A[Int]]
case class CC_B(a: CC_A) extends T_A[T_A[Int]]
case class CC_C[E, D](a: CC_A, b: D) extends T_B[D, E]

val v_a: T_A[T_A[Int]] = null
val v_b: Int = v_a match{
  case CC_A(CC_C(_, _), _, _) => 0 
  case CC_B(CC_A(CC_C(_, _), _, CC_C(_, _))) => 1 
}
}