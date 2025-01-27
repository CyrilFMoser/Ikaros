package Program_13 

object Test {
sealed trait T_A[A]
sealed trait T_B[B]
case class CC_A() extends T_A[T_B[Int]]
case class CC_B() extends T_A[T_B[Int]]
case class CC_C(a: T_A[T_B[Int]], b: T_A[T_A[Boolean]]) extends T_A[T_B[Int]]
case class CC_D(a: T_A[T_B[Int]], b: CC_A) extends T_B[T_A[T_B[Int]]]

val v_a: T_A[T_B[Int]] = null
val v_b: Int = v_a match{
  case CC_A() => 0 
  case CC_B() => 1 
  case CC_C(_, _) => 2 
}
}