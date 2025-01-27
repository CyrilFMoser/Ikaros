package Program_0 

object Test {
sealed trait T_A[A]
sealed trait T_B
case class CC_A[B](a: B) extends T_A[Int]
case class CC_B[C](a: CC_A[C], b: T_B, c: T_A[Int]) extends T_A[Int]
case class CC_C(a: CC_A[T_B], b: T_A[Int]) extends T_B
case class CC_D[D](a: Int, b: CC_C, c: T_A[Int]) extends T_B
case class CC_E(a: T_A[T_B]) extends T_B

val v_a: T_B = null
val v_b: Int = v_a match{
  case CC_C(_, _) => 0 
  case CC_E(_) => 1 
}
}
// This is not matched: CC_D(_, _, _)