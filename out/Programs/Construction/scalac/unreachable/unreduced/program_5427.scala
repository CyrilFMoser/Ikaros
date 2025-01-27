package Program_25 

object Test {
sealed trait T_A
sealed trait T_B[A, B]
case class CC_A(a: T_B[T_B[T_A, T_A], T_B[T_A, T_A]], b: T_A, c: T_B[T_B[T_A, T_A], T_B[Boolean, (Byte,Byte)]]) extends T_A
case class CC_B() extends T_A
case class CC_C(a: Int) extends T_A
case class CC_D[C](a: CC_C, b: C, c: T_B[C, CC_A]) extends T_B[C, CC_A]

val v_a: T_A = null
val v_b: Int = v_a match{
  case CC_A(_, CC_A(_, _, _), _) => 0 
  case CC_A(_, CC_B(), _) => 1 
  case CC_A(_, CC_C(_), _) => 2 
  case CC_B() => 3 
}
}
// This is not matched: CC_C(_)