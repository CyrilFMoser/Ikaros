package Program_8 

object Test {
sealed trait T_A[A]
sealed trait T_B[B]
case class CC_A(a: T_B[Byte]) extends T_A[T_A[T_A[Char]]]
case class CC_B(a: T_A[T_A[Int]], b: T_B[T_A[CC_A]], c: Byte) extends T_A[T_A[T_A[Char]]]
case class CC_C[C](a: T_A[C], b: CC_B) extends T_A[T_A[T_A[Char]]]
case class CC_D[D]() extends T_B[D]

val v_a: T_A[T_A[T_A[Char]]] = null
val v_b: Int = v_a match{
  case CC_A(CC_D()) => 0 
  case CC_B(_, CC_D(), _) => 1 
}
}
// This is not matched: CC_C(_, CC_B(_, CC_D(), _))