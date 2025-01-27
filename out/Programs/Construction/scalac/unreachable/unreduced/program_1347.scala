package Program_26 

object Test {
sealed trait T_A[A]
sealed trait T_B
case class CC_A(a: Int) extends T_A[T_A[T_A[T_B]]]
case class CC_B(a: T_B, b: CC_A, c: T_B) extends T_A[T_A[T_A[T_B]]]
case class CC_C(a: T_A[Byte], b: T_A[CC_B], c: Byte) extends T_A[T_A[T_A[T_B]]]
case class CC_D[B]() extends T_B
case class CC_E() extends T_B
case class CC_F() extends T_B

val v_a: T_A[T_A[T_A[T_B]]] = null
val v_b: Int = v_a match{
  case CC_A(_) => 0 
  case CC_B(CC_D(), _, _) => 1 
  case CC_B(CC_E(), _, _) => 2 
  case CC_B(CC_F(), _, _) => 3 
  case CC_C(_, _, _) => 4 
}
}