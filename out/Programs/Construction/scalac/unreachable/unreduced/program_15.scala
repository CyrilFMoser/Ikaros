package Program_9 

object Test {
sealed trait T_A[A]
case class CC_A(a: T_A[T_A[Char]], b: Boolean) extends T_A[T_A[T_A[Byte]]]
case class CC_B(a: Boolean, b: CC_A, c: Int) extends T_A[T_A[T_A[Byte]]]

val v_a: T_A[T_A[T_A[Byte]]] = null
val v_b: Int = v_a match{
  case CC_A(_, _) => 0 
  case CC_B(_, _, _) => 1 
}
}