package Program_2 

object Test {
sealed trait T_A[A]
sealed trait T_B[B]
case class CC_A[C](a: Int, b: T_B[Int], c: C) extends T_A[Byte]
case class CC_B(a: T_A[T_A[Byte]], b: T_B[Char]) extends T_A[Byte]
case class CC_C[D](a: T_B[D]) extends T_B[D]
case class CC_D(a: CC_A[T_B[Byte]]) extends T_B[T_B[T_B[CC_B]]]
case class CC_E() extends T_B[T_B[T_B[CC_B]]]

val v_a: T_A[Byte] = null
val v_b: Int = v_a match{
  case CC_A(_, CC_C(CC_C(_)), _) => 0 
  case CC_B(_, _) => 1 
}
}