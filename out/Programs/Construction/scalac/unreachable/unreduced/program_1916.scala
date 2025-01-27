package Program_2 

object Test {
sealed trait T_A[A, B]
case class CC_A[C](a: T_A[C, C], b: C) extends T_A[T_A[Char, C], C]
case class CC_B[D](a: Byte) extends T_A[T_A[Char, D], D]
case class CC_C(a: CC_A[CC_B[Boolean]], b: T_A[T_A[Char, CC_A[Char]], CC_A[Char]]) extends T_A[(CC_A[Boolean],CC_A[Char]), CC_B[CC_A[Byte]]]

val v_a: T_A[T_A[Char, Boolean], Boolean] = null
val v_b: Int = v_a match{
  case CC_A(_, true) => 0 
  case CC_A(_, false) => 1 
  case CC_B(_) => 2 
}
}