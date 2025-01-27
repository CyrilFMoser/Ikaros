package Program_19 

object Test {
sealed trait T_A[A]
case class CC_A(a: T_A[T_A[Int]], b: Byte) extends T_A[T_A[T_A[Byte]]]
case class CC_B[B](a: T_A[T_A[B]]) extends T_A[T_A[T_A[Byte]]]
case class CC_C(a: Char, b: T_A[CC_A]) extends T_A[T_A[T_A[Byte]]]

val v_a: T_A[T_A[T_A[Byte]]] = null
val v_b: Int = v_a match{
  case CC_A(_, 0) => 0 
  case CC_A(_, _) => 1 
  case CC_B(_) => 2 
  case CC_C(_, _) => 3 
}
}