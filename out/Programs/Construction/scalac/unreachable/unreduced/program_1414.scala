package Program_26 

object Test {
sealed trait T_A[A]
case class CC_A(a: Int, b: T_A[T_A[Boolean]]) extends T_A[T_A[T_A[Byte]]]
case class CC_B[B](a: CC_A, b: T_A[B]) extends T_A[T_A[T_A[Byte]]]
case class CC_C(a: T_A[CC_B[CC_A]], b: T_A[CC_B[CC_A]], c: CC_A) extends T_A[T_A[T_A[Byte]]]

val v_a: T_A[T_A[T_A[Byte]]] = null
val v_b: Int = v_a match{
  case CC_A(_, _) => 0 
  case CC_B(_, _) => 1 
  case CC_C(_, _, _) => 2 
}
}