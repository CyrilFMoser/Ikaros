package Program_2 

object Test {
sealed trait T_A
sealed trait T_B[A, B]
case class CC_A(a: Char, b: T_B[T_B[T_A, Boolean], (T_A,T_A)]) extends T_A
case class CC_B[C](a: T_B[C, CC_A]) extends T_B[C, T_B[C, C]]
case class CC_C[D](a: Boolean, b: (T_A,Int)) extends T_B[D, T_B[D, D]]

val v_a: T_B[T_A, T_B[T_A, T_A]] = null
val v_b: Int = v_a match{
  case CC_B(_) => 0 
  case CC_C(_, _) => 1 
}
}