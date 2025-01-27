package Program_21 

object Test {
sealed trait T_A[A, B]
sealed trait T_B
case class CC_A[D, C]() extends T_A[D, C]
case class CC_B[E, F]() extends T_A[E, F]
case class CC_C(a: CC_A[T_A[T_B, T_B], CC_A[T_B, T_B]], b: T_A[CC_A[Byte, T_B], CC_A[T_B, T_B]]) extends T_B
case class CC_D(a: CC_B[(CC_C,(Char,Int)), T_A[Byte, T_B]], b: Boolean, c: T_B) extends T_B

val v_a: T_A[T_B, Int] = null
val v_b: Int = v_a match{
  case CC_B() => 0 
}
}
// This is not matched: CC_A()