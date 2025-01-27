package Program_26 

object Test {
sealed trait T_A[A, B]
case class CC_A[C](a: T_A[C, C]) extends T_A[T_A[T_A[Byte, Boolean], T_A[Char, Boolean]], C]
case class CC_B[D]() extends T_A[T_A[T_A[Byte, Boolean], T_A[Char, Boolean]], D]
case class CC_C() extends T_A[T_A[T_A[Byte, Boolean], T_A[Char, Boolean]], CC_B[CC_A[Byte]]]

val v_a: T_A[T_A[T_A[Byte, Boolean], T_A[Char, Boolean]], Int] = null
val v_b: Int = v_a match{
  case CC_A(_) => 0 
  case CC_B() => 1 
}
}