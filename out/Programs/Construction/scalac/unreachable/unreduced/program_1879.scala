package Program_23 

object Test {
sealed trait T_A[A]
sealed trait T_B[B]
case class CC_A[C](a: T_A[C], b: C, c: T_A[C]) extends T_A[C]
case class CC_B() extends T_A[T_B[CC_A[Char]]]
case class CC_C(a: T_B[(CC_B,CC_B)], b: T_A[CC_A[CC_B]], c: T_A[T_A[Char]]) extends T_A[T_A[Char]]
case class CC_D(a: T_A[CC_A[Boolean]], b: T_A[(CC_C,CC_C)]) extends T_B[CC_C]
case class CC_E(a: T_A[T_B[CC_D]], b: T_A[T_A[Char]], c: T_A[T_A[Char]]) extends T_B[CC_D]
case class CC_F(a: (T_B[CC_C],CC_D), b: CC_C, c: T_A[T_A[Char]]) extends T_B[CC_D]

val v_a: T_A[T_A[Char]] = null
val v_b: Int = v_a match{
  case CC_A(_, CC_A(_, _, _), _) => 0 
  case CC_C(_, CC_A(_, CC_A(_, _, _), _), _) => 1 
}
}