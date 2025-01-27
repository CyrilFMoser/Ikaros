package Program_14 

object Test {
sealed trait T_A[A, B]
sealed trait T_B[C, D]
case class CC_A[E](a: Int, b: (T_A[Char, Boolean],T_A[Char, Int]), c: T_B[E, E]) extends T_A[E, T_B[E, E]]
case class CC_B(a: T_A[Boolean, T_B[Boolean, Boolean]], b: T_B[Byte, CC_A[Char]], c: CC_A[T_A[Byte, Boolean]]) extends T_B[CC_A[T_A[Boolean, Byte]], T_A[T_A[Boolean, Int], Boolean]]
case class CC_C() extends T_B[CC_A[T_A[Boolean, Byte]], T_A[T_A[Boolean, Int], Boolean]]

val v_a: T_B[CC_A[T_A[Boolean, Byte]], T_A[T_A[Boolean, Int], Boolean]] = null
val v_b: Int = v_a match{
  case CC_B(CC_A(_, _, _), _, CC_A(_, _, _)) => 0 
  case CC_C() => 1 
}
}