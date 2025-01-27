package Program_30 

object Test {
sealed trait T_A
sealed trait T_B[A, B]
case class CC_A(a: T_A, b: T_A, c: (T_A,Char)) extends T_A
case class CC_B[C](a: CC_A, b: T_B[T_A, C]) extends T_B[C, T_B[T_A, CC_A]]
case class CC_C[D](a: T_B[D, T_B[T_A, CC_A]]) extends T_B[D, T_B[T_A, CC_A]]

val v_a: T_B[Char, T_B[T_A, CC_A]] = null
val v_b: Int = v_a match{
  case CC_B(_, _) => 0 
  case CC_C(_) => 1 
}
}