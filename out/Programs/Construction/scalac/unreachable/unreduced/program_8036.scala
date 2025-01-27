package Program_20 

object Test {
sealed trait T_A[A]
sealed trait T_B[B]
case class CC_A(a: T_B[((Byte,Byte),Char)]) extends T_A[T_A[T_B[Boolean]]]
case class CC_B() extends T_A[T_A[T_B[Boolean]]]
case class CC_C(a: Byte) extends T_B[T_B[CC_B]]
case class CC_D(a: T_A[CC_B]) extends T_B[T_B[CC_B]]
case class CC_E[C](a: T_B[T_B[CC_B]]) extends T_B[C]

val v_a: T_B[T_B[CC_B]] = null
val v_b: Int = v_a match{
  case CC_C(_) => 0 
  case CC_D(_) => 1 
  case CC_E(CC_C(_)) => 2 
  case CC_E(CC_D(_)) => 3 
  case CC_E(CC_E(CC_C(_))) => 4 
  case CC_E(CC_E(CC_D(_))) => 5 
  case CC_E(CC_E(CC_E(_))) => 6 
}
}