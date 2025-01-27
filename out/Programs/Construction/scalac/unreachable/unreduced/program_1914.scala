package Program_2 

object Test {
sealed trait T_A
sealed trait T_B[A, B]
case class CC_A(a: T_B[T_B[T_A, T_A], T_B[T_A, (Boolean,Boolean)]]) extends T_A
case class CC_B() extends T_A
case class CC_C(a: (CC_B,CC_A), b: T_B[Boolean, T_B[CC_B, T_A]], c: T_A) extends T_A
case class CC_D() extends T_B[T_B[T_A, Int], T_A]
case class CC_E(a: (T_B[CC_D, CC_B],(CC_C,CC_C)), b: Int, c: (T_A,CC_B)) extends T_B[T_B[T_A, Int], T_A]
case class CC_F(a: T_B[T_B[T_A, Int], T_A], b: T_B[T_B[T_A, Int], T_A]) extends T_B[T_B[T_A, Int], T_A]

val v_a: T_A = null
val v_b: Int = v_a match{
  case CC_A(_) => 0 
  case CC_B() => 1 
  case CC_C((CC_B(),CC_A(_)), _, CC_A(_)) => 2 
  case CC_C((CC_B(),CC_A(_)), _, CC_B()) => 3 
  case CC_C((CC_B(),CC_A(_)), _, CC_C(_, _, _)) => 4 
}
}