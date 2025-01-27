package Program_31 

object Test {
sealed trait T_A[A]
sealed trait T_B[B, C]
case class CC_A(a: Boolean) extends T_A[T_B[T_A[Int], Byte]]
case class CC_B(a: T_A[T_A[CC_A]], b: T_B[T_B[CC_A, Boolean], Boolean], c: T_A[T_B[CC_A, CC_A]]) extends T_A[T_B[T_A[Int], Byte]]
case class CC_C(a: CC_A) extends T_A[T_B[T_A[Int], Byte]]

val v_a: T_A[T_B[T_A[Int], Byte]] = null
val v_b: Int = v_a match{
  case CC_A(_) => 0 
  case CC_B(_, _, _) => 1 
  case CC_C(CC_A(_)) => 2 
}
}