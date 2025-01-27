package Program_12 

object Test {
sealed trait T_A[A, B]
case class CC_A[C](a: C, b: T_A[C, C]) extends T_A[C, T_A[C, T_A[C, C]]]
case class CC_B() extends T_A[CC_A[T_A[Char, Byte]], T_A[CC_A[T_A[Char, Byte]], T_A[CC_A[T_A[Char, Byte]], CC_A[T_A[Char, Byte]]]]]
case class CC_C[D]() extends T_A[D, T_A[D, T_A[D, D]]]

val v_a: T_A[CC_A[T_A[Char, Byte]], T_A[CC_A[T_A[Char, Byte]], T_A[CC_A[T_A[Char, Byte]], CC_A[T_A[Char, Byte]]]]] = null
val v_b: Int = v_a match{
  case CC_A(CC_A(_, _), _) => 0 
  case CC_B() => 1 
  case CC_C() => 2 
}
}