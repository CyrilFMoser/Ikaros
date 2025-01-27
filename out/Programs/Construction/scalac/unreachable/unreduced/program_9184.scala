package Program_22 

object Test {
sealed trait T_A
sealed trait T_B[A, B]
case class CC_A(a: T_B[T_B[(Int,Int), Boolean], T_B[T_A, T_A]], b: T_B[T_B[Char, T_A], T_A]) extends T_A
case class CC_B(a: CC_A, b: CC_A, c: T_B[T_B[Byte, T_A], T_A]) extends T_A
case class CC_C(a: T_B[CC_A, T_A], b: T_B[CC_B, CC_B], c: CC_A) extends T_A
case class CC_D[C]() extends T_B[C, T_A]

val v_a: T_A = null
val v_b: Int = v_a match{
  case CC_A(_, CC_D()) => 0 
  case CC_B(_, _, _) => 1 
}
}
// This is not matched: CC_C(_, _, _)