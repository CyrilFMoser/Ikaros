package Program_9 

object Test {
sealed trait T_A[A]
sealed trait T_B[B]
case class CC_A(a: T_B[T_B[Char]], b: Byte, c: T_B[T_A[Int]]) extends T_A[T_A[T_B[Byte]]]
case class CC_B[C](a: T_A[C], b: CC_A, c: CC_A) extends T_A[C]

val v_a: T_A[Byte] = null
val v_b: Int = v_a match{
  case CC_B(_, CC_A(_, _, _), CC_A(_, _, _)) => 0 
}
}