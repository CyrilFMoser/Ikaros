package Program_22 

object Test {
sealed trait T_A[A]
sealed trait T_B[B]
case class CC_A(a: T_A[Int]) extends T_A[T_A[T_B[Char]]]
case class CC_B(a: Byte) extends T_A[T_A[T_B[Char]]]
case class CC_C[C](a: C, b: T_B[C]) extends T_B[C]

val v_a: T_A[T_A[T_B[Char]]] = null
val v_b: Int = v_a match{
  case CC_A(_) => 0 
  case CC_B(_) => 1 
}
}