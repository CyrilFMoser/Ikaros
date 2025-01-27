package Program_9 

object Test {
sealed trait T_A[A, B]
sealed trait T_B
case class CC_A(a: T_B, b: T_B) extends T_A[T_B, (T_A[T_B, T_B],T_A[T_B, Byte])]
case class CC_B(a: T_A[T_B, T_B]) extends T_A[T_B, (T_A[T_B, T_B],T_A[T_B, Byte])]
case class CC_C(a: T_A[Boolean, (T_B,CC_A)], b: CC_A, c: CC_B) extends T_B
case class CC_D() extends T_B
case class CC_E(a: Byte, b: (CC_D,CC_C)) extends T_B

val v_a: T_A[T_B, (T_A[T_B, T_B],T_A[T_B, Byte])] = null
val v_b: Int = v_a match{
  case CC_A(CC_C(_, CC_A(_, _), _), CC_C(_, _, _)) => 0 
  case CC_A(CC_D(), CC_C(_, _, _)) => 1 
  case CC_A(CC_E(_, _), CC_C(_, _, _)) => 2 
  case CC_A(CC_C(_, CC_A(_, _), _), CC_D()) => 3 
  case CC_A(CC_D(), CC_D()) => 4 
  case CC_A(CC_E(_, _), CC_D()) => 5 
  case CC_A(CC_C(_, CC_A(_, _), _), CC_E(_, (_,_))) => 6 
  case CC_A(CC_D(), CC_E(_, (_,_))) => 7 
  case CC_A(CC_E(_, _), CC_E(_, (_,_))) => 8 
  case CC_B(_) => 9 
}
}