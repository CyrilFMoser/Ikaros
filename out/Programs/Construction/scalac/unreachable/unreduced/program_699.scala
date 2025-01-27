package Program_20 

object Test {
sealed trait T_A[A]
sealed trait T_B[B]
case class CC_A(a: Int, b: T_B[(Boolean,Char)], c: T_B[T_B[Byte]]) extends T_A[T_A[T_A[Byte]]]
case class CC_B(a: Byte, b: T_A[CC_A], c: T_A[T_A[Int]]) extends T_A[T_A[T_A[Byte]]]
case class CC_C[C](a: Char, b: CC_A, c: CC_A) extends T_B[C]

val v_a: T_A[T_A[T_A[Byte]]] = null
val v_b: Int = v_a match{
  case CC_A(_, CC_C(_, _, _), CC_C(_, _, _)) => 0 
  case CC_B(_, _, _) => 1 
}
}