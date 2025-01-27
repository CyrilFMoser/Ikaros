package Program_0 

object Test {
sealed trait T_A[A, B]
case class CC_A[C](a: C, b: T_A[T_A[C, C], C]) extends T_A[T_A[C, C], C]
case class CC_B() extends T_A[T_A[CC_A[Byte], CC_A[Byte]], CC_A[Byte]]
case class CC_C[D](a: T_A[D, D], b: T_A[D, D], c: CC_A[D]) extends T_A[T_A[D, D], D]

val v_a: CC_A[T_A[T_A[CC_A[Byte], CC_A[Byte]], CC_A[Byte]]] = null
val v_b: Int = v_a match{
  case CC_A(_, CC_A(_, _)) => 0 
  case CC_A(_, CC_C(_, _, _)) => 1 
}
}