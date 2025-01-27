package Program_31 

object Test {
sealed trait T_A[A]
case class CC_A(a: T_A[T_A[Char]], b: Boolean) extends T_A[T_A[T_A[Int]]]
case class CC_B(a: Byte, b: Byte) extends T_A[T_A[T_A[Int]]]
case class CC_C(a: T_A[Byte], b: T_A[T_A[CC_A]], c: Boolean) extends T_A[T_A[T_A[Int]]]

val v_a: T_A[T_A[T_A[Int]]] = null
val v_b: Int = v_a match{
  case CC_A(_, _) => 0 
  case CC_B(0, _) => 1 
  case CC_B(_, _) => 2 
  case CC_C(_, _, _) => 3 
}
}