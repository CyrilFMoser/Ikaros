package Program_10 

object Test {
sealed trait T_A
sealed trait T_B[A]
case class CC_A[B]() extends T_A
case class CC_B(a: T_B[T_A], b: T_A, c: CC_A[T_B[T_A]]) extends T_A
case class CC_C(a: (T_A,Char)) extends T_B[T_A]
case class CC_D(a: T_B[T_B[CC_C]]) extends T_B[T_A]
case class CC_E(a: (CC_B,T_B[CC_B]), b: T_B[CC_A[CC_D]]) extends T_B[T_A]

val v_a: T_B[T_A] = null
val v_b: Int = v_a match{
  case CC_C(_) => 0 
  case CC_D(_) => 1 
}
}
// This is not matched: CC_E((CC_B(_, _, _),_), _)