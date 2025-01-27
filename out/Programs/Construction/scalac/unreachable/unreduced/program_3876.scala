package Program_30 

object Test {
sealed trait T_A[A]
case class CC_A(a: Int, b: T_A[T_A[Char]]) extends T_A[T_A[T_A[Int]]]
case class CC_B(a: Byte, b: Int, c: Byte) extends T_A[T_A[T_A[Int]]]

val v_a: T_A[T_A[T_A[Int]]] = null
val v_b: Int = v_a match{
  case CC_A(_, _) => 0 
  case CC_B(_, _, _) => 1 
}
}