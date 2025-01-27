package Program_12 

object Test {
sealed trait T_A[A]
sealed trait T_B[B]
case class CC_A(a: Byte, b: Int) extends T_A[T_B[T_B[Int]]]
case class CC_B(a: CC_A, b: T_A[T_A[CC_A]]) extends T_A[T_B[T_B[Int]]]
case class CC_C(a: CC_A, b: T_B[CC_A], c: CC_B) extends T_A[T_B[T_B[Int]]]

val v_a: T_A[T_B[T_B[Int]]] = null
val v_b: Int = v_a match{
  case CC_A(_, _) => 0 
  case CC_B(_, _) => 1 
  case CC_C(_, _, _) => 2 
}
}