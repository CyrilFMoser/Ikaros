package Program_21 

object Test {
sealed trait T_A[A, B]
sealed trait T_B[C]
case class CC_A[D]() extends T_A[D, Char]
case class CC_B[E]() extends T_A[E, Char]
case class CC_C(a: T_A[T_A[Char, Char], Boolean]) extends T_A[T_A[CC_B[Byte], Char], Char]
case class CC_D(a: CC_C, b: CC_A[T_A[Byte, Char]], c: Boolean) extends T_B[Byte]
case class CC_E(a: (Char,(CC_D,CC_D))) extends T_B[T_A[CC_C, Boolean]]

val v_a: T_B[Byte] = null
val v_b: Int = v_a match{
  case CC_D(_, CC_A(), _) => 0 
}
}