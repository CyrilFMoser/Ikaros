package Program_9 

object Test {
sealed trait T_A[A, B]
sealed trait T_B
case class CC_A(a: T_A[T_A[T_B, T_B], Int], b: T_B) extends T_A[T_B, T_A[T_B, T_A[(Byte,Int), T_B]]]
case class CC_B(a: T_B, b: Int, c: CC_A) extends T_A[T_B, T_A[T_B, T_A[(Byte,Int), T_B]]]
case class CC_C(a: T_B, b: CC_B) extends T_A[T_B, T_A[T_B, T_A[(Byte,Int), T_B]]]
case class CC_D(a: T_B, b: (CC_A,CC_A), c: CC_B) extends T_B
case class CC_E[C](a: (CC_B,CC_C)) extends T_B

val v_a: T_A[T_B, T_A[T_B, T_A[(Byte,Int), T_B]]] = null
val v_b: Int = v_a match{
  case CC_A(_, CC_D(_, _, _)) => 0 
  case CC_A(_, CC_E(_)) => 1 
  case CC_B(_, _, CC_A(_, _)) => 2 
  case CC_C(_, CC_B(_, _, _)) => 3 
}
}