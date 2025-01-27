package Program_30 

object Test {
sealed trait T_A[A, B]
sealed trait T_B
case class CC_A[C]() extends T_A[T_B, C]
case class CC_B(a: T_A[CC_A[Char], Byte], b: CC_A[T_B], c: T_B) extends T_B
case class CC_C() extends T_B
case class CC_D(a: CC_A[CC_B], b: T_A[CC_C, (Boolean,(Byte,Byte))]) extends T_B

val v_a: T_B = null
val v_b: Int = v_a match{
  case CC_C() => 0 
  case CC_D(CC_A(), _) => 1 
}
}
// This is not matched: CC_B(_, CC_A(), _)