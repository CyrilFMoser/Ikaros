package Program_11 

object Test {
sealed trait T_A[A, B]
case class CC_A() extends T_A[(T_A[Int, Boolean],T_A[Int, Char]), T_A[T_A[Int, Char], T_A[Boolean, Byte]]]
case class CC_B(a: T_A[(Char,CC_A), T_A[Boolean, CC_A]]) extends T_A[(T_A[Int, Boolean],T_A[Int, Char]), T_A[T_A[Int, Char], T_A[Boolean, Byte]]]

val v_a: T_A[(T_A[Int, Boolean],T_A[Int, Char]), T_A[T_A[Int, Char], T_A[Boolean, Byte]]] = null
val v_b: Int = v_a match{
  case CC_A() => 0 
  case CC_B(_) => 1 
}
}