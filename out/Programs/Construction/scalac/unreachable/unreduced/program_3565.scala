package Program_0 

object Test {
sealed trait T_A[A]
sealed trait T_B[B, C]
case class CC_A(a: T_A[T_A[Char]], b: T_A[Int]) extends T_A[Byte]
case class CC_B(a: T_A[Byte], b: T_B[T_A[Boolean], (CC_A,CC_A)], c: Int) extends T_A[Byte]

val v_a: T_A[Byte] = null
val v_b: Int = v_a match{
  case CC_A(_, _) => 0 
  case CC_B(_, _, _) => 1 
}
}