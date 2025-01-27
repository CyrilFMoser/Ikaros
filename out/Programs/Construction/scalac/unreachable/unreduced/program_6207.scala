package Program_20 

object Test {
sealed trait T_A[A, B]
case class CC_A[C](a: Int, b: T_A[C, Char]) extends T_A[C, T_A[T_A[Byte, Boolean], Byte]]
case class CC_B[D]() extends T_A[D, T_A[T_A[Byte, Boolean], Byte]]
case class CC_C[E](a: (Boolean,CC_B[Boolean]), b: (CC_A[Boolean],CC_A[Char])) extends T_A[E, T_A[T_A[Byte, Boolean], Byte]]

val v_a: T_A[Int, T_A[T_A[Byte, Boolean], Byte]] = null
val v_b: Int = v_a match{
  case CC_A(_, _) => 0 
  case CC_B() => 1 
}
}
// This is not matched: CC_C(_, _)