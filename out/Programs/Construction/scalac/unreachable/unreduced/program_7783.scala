package Program_13 

object Test {
sealed trait T_A[A, B]
sealed trait T_B
case class CC_A[C](a: T_A[C, C], b: T_B, c: T_B) extends T_A[C, (T_A[T_B, T_B],T_A[T_B, T_B])]
case class CC_B[D](a: CC_A[D], b: D, c: T_B) extends T_A[D, (T_A[T_B, T_B],T_A[T_B, T_B])]
case class CC_C(a: CC_A[Int]) extends T_B
case class CC_D() extends T_B

val v_a: T_A[Boolean, (T_A[T_B, T_B],T_A[T_B, T_B])] = null
val v_b: Int = v_a match{
  case CC_A(_, _, CC_C(CC_A(_, _, _))) => 0 
  case CC_A(_, _, CC_D()) => 1 
  case CC_B(_, _, _) => 2 
}
}