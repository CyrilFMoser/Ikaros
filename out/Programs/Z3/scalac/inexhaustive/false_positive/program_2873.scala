package Program_31 

object Test {
sealed trait T_A[A, B]
case class CC_A[C](a: T_A[C, C], b: Int) extends T_A[T_A[Boolean, Int], C]

val v_a: T_A[T_A[Boolean, Int], Boolean] = null
val v_b: Int = v_a match{
  case CC_A(_, 12) => 0 
}
}
// This is not matched: (CC_D Byte Wildcard Byte (T_B Byte))