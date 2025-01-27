package Program_21 

object Test {
sealed trait T_A[A]
sealed trait T_B[B, C]
case class CC_A(a: T_A[T_A[Int]], b: T_B[T_B[Int, Boolean], T_A[Byte]]) extends T_A[T_B[T_B[Int, Int], Byte]]
case class CC_B() extends T_A[T_B[T_B[Int, Int], Byte]]

val v_a: T_A[T_B[T_B[Int, Int], Byte]] = null
val v_b: Int = v_a match{
  case CC_A(_, _) => 0 
  case CC_B() => 1 
}
}