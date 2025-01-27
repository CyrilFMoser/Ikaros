package Program_20 

object Test {
sealed trait T_A[A]
sealed trait T_B
case class CC_A(a: T_B, b: T_B, c: T_B) extends T_A[(T_A[T_B],T_A[T_B])]
case class CC_B(a: T_A[T_B], b: T_B, c: T_B) extends T_B
case class CC_C(a: T_B) extends T_B
case class CC_D(a: Int, b: T_A[CC_A]) extends T_B

val v_a: T_B = null
val v_b: Int = v_a match{
  case CC_B(_, _, _) => 0 
  case CC_C(CC_B(_, _, CC_B(_, _, _))) => 1 
  case CC_C(CC_B(_, _, CC_D(_, _))) => 2 
  case CC_C(CC_C(CC_B(_, _, _))) => 3 
  case CC_C(CC_C(CC_C(_))) => 4 
  case CC_C(CC_C(CC_D(_, _))) => 5 
  case CC_C(CC_D(_, _)) => 6 
  case CC_D(_, _) => 7 
}
}
// This is not matched: CC_C(CC_B(_, _, CC_C(_)))