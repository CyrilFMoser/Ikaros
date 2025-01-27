package Program_4 

object Test {
sealed trait T_A[A]
sealed trait T_B[B]
case class CC_A[C](a: C, b: T_B[C], c: C) extends T_A[C]
case class CC_B() extends T_B[Int]
case class CC_C(a: T_A[T_B[Int]]) extends T_B[Int]

val v_a: T_B[Int] = null
val v_b: Int = v_a match{
  case CC_B() => 0 
  case CC_C(CC_A(_, _, _)) => 1 
}
}