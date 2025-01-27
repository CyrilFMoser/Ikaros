package Program_10 

object Test {
sealed trait T_A[A]
sealed trait T_B[B, C]
case class CC_A(a: Boolean) extends T_A[T_A[Byte]]
case class CC_B(a: T_A[T_B[CC_A, CC_A]], b: T_A[T_A[Byte]]) extends T_A[T_A[Byte]]

val v_a: T_A[T_A[Byte]] = null
val v_b: Int = v_a match{
  case CC_A(_) => 0 
  case CC_B(_, _) => 1 
}
}