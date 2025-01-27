package Program_0 

object Test {
sealed trait T_A[A]
sealed trait T_B[B]
case class CC_A() extends T_A[Int]
case class CC_B(a: T_B[T_A[CC_A]], b: T_B[T_A[Int]]) extends T_A[Int]
case class CC_C[C](a: C) extends T_B[C]
case class CC_D[D](a: CC_A, b: T_A[CC_B]) extends T_B[D]

val v_a: T_A[Int] = null
val v_b: Int = v_a match{
  case CC_A() => 0 
  case CC_B(CC_C(_), CC_C(CC_A())) => 1 
  case CC_B(CC_C(_), CC_C(CC_B(_, _))) => 2 
  case CC_B(CC_C(_), CC_D(CC_A(), _)) => 3 
  case CC_B(CC_D(_, _), CC_C(CC_A())) => 4 
  case CC_B(CC_D(_, _), CC_C(CC_B(_, _))) => 5 
  case CC_B(CC_D(_, _), CC_D(CC_A(), _)) => 6 
}
}