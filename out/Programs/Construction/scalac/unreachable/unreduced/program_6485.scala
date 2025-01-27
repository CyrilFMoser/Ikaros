package Program_25 

object Test {
sealed trait T_A[A]
sealed trait T_B[B]
case class CC_A(a: T_A[T_B[Int]]) extends T_A[T_B[T_A[Byte]]]
case class CC_B(a: T_B[CC_A], b: Byte, c: CC_A) extends T_A[T_B[T_A[Byte]]]

val v_a: T_A[T_B[T_A[Byte]]] = null
val v_b: Int = v_a match{
  case CC_A(_) => 0 
  case CC_B(_, _, _) => 1 
}
}