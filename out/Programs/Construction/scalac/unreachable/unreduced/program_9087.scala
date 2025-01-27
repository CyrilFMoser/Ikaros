package Program_4 

object Test {
sealed trait T_A[A, B]
case class CC_A[C]() extends T_A[C, T_A[C, C]]
case class CC_B(a: T_A[CC_A[(Byte,Boolean)], T_A[Boolean, Boolean]]) extends T_A[T_A[Char, T_A[Char, Char]], T_A[T_A[Char, T_A[Char, Char]], T_A[Char, T_A[Char, Char]]]]

val v_a: T_A[T_A[Char, T_A[Char, Char]], T_A[T_A[Char, T_A[Char, Char]], T_A[Char, T_A[Char, Char]]]] = null
val v_b: Int = v_a match{
  case CC_A() => 0 
  case CC_B(_) => 1 
}
}