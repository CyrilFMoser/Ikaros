package Program_14 

object Test {
sealed trait T_A[A]
sealed trait T_B[B]
case class CC_A[C](a: T_B[C]) extends T_A[C]
case class CC_B(a: CC_A[Int], b: T_A[Int], c: T_A[T_A[Boolean]]) extends T_A[Int]
case class CC_C(a: T_A[Int]) extends T_B[Int]
case class CC_D(a: T_A[T_A[CC_B]], b: (CC_A[CC_C],T_A[CC_C])) extends T_B[Int]
case class CC_E(a: Int, b: CC_A[T_A[Int]], c: T_A[CC_B]) extends T_B[Int]

val v_a: CC_C = null
val v_b: Int = v_a match{
  case CC_C(CC_A(CC_C(_))) => 0 
  case CC_C(CC_A(CC_D(_, _))) => 1 
  case CC_C(CC_A(CC_E(_, _, _))) => 2 
  case CC_C(CC_B(CC_A(_), CC_A(_), CC_A(_))) => 3 
  case CC_C(CC_B(CC_A(_), CC_B(_, _, _), CC_A(_))) => 4 
}
}