package Program_8 

object Test {
sealed trait T_A[A]
sealed trait T_B[B]
case class CC_A(a: Char, b: Char, c: T_B[T_B[Byte]]) extends T_A[T_A[T_B[Int]]]
case class CC_B(a: T_A[T_A[CC_A]]) extends T_A[T_A[T_B[Int]]]
case class CC_C() extends T_A[T_A[T_B[Int]]]

val v_a: T_A[T_A[T_B[Int]]] = null
val v_b: Int = v_a match{
  case CC_A(_, _, _) => 0 
  case CC_B(_) => 1 
  case CC_C() => 2 
}
}