package Program_0 

object Test {
sealed trait T_A
sealed trait T_B[A, B]
case class CC_A(a: T_B[T_B[T_A, T_A], T_B[T_A, T_A]], b: T_A, c: T_B[T_B[T_A, T_A], ((Boolean,Int),T_A)]) extends T_A
case class CC_B(a: (Char,T_B[Int, Int])) extends T_A
case class CC_C[C]() extends T_B[C, T_B[T_B[T_A, CC_A], CC_A]]

val v_a: T_B[CC_A, T_B[T_B[T_A, CC_A], CC_A]] = null
val v_b: Int = v_a match{
  case CC_C() => 0 
}
}