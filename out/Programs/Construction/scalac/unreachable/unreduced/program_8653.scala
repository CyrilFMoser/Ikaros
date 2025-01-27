package Program_6 

object Test {
sealed trait T_A
sealed trait T_B[A, B]
case class CC_A[C](a: C, b: T_A, c: C) extends T_A
case class CC_B() extends T_B[T_B[T_B[Boolean, Int], T_A], T_A]
case class CC_C(a: Int, b: T_A, c: T_B[T_A, Int]) extends T_B[T_B[T_B[Boolean, Int], T_A], T_A]
case class CC_D() extends T_B[T_B[T_B[Boolean, Int], T_A], T_A]

val v_a: T_B[T_B[T_B[Boolean, Int], T_A], T_A] = null
val v_b: Int = v_a match{
  case CC_B() => 0 
  case CC_C(_, CC_A(_, CC_A(_, _, _), _), _) => 1 
}
}
// This is not matched: CC_D()