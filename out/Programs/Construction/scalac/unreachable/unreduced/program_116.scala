package Program_3 

object Test {
sealed trait T_A[A]
sealed trait T_B[B, C]
case class CC_A(a: T_A[T_B[Char, Int]]) extends T_A[T_A[T_B[Byte, Boolean]]]
case class CC_B(a: T_A[CC_A]) extends T_A[T_A[T_B[Byte, Boolean]]]
case class CC_C(a: (T_A[CC_B],CC_A), b: Int) extends T_A[T_A[T_B[Byte, Boolean]]]

val v_a: T_A[T_A[T_B[Byte, Boolean]]] = null
val v_b: Int = v_a match{
  case CC_A(_) => 0 
  case CC_B(_) => 1 
  case CC_C(_, 12) => 2 
}
}
// This is not matched: CC_C(_, _)