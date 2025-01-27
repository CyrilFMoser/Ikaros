package Program_18 

object Test {
sealed trait T_A[A]
case class CC_A(a: T_A[T_A[Byte]], b: Boolean) extends T_A[T_A[T_A[Byte]]]
case class CC_B[B](a: Byte, b: Byte) extends T_A[T_A[T_A[Byte]]]
case class CC_C(a: (T_A[CC_A],CC_A)) extends T_A[T_A[T_A[Byte]]]

val v_a: T_A[T_A[T_A[Byte]]] = null
val v_b: Int = v_a match{
  case CC_A(_, true) => 0 
  case CC_A(_, false) => 1 
  case CC_B(_, _) => 2 
  case CC_C((_,CC_A(_, _))) => 3 
}
}