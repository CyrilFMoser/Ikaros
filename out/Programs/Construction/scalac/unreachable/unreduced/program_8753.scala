package Program_10 

object Test {
sealed trait T_A[A, B]
sealed trait T_B
case class CC_A[C]() extends T_A[T_B, C]
case class CC_B(a: (CC_A[T_B],T_A[T_B, T_B]), b: T_A[T_B, Int]) extends T_A[T_B, T_B]
case class CC_C[D](a: T_B, b: T_A[D, D]) extends T_A[T_B, D]
case class CC_D(a: Int) extends T_B
case class CC_E() extends T_B
case class CC_F(a: CC_C[CC_C[T_B]], b: Int) extends T_B

val v_a: T_B = null
val v_b: Int = v_a match{
  case CC_D(12) => 0 
  case CC_D(_) => 1 
  case CC_E() => 2 
  case CC_F(CC_C(_, _), 12) => 3 
  case CC_F(CC_C(_, _), _) => 4 
}
}