package Program_29 

object Test {
sealed trait T_A[A, B]
sealed trait T_B
case class CC_A[C](a: T_A[C, C], b: C) extends T_A[C, Int]
case class CC_B[D]() extends T_A[D, Int]
case class CC_C(a: T_A[T_A[Byte, Int], Int]) extends T_B
case class CC_D(a: CC_A[CC_B[CC_C]]) extends T_B
case class CC_E(a: (T_A[CC_D, Int],T_A[Char, Int]), b: CC_B[CC_A[T_B]], c: T_A[CC_C, CC_B[(Int,Char)]]) extends T_B

val v_a: CC_C = null
val v_b: Int = v_a match{
  case CC_C(CC_A(_, CC_A(_, _))) => 0 
  case CC_C(CC_A(_, CC_B())) => 1 
  case CC_C(CC_B()) => 2 
}
}