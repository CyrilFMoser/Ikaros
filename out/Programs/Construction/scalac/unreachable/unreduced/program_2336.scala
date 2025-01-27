package Program_6 

object Test {
sealed trait T_A[A]
sealed trait T_B[B]
case class CC_A(a: T_A[Char], b: T_B[T_A[(Byte,Boolean)]], c: T_B[T_A[Byte]]) extends T_A[T_B[T_A[Byte]]]
case class CC_B(a: Boolean, b: T_B[T_A[CC_A]]) extends T_B[T_A[T_A[CC_A]]]
case class CC_C() extends T_B[T_A[T_A[CC_A]]]

val v_a: T_B[T_A[T_A[CC_A]]] = null
val v_b: Int = v_a match{
  case CC_B(_, _) => 0 
  case CC_C() => 1 
}
}