package Program_6 

object Test {
sealed trait T_A[A]
sealed trait T_B[B]
case class CC_A() extends T_A[T_B[T_A[Char]]]
case class CC_B(a: T_B[Int]) extends T_A[T_B[T_A[Char]]]
case class CC_C(a: Char, b: (T_A[(Char,Byte)],(CC_A,CC_B)), c: CC_A) extends T_A[T_B[T_A[Char]]]
case class CC_D[C](a: T_A[C], b: C) extends T_B[C]
case class CC_E[D, E](a: CC_A, b: E, c: Boolean) extends T_B[D]

val v_a: T_B[Int] = null
val v_b: Int = v_a match{
  case CC_D(_, _) => 0 
  case CC_E(_, _, _) => 1 
}
}