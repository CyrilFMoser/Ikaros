package Program_6 

object Test {
sealed trait T_A[A]
sealed trait T_B[B]
case class CC_A(a: T_B[T_A[Int]], b: T_A[T_B[Boolean]], c: T_A[T_A[Boolean]]) extends T_A[T_B[Char]]
case class CC_B(a: T_A[T_B[Char]], b: Byte) extends T_A[T_B[Char]]

val v_a: T_A[T_B[Char]] = null
val v_b: Int = v_a match{
  case CC_A(_, _, _) => 0 
  case CC_B(CC_A(_, _, _), _) => 1 
  case CC_B(CC_B(_, _), _) => 2 
}
}