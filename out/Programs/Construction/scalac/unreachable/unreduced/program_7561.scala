package Program_21 

object Test {
sealed trait T_A[A]
case class CC_A(a: Byte) extends T_A[T_A[T_A[Int]]]
case class CC_B(a: T_A[Boolean]) extends T_A[T_A[T_A[Int]]]

val v_a: T_A[T_A[T_A[Int]]] = null
val v_b: Int = v_a match{
  case CC_A(_) => 0 
  case CC_B(_) => 1 
}
}