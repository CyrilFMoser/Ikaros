package Program_19 

object Test {
sealed trait T_A[A, B]
sealed trait T_B
case class CC_A[C](a: T_A[C, C], b: T_A[C, Int], c: T_A[C, Int]) extends T_A[C, Int]
case class CC_B(a: (Boolean,CC_A[T_B]), b: (T_A[T_B, Int],CC_A[T_B]), c: (T_A[T_B, T_B],T_A[T_B, Int])) extends T_A[(T_A[T_B, Int],T_A[T_B, T_B]), Int]
case class CC_C(a: CC_B, b: CC_B) extends T_A[(T_A[T_B, Int],T_A[T_B, T_B]), Int]
case class CC_D(a: CC_C, b: T_A[T_B, Int], c: T_B) extends T_B
case class CC_E() extends T_B

val v_a: T_B = null
val v_b: Int = v_a match{
  case CC_D(CC_C(CC_B(_, _, _), CC_B(_, _, _)), CC_A(_, _, _), CC_D(_, _, _)) => 0 
  case CC_D(CC_C(CC_B(_, _, _), CC_B(_, _, _)), CC_A(_, _, _), CC_E()) => 1 
  case CC_E() => 2 
}
}