package Program_22 

object Test {
sealed trait T_A[A, B]
case class CC_A[C](a: T_A[C, C]) extends T_A[C, Int]
case class CC_B(a: CC_A[CC_A[Int]], b: T_A[Boolean, Int], c: T_A[T_A[Boolean, Int], Int]) extends T_A[Boolean, Int]
case class CC_C(a: CC_A[CC_A[CC_B]], b: CC_A[Int], c: T_A[Boolean, Int]) extends T_A[T_A[Boolean, Int], Int]

val v_a: T_A[T_A[Boolean, Int], Int] = null
val v_b: Int = v_a match{
  case CC_A(_) => 0 
  case CC_C(_, _, _) => 1 
}
}