package Program_13 

object Test {
sealed trait T_A[A]
sealed trait T_B
case class CC_A(a: T_B, b: T_A[T_B]) extends T_A[T_B]
case class CC_B(a: T_B, b: Boolean, c: T_A[T_B]) extends T_A[T_B]
case class CC_C(a: T_A[T_B]) extends T_A[T_B]
case class CC_D(a: T_B) extends T_B
case class CC_E() extends T_B
case class CC_F(a: CC_D, b: (T_A[CC_E],CC_C), c: T_B) extends T_B

val v_a: T_B = null
val v_b: Int = v_a match{
  case CC_D(_) => 0 
  case CC_E() => 1 
  case CC_F(CC_D(_), (_,CC_C(_)), CC_D(CC_E())) => 2 
  case CC_F(CC_D(_), (_,CC_C(_)), CC_D(CC_F(_, _, _))) => 3 
  case CC_F(CC_D(_), (_,CC_C(_)), CC_E()) => 4 
  case CC_F(CC_D(_), (_,CC_C(_)), CC_F(CC_D(_), (_,_), _)) => 5 
}
}
// This is not matched: CC_F(CC_D(_), (_,CC_C(_)), CC_D(CC_D(_)))