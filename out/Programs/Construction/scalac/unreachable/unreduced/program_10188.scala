package Program_22 

object Test {
sealed trait T_A[A]
case class CC_A(a: Int, b: T_A[(Byte,Int)]) extends T_A[T_A[T_A[Int]]]
case class CC_B(a: Byte) extends T_A[T_A[T_A[Int]]]

val v_a: T_A[T_A[T_A[Int]]] = null
val v_b: Int = v_a match{
  case CC_A(_, _) => 0 
  case CC_B(_) => 1 
}
}