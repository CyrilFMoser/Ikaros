package Program_2 

object Test {
sealed trait T_A[A]
sealed trait T_B
case class CC_A(a: (T_B,T_A[Char]), b: T_A[Char]) extends T_A[T_B]
case class CC_B(a: Boolean, b: T_B) extends T_A[T_B]
case class CC_C(a: Boolean, b: T_B, c: CC_B) extends T_A[T_B]
case class CC_D(a: CC_B, b: CC_A, c: CC_C) extends T_B

val v_a: T_A[T_B] = null
val v_b: Int = v_a match{
  case CC_A((CC_D(_, _, _),_), _) => 0 
  case CC_B(true, CC_D(_, CC_A(_, _), CC_C(_, _, _))) => 1 
  case CC_B(false, CC_D(_, CC_A(_, _), CC_C(_, _, _))) => 2 
  case CC_C(_, CC_D(_, _, _), CC_B(_, CC_D(_, _, _))) => 3 
}
}