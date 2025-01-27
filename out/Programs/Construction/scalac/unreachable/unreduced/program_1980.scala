package Program_6 

object Test {
sealed trait T_A
sealed trait T_B[A, B]
case class CC_A(a: T_B[T_A, T_A]) extends T_A
case class CC_B(a: Boolean, b: Byte) extends T_A
case class CC_C(a: Int, b: T_A, c: (Byte,CC_B)) extends T_A
case class CC_D(a: T_A, b: Int, c: T_A) extends T_B[T_A, (CC_B,(CC_A,Boolean))]

val v_a: CC_C = null
val v_b: Int = v_a match{
  case CC_C(_, CC_A(_), (0,CC_B(_, _))) => 0 
  case CC_C(_, CC_B(_, 0), (0,CC_B(_, _))) => 1 
  case CC_C(_, CC_B(_, _), (0,CC_B(_, _))) => 2 
  case CC_C(_, CC_C(_, _, _), (0,CC_B(_, _))) => 3 
  case CC_C(_, CC_B(_, 0), (_,CC_B(_, _))) => 4 
  case CC_C(_, CC_B(_, _), (_,CC_B(_, _))) => 5 
  case CC_C(_, CC_C(_, _, _), (_,CC_B(_, _))) => 6 
}
}
// This is not matched: CC_C(_, CC_A(_), (_,CC_B(_, _)))