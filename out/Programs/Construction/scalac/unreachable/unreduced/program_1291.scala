package Program_13 

object Test {
sealed trait T_A[A]
sealed trait T_B[B]
case class CC_A(a: Char, b: T_B[T_A[(Byte,Boolean)]], c: T_A[T_A[Char]]) extends T_A[T_A[Char]]
case class CC_B(a: Byte) extends T_A[T_A[Char]]
case class CC_C[C](a: CC_A, b: CC_A) extends T_B[C]
case class CC_D(a: T_A[T_A[Char]]) extends T_B[T_B[CC_C[Int]]]
case class CC_E(a: T_A[T_B[CC_B]], b: CC_B, c: T_B[CC_C[CC_B]]) extends T_B[T_B[CC_C[Int]]]

val v_a: T_B[T_B[CC_C[Int]]] = null
val v_b: Int = v_a match{
  case CC_C(_, _) => 0 
  case CC_E(_, CC_B(_), _) => 1 
}
}
// This is not matched: CC_D(_)