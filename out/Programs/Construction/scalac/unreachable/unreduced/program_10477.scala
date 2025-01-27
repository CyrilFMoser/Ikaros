package Program_31 

object Test {
sealed trait T_A[A, B]
sealed trait T_B
case class CC_A[C]() extends T_A[T_A[T_A[Int, T_B], T_A[T_B, T_B]], C]
case class CC_B(a: Char, b: Int, c: T_B) extends T_A[T_A[T_A[Int, T_B], T_A[T_B, T_B]], T_A[T_A[T_B, T_B], T_A[T_B, T_B]]]
case class CC_C(a: Int) extends T_A[T_A[T_A[Int, T_B], T_A[T_B, T_B]], CC_B]
case class CC_D(a: CC_C) extends T_B
case class CC_E(a: CC_A[Byte], b: T_A[CC_B, CC_C]) extends T_B
case class CC_F(a: T_A[CC_C, CC_C]) extends T_B

val v_a: T_B = null
val v_b: Int = v_a match{
  case CC_D(_) => 0 
  case CC_E(_, _) => 1 
}
}
// This is not matched: CC_F(_)