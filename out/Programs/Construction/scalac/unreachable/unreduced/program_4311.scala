package Program_9 

object Test {
sealed trait T_A[A, B]
sealed trait T_B[C]
case class CC_A[D]() extends T_A[D, T_B[D]]
case class CC_B(a: T_A[(Char,Boolean), Char]) extends T_A[T_B[T_B[Byte]], T_B[T_B[T_B[Byte]]]]

val v_a: T_A[T_B[T_B[Byte]], T_B[T_B[T_B[Byte]]]] = null
val v_b: Int = v_a match{
  case CC_A() => 0 
  case CC_B(_) => 1 
}
}