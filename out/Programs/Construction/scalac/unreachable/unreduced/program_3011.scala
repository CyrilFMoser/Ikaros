package Program_14 

object Test {
sealed trait T_A[A]
sealed trait T_B[B]
case class CC_A[C]() extends T_A[C]
case class CC_B[D]() extends T_A[D]
case class CC_C(a: T_B[T_B[Int]], b: T_A[CC_A[Char]]) extends T_B[T_A[Int]]
case class CC_D(a: CC_B[CC_B[CC_C]]) extends T_B[T_A[Int]]
case class CC_E(a: T_B[Byte]) extends T_B[T_A[Int]]

val v_a: T_B[T_A[Int]] = null
val v_b: Int = v_a match{
  case CC_C(_, CC_A()) => 0 
  case CC_C(_, CC_B()) => 1 
  case CC_D(CC_B()) => 2 
  case CC_E(_) => 3 
}
}