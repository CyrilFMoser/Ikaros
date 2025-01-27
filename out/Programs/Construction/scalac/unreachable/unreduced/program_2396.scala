package Program_12 

object Test {
sealed trait T_A[A]
case class CC_A(a: T_A[(Int,Byte)], b: T_A[T_A[Int]], c: T_A[Char]) extends T_A[T_A[T_A[Byte]]]
case class CC_B(a: Int) extends T_A[T_A[T_A[Byte]]]
case class CC_C(a: CC_B, b: CC_B) extends T_A[T_A[T_A[Byte]]]

val v_a: T_A[T_A[T_A[Byte]]] = null
val v_b: Int = v_a match{
  case CC_A(_, _, _) => 0 
  case CC_C(CC_B(_), _) => 1 
}
}
// This is not matched: CC_B(_)