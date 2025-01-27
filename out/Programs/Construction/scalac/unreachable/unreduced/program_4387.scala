package Program_0 

object Test {
sealed trait T_A[A]
sealed trait T_B[B]
case class CC_A(a: T_B[Int], b: T_A[T_B[Byte]]) extends T_A[T_B[T_A[Byte]]]
case class CC_B() extends T_A[T_B[T_A[Byte]]]

val v_a: T_A[T_B[T_A[Byte]]] = null
val v_b: Int = v_a match{
  case CC_A(_, _) => 0 
  case CC_B() => 1 
}
}