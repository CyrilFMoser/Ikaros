package Program_14 

object Test {
sealed trait T_A[A]
sealed trait T_B[B, C]
case class CC_A(a: T_A[T_B[Int, Char]], b: T_B[T_A[Char], Byte]) extends T_A[Int]
case class CC_B[E, D](a: E) extends T_B[D, E]
case class CC_C(a: T_A[T_A[Int]], b: T_B[CC_A, Int]) extends T_B[T_B[T_A[Boolean], Char], T_A[Int]]
case class CC_D() extends T_B[T_B[T_A[Boolean], Char], T_A[Int]]

val v_a: T_B[T_B[T_A[Boolean], Char], T_A[Int]] = null
val v_b: Int = v_a match{
  case CC_B(CC_A(_, CC_B(_))) => 0 
  case CC_C(_, _) => 1 
  case CC_D() => 2 
}
}