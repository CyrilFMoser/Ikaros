package Program_16 

object Test {
sealed trait T_A[A, B]
sealed trait T_B[C, D]
case class CC_A(a: T_B[((Byte,Boolean),Char), T_A[Byte, Char]], b: Char, c: T_A[T_A[Int, Boolean], T_B[Char, Byte]]) extends T_A[T_B[T_B[Byte, Boolean], Char], Int]
case class CC_B() extends T_A[T_B[T_B[Byte, Boolean], Char], Int]
case class CC_C(a: Boolean, b: Byte, c: T_B[(CC_A,CC_A), T_A[CC_B, CC_A]]) extends T_A[T_B[T_B[Byte, Boolean], Char], Int]

val v_a: T_A[T_B[T_B[Byte, Boolean], Char], Int] = null
val v_b: Int = v_a match{
  case CC_A(_, _, _) => 0 
  case CC_B() => 1 
}
}
// This is not matched: CC_C(_, _, _)