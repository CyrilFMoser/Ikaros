package Program_15 

object Test {
sealed trait T_A[A, B]
sealed trait T_B
case class CC_A[C](a: T_B, b: (T_B,T_B)) extends T_A[T_B, C]
case class CC_B() extends T_B
case class CC_D() extends T_B

val v_a: CC_A[Int] = null
val v_b: Int = v_a match{
  case CC_A(CC_B(), _) => 0 
}
}
// This is not matched: (CC_A Byte (T_A Byte))