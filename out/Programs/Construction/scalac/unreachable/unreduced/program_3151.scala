package Program_14 

object Test {
sealed trait T_A[A]
sealed trait T_B
case class CC_A() extends T_A[T_A[Int]]
case class CC_B(a: T_A[T_A[CC_A]]) extends T_A[T_A[Int]]
case class CC_C(a: Int, b: T_B, c: T_B) extends T_B
case class CC_D[B](a: CC_B, b: CC_C, c: T_A[B]) extends T_B

val v_a: T_A[T_A[Int]] = null
val v_b: Int = v_a match{
  case CC_A() => 0 
  case CC_B(_) => 1 
}
}