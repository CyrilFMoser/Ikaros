package Program_29 

object Test {
sealed trait T_A[A, B]
case class CC_A[C](a: C, b: T_A[C, Char]) extends T_A[C, T_A[Boolean, T_A[Char, Int]]]
case class CC_B(a: CC_A[T_A[Char, Int]]) extends T_A[T_A[T_A[Char, Boolean], CC_A[Byte]], T_A[CC_A[Int], T_A[Int, Int]]]

val v_a: CC_A[Byte] = null
val v_b: Int = v_a match{
  case CC_A(_, _) => 0 
}
}