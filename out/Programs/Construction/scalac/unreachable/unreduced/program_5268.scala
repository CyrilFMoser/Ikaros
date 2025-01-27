package Program_21 

object Test {
sealed trait T_A[A, B]
sealed trait T_B[C]
case class CC_A[D](a: T_A[D, D], b: D) extends T_A[T_B[D], D]
case class CC_B(a: Byte) extends T_A[T_B[CC_A[T_A[Byte, Boolean]]], CC_A[T_A[Byte, Boolean]]]

val v_a: T_A[T_B[CC_A[T_A[Byte, Boolean]]], CC_A[T_A[Byte, Boolean]]] = null
val v_b: Int = v_a match{
  case CC_A(_, CC_A(_, _)) => 0 
  case CC_B(_) => 1 
}
}