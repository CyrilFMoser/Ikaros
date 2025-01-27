package Program_19 

object Test {
sealed trait T_A[A]
sealed trait T_B[B]
case class CC_A() extends T_A[T_A[Int]]
case class CC_B(a: T_A[T_A[Int]], b: T_A[T_A[Int]]) extends T_A[T_A[Int]]
case class CC_C(a: CC_B, b: Int, c: T_A[T_B[(Boolean,Char)]]) extends T_A[T_A[Int]]
case class CC_D[C](a: C, b: T_A[C]) extends T_B[C]
case class CC_E(a: T_A[(CC_C,CC_B)]) extends T_B[CC_C]

val v_a: CC_B = null
val v_b: Int = v_a match{
  case CC_B(CC_A(), CC_A()) => 0 
  case CC_B(CC_B(_, _), CC_A()) => 1 
  case CC_B(CC_C(_, _, _), CC_A()) => 2 
  case CC_B(CC_A(), CC_B(_, _)) => 3 
  case CC_B(CC_B(_, _), CC_B(_, _)) => 4 
  case CC_B(CC_C(_, _, _), CC_B(_, _)) => 5 
  case CC_B(CC_A(), CC_C(_, _, _)) => 6 
  case CC_B(CC_B(_, _), CC_C(_, _, _)) => 7 
  case CC_B(CC_C(_, _, _), CC_C(_, _, _)) => 8 
}
}