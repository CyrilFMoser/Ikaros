package Program_15 

object Test {
sealed trait T_A[A]
sealed trait T_B[B, C]
case class CC_A(a: Int) extends T_A[T_B[Char, Char]]
case class CC_B(a: T_A[T_B[Char, Char]], b: (CC_A,T_B[Byte, CC_A])) extends T_A[T_B[Char, Char]]
case class CC_C(a: T_A[T_B[CC_B, CC_B]], b: T_A[T_B[CC_B, CC_A]], c: T_A[Boolean]) extends T_A[T_B[Char, Char]]

val v_a: T_A[T_B[Char, Char]] = null
val v_b: Int = v_a match{
  case CC_B(_, _) => 0 
  case CC_C(_, _, _) => 1 
}
}
// This is not matched: CC_A(_)