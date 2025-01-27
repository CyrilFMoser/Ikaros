package Program_21 

object Test {
sealed trait T_A[A]
sealed trait T_B[B]
case class CC_A(a: T_A[Byte], b: T_A[(Boolean,Int)], c: T_B[T_B[Boolean]]) extends T_A[T_A[T_B[Byte]]]
case class CC_B(a: (Char,T_A[CC_A]), b: CC_A, c: T_A[T_A[CC_A]]) extends T_A[T_A[T_B[Byte]]]
case class CC_C(a: Byte) extends T_A[T_A[T_B[Byte]]]

val v_a: T_A[T_A[T_B[Byte]]] = null
val v_b: Int = v_a match{
  case CC_A(_, _, _) => 0 
  case CC_B(_, CC_A(_, _, _), _) => 1 
  case CC_C(_) => 2 
}
}