package Program_6 

object Test {
sealed trait T_A[A]
sealed trait T_B
case class CC_A(a: ((T_B,Char),(T_B,Char))) extends T_A[T_A[T_A[T_B]]]
case class CC_B(a: T_B) extends T_A[T_A[T_A[T_B]]]
case class CC_C(a: T_B, b: T_A[T_B], c: Byte) extends T_B
case class CC_D() extends T_B
case class CC_E() extends T_B

val v_a: T_A[T_A[T_A[T_B]]] = null
val v_b: Int = v_a match{
  case CC_A((_,_)) => 0 
  case CC_B(CC_C(_, _, _)) => 1 
  case CC_B(CC_D()) => 2 
}
}
// This is not matched: CC_B(CC_E())