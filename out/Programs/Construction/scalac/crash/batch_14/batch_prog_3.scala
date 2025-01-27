package Program_3 

object Test {
sealed trait T_A[A]
sealed trait T_B[B]
case class CC_A[C]() extends T_A[C]
case class CC_B[D](a: T_B[T_B[T_A[Char]]]) extends T_B[D]
case class CC_C() extends T_B[T_B[T_B[Byte]]]

val v_a: T_B[Boolean] = null
val v_b: Int = v_a match{
  case CC_B(_) => 0 
}
}