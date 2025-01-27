package Program_6 

object Test {
sealed trait T_A
sealed trait T_B[A, B]
case class CC_A(a: T_B[Char, (T_A,T_A)], b: T_B[T_B[(Int,Char), T_A], T_A], c: T_B[T_B[T_A, T_A], T_B[T_A, T_A]]) extends T_A
case class CC_B(a: Char) extends T_A
case class CC_C() extends T_B[CC_A, T_A]
case class CC_D(a: (CC_A,T_B[CC_A, T_A]), b: T_B[CC_A, T_A]) extends T_B[CC_A, T_A]
case class CC_E(a: CC_B, b: T_B[CC_A, T_A], c: T_B[CC_A, T_A]) extends T_B[CC_A, T_A]

val v_a: T_A = null
val v_b: Int = v_a match{
  case CC_A(_, _, _) => 0 
  case CC_B(_) => 1 
}
}