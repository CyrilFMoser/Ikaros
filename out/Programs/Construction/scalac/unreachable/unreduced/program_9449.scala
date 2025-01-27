package Program_17 

object Test {
sealed trait T_A[A]
sealed trait T_B[B]
case class CC_A[C](a: T_B[C]) extends T_A[C]
case class CC_B(a: T_A[T_A[Boolean]]) extends T_B[Int]
case class CC_C() extends T_B[Int]
case class CC_D(a: CC_A[T_B[Int]], b: (CC_B,CC_A[CC_B])) extends T_B[Int]

val v_a: T_B[Int] = null
val v_b: Int = v_a match{
  case CC_B(CC_A(_)) => 0 
  case CC_C() => 1 
  case CC_D(_, _) => 2 
}
}