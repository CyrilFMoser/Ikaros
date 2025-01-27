package Program_16 

object Test {
sealed trait T_A
sealed trait T_B[A, B]
case class CC_A(a: (T_A,Char), b: T_B[Char, T_A]) extends T_A
case class CC_B(a: CC_A, b: T_A) extends T_A
case class CC_C[C](a: (T_A,Char), b: T_B[C, CC_A]) extends T_B[C, CC_A]
case class CC_D(a: T_B[Boolean, CC_A], b: T_B[T_A, T_B[T_A, CC_B]]) extends T_B[Boolean, CC_A]

val v_a: T_B[Boolean, CC_A] = null
val v_b: Int = v_a match{
  case CC_C(_, CC_C(_, _)) => 0 
  case CC_D(_, _) => 1 
}
}
// This is not matched: CC_C(_, CC_D(_, _))