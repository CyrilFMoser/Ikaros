package Program_20 

object Test {
sealed trait T_A[A]
sealed trait T_B
case class CC_A(a: T_A[(T_B,T_B)]) extends T_A[T_B]
case class CC_B(a: T_A[Boolean], b: T_A[(T_B,T_B)]) extends T_A[T_B]
case class CC_C(a: T_B) extends T_B
case class CC_D(a: T_A[Int], b: (CC_B,CC_B)) extends T_B
case class CC_E(a: T_A[T_A[(Char,Int)]], b: CC_A, c: CC_C) extends T_B

val v_a: T_B = null
val v_b: Int = v_a match{
  case CC_C(_) => 0 
  case CC_E(_, _, CC_C(CC_C(_))) => 1 
  case CC_E(_, _, CC_C(CC_D(_, _))) => 2 
  case CC_E(_, _, CC_C(CC_E(_, _, _))) => 3 
}
}
// This is not matched: CC_D(_, (CC_B(_, _),CC_B(_, _)))