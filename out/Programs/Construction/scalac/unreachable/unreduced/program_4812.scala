package Program_10 

object Test {
sealed trait T_A[A]
sealed trait T_B
case class CC_A(a: T_B, b: T_A[T_A[T_B]], c: Boolean) extends T_A[T_B]
case class CC_B() extends T_A[T_B]
case class CC_C(a: Byte, b: (CC_B,Int), c: T_A[T_B]) extends T_A[T_B]
case class CC_D(a: CC_C, b: CC_A) extends T_B
case class CC_E(a: T_A[T_B]) extends T_B
case class CC_F(a: (CC_B,CC_C), b: Byte, c: Byte) extends T_B

val v_a: T_B = null
val v_b: Int = v_a match{
  case CC_D(CC_C(_, _, CC_A(_, _, _)), CC_A(_, _, _)) => 0 
  case CC_D(CC_C(_, _, CC_B()), CC_A(_, _, _)) => 1 
  case CC_D(CC_C(_, _, CC_C(_, _, _)), CC_A(_, _, _)) => 2 
  case CC_E(CC_A(_, _, _)) => 3 
  case CC_E(CC_B()) => 4 
  case CC_E(CC_C(_, (_,_), _)) => 5 
  case CC_F(_, _, _) => 6 
}
}