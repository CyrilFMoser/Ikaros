package Program_30 

object Test {
sealed trait T_A[A]
sealed trait T_B[B]
case class CC_A(a: T_A[T_B[Int]], b: Int) extends T_A[T_A[T_B[Byte]]]
case class CC_B[C](a: T_B[C], b: CC_A, c: CC_A) extends T_A[C]
case class CC_C(a: (T_A[(Boolean,Char)],CC_B[Int]), b: T_A[T_A[CC_A]], c: CC_B[Boolean]) extends T_A[T_A[T_B[Byte]]]
case class CC_D() extends T_B[T_B[Int]]

val v_a: T_A[T_A[T_B[Byte]]] = null
val v_b: Int = v_a match{
  case CC_A(_, _) => 0 
  case CC_C((CC_B(_, _, _),CC_B(_, _, _)), _, _) => 1 
}
}
// This is not matched: CC_B(_, CC_A(_, _), CC_A(CC_B(_, _, _), _))