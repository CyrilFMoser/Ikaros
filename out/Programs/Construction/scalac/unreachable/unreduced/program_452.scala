package Program_17 

object Test {
sealed trait T_A[A, B]
sealed trait T_B
case class CC_A(a: T_B) extends T_A[T_B, T_A[T_B, T_A[T_B, T_B]]]
case class CC_B(a: T_A[(CC_A,CC_A), CC_A], b: T_B, c: T_B) extends T_B
case class CC_C(a: T_A[(T_B,Byte), T_B], b: T_A[T_A[CC_B, CC_B], CC_B], c: Char) extends T_B
case class CC_D(a: CC_A, b: (Boolean,CC_C)) extends T_B

val v_a: T_A[T_B, T_A[T_B, T_A[T_B, T_B]]] = null
val v_b: Int = v_a match{
  case CC_A(CC_B(_, _, _)) => 0 
  case CC_A(CC_C(_, _, _)) => 1 
  case CC_A(CC_D(_, _)) => 2 
}
}