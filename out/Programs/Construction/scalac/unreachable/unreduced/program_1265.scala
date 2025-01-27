package Program_9 

object Test {
sealed trait T_A[A, B]
case class CC_A[C](a: T_A[C, C], b: T_A[T_A[Boolean, Char], C], c: C) extends T_A[T_A[Boolean, Char], C]
case class CC_B[D](a: Int, b: T_A[T_A[Boolean, Char], D]) extends T_A[T_A[Boolean, Char], D]

val v_a: CC_B[Int] = null
val v_b: Int = v_a match{
  case CC_B(_, CC_A(_, _, _)) => 0 
  case CC_B(_, CC_B(_, _)) => 1 
}
}