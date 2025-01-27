package Program_22 

object Test {
sealed trait T_A[A, B]
sealed trait T_B[C, D]
case class CC_A(a: T_B[T_A[Char, Boolean], T_B[Char, Int]], b: T_B[T_B[Int, Byte], T_B[Int, Char]], c: T_B[T_A[Boolean, Byte], Byte]) extends T_A[T_A[Char, T_B[Byte, Boolean]], T_B[Boolean, Char]]
case class CC_B(a: T_A[CC_A, T_A[CC_A, CC_A]]) extends T_A[T_A[Char, T_B[Byte, Boolean]], T_B[Boolean, Char]]
case class CC_C() extends T_A[T_A[Char, T_B[Byte, Boolean]], T_B[Boolean, Char]]
case class CC_D[E, F](a: T_A[E, F]) extends T_B[E, (Int,CC_B)]

val v_a: T_A[T_A[Char, T_B[Byte, Boolean]], T_B[Boolean, Char]] = null
val v_b: Int = v_a match{
  case CC_A(_, _, _) => 0 
  case CC_C() => 1 
}
}
// This is not matched: CC_B(_)