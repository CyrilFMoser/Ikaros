package Program_14 

object Test {
sealed trait T_A[A, B]
sealed trait T_B
case class CC_A[C]() extends T_A[T_A[T_B, T_B], C]
case class CC_C() extends T_B
case class CC_D(a: T_A[Int, CC_C], b: Int) extends T_B

val v_a: T_B = null
val v_b: Int = v_a match{
  case CC_C() => 0 
  case CC_D(_, 12) => 1 
}
}
// This is not matched: (CC_B Byte Wildcard Wildcard (T_A Byte))