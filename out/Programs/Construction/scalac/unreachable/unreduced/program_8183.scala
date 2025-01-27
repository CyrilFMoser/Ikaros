package Program_6 

object Test {
sealed trait T_A[A]
sealed trait T_B[B]
case class CC_A(a: (Boolean,T_B[Boolean]), b: T_B[T_B[Char]], c: T_B[(Int,Char)]) extends T_A[T_B[T_B[Char]]]
case class CC_B[C](a: CC_A, b: T_A[C]) extends T_A[C]
case class CC_C[D](a: T_B[D], b: T_B[D]) extends T_A[D]
case class CC_D(a: Byte) extends T_B[T_A[CC_C[Byte]]]
case class CC_E(a: Boolean, b: T_A[T_A[CC_D]]) extends T_B[T_A[CC_C[Byte]]]

val v_a: T_B[T_A[CC_C[Byte]]] = null
val v_b: Int = v_a match{
  case CC_E(_, CC_B(_, CC_B(_, _))) => 0 
  case CC_E(_, CC_B(_, CC_C(_, _))) => 1 
  case CC_E(_, CC_C(_, _)) => 2 
}
}
// This is not matched: CC_D(_)