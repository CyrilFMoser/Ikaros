package Program_31 

object Test {
sealed trait T_A[A, B]
sealed trait T_B[C]
case class CC_A[D, E](a: T_A[E, E], b: T_B[E], c: T_A[D, D]) extends T_A[D, E]
case class CC_B(a: T_B[T_B[Char]], b: T_A[T_A[Char, Boolean], Byte]) extends T_B[T_A[T_B[Byte], Byte]]
case class CC_C(a: T_A[T_B[CC_B], (CC_B,CC_B)]) extends T_B[T_A[T_B[Byte], Byte]]
case class CC_D(a: T_A[CC_C, CC_C], b: (CC_A[CC_B, CC_B],Boolean)) extends T_B[T_A[T_B[Byte], Byte]]

val v_a: T_B[T_A[T_B[Byte], Byte]] = null
val v_b: Int = v_a match{
  case CC_B(_, CC_A(_, _, _)) => 0 
  case CC_C(CC_A(_, _, _)) => 1 
  case CC_D(_, _) => 2 
}
}