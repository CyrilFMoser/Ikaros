package Program_26 

object Test {
sealed trait T_A[A]
sealed trait T_B[B]
case class CC_A() extends T_A[T_B[T_A[Byte]]]
case class CC_B(a: T_A[T_A[(Char,Byte)]], b: T_A[T_B[CC_A]], c: T_A[T_B[Boolean]]) extends T_A[T_B[T_A[Byte]]]
case class CC_C(a: T_B[T_B[CC_B]], b: T_B[CC_B], c: Byte) extends T_A[T_B[T_A[Byte]]]

val v_a: T_A[T_B[T_A[Byte]]] = null
val v_b: Int = v_a match{
  case CC_B(_, _, _) => 0 
  case CC_C(_, _, _) => 1 
}
}
// This is not matched: CC_A()