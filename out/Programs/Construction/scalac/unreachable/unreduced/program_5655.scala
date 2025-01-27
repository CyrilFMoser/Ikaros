package Program_31 

object Test {
sealed trait T_A[A]
sealed trait T_B
case class CC_A(a: T_B, b: T_A[T_A[T_B]], c: (Int,T_B)) extends T_A[T_A[T_B]]
case class CC_B(a: (CC_A,Byte), b: Byte, c: T_A[CC_A]) extends T_A[T_A[T_B]]
case class CC_C(a: T_A[T_A[T_B]], b: T_A[CC_A], c: T_B) extends T_B
case class CC_D() extends T_B
case class CC_E(a: Byte) extends T_B

val v_a: T_B = null
val v_b: Int = v_a match{
  case CC_C(_, _, CC_C(_, _, _)) => 0 
  case CC_C(_, _, CC_D()) => 1 
  case CC_C(_, _, CC_E(_)) => 2 
  case CC_D() => 3 
  case CC_E(0) => 4 
  case CC_E(_) => 5 
}
}