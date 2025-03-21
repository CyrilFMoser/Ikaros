package Program_5 

object Test {
sealed trait T_A[A]
case class CC_A[B](a: T_A[B], b: T_A[B]) extends T_A[T_A[T_A[Byte]]]
case class CC_B(a: CC_A[Int], b: CC_A[CC_A[Char]]) extends T_A[T_A[T_A[Byte]]]
case class CC_C(a: T_A[(Char,CC_B)], b: T_A[((Int,Char),Byte)]) extends T_A[T_A[T_A[Byte]]]

val v_a: T_A[T_A[T_A[Byte]]] = null
val v_b: Int = v_a match{
  case CC_A(_, _) => 0 
  case CC_B(CC_A(_, _), CC_A(_, _)) => 1 
  case CC_C(_, _) => 2 
}
}