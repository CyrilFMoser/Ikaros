package Program_9 

object Test {
sealed trait T_A[A]
sealed trait T_B
case class CC_A(a: T_A[T_B], b: T_A[T_B]) extends T_A[T_B]
case class CC_B(a: T_A[T_B], b: CC_A) extends T_A[T_B]
case class CC_C(a: CC_B) extends T_A[CC_B]
case class CC_D(a: T_A[CC_B], b: CC_A, c: T_A[T_A[Byte]]) extends T_B
case class CC_E(a: T_A[CC_B], b: T_A[CC_B], c: T_A[T_B]) extends T_B
case class CC_F() extends T_B

val v_a: T_B = null
val v_b: Int = v_a match{
  case CC_D(CC_C(CC_B(_, _)), _, _) => 0 
  case CC_E(CC_C(CC_B(_, _)), _, CC_A(CC_A(_, _), CC_A(_, _))) => 1 
  case CC_E(CC_C(CC_B(_, _)), _, CC_A(CC_B(_, _), CC_A(_, _))) => 2 
  case CC_E(CC_C(CC_B(_, _)), _, CC_A(CC_A(_, _), CC_B(_, _))) => 3 
  case CC_E(CC_C(CC_B(_, _)), _, CC_A(CC_B(_, _), CC_B(_, _))) => 4 
  case CC_E(CC_C(CC_B(_, _)), _, CC_B(CC_A(_, _), _)) => 5 
  case CC_E(CC_C(CC_B(_, _)), _, CC_B(CC_B(_, _), _)) => 6 
}
}
// This is not matched: CC_F()