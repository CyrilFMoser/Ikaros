package Program_7 

object Test {
sealed trait T_A[A]
sealed trait T_B[B, C]
case class CC_A(a: T_A[(Byte,Boolean)], b: T_A[T_A[Boolean]], c: T_A[T_B[Int, Char]]) extends T_A[T_A[T_B[Boolean, Byte]]]
case class CC_B(a: T_A[CC_A], b: T_B[CC_A, T_B[CC_A, CC_A]]) extends T_A[T_A[T_B[Boolean, Byte]]]
case class CC_C() extends T_A[T_A[T_B[Boolean, Byte]]]

val v_a: T_A[T_A[T_B[Boolean, Byte]]] = null
val v_b: Int = v_a match{
  case CC_A(_, _, _) => 0 
  case CC_C() => 1 
}
}
// This is not matched: CC_B(_, _)