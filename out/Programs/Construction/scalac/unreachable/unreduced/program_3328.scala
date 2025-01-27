package Program_29 

object Test {
sealed trait T_A[A, B]
sealed trait T_B
case class CC_A[C]() extends T_A[C, Byte]
case class CC_B(a: T_B, b: CC_A[T_A[T_B, T_B]], c: T_A[Boolean, Byte]) extends T_A[CC_A[T_A[T_B, T_B]], Byte]
case class CC_C() extends T_B
case class CC_D(a: T_A[Int, Byte]) extends T_B
case class CC_E(a: CC_A[CC_B], b: (T_A[CC_D, CC_D],CC_D)) extends T_B

val v_a: CC_B = null
val v_b: Int = v_a match{
  case CC_B(CC_C(), CC_A(), CC_A()) => 0 
  case CC_B(CC_E(CC_A(), (_,_)), CC_A(), CC_A()) => 1 
}
}
// This is not matched: CC_B(CC_D(_), CC_A(), CC_A())