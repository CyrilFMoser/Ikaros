package Program_29 

object Test {
sealed trait T_A[A, B]
case class CC_A[C](a: C) extends T_A[C, T_A[C, C]]
case class CC_B[D]() extends T_A[D, T_A[D, D]]
case class CC_C(a: T_A[CC_A[Int], CC_B[Byte]], b: T_A[T_A[Boolean, Char], CC_A[Char]]) extends T_A[T_A[Char, T_A[Int, Char]], T_A[T_A[Char, T_A[Int, Char]], T_A[Char, T_A[Int, Char]]]]

val v_a: T_A[CC_C, T_A[CC_C, CC_C]] = null
val v_b: Int = v_a match{
  case CC_A(CC_C(_, _)) => 0 
  case CC_B() => 1 
}
}