package Program_21 

object Test {
sealed trait T_A[A]
sealed trait T_B
case class CC_A(a: T_B, b: T_A[T_B]) extends T_A[Boolean]
case class CC_B(a: Byte, b: T_B, c: (T_A[Boolean],T_B)) extends T_A[Boolean]
case class CC_C() extends T_B
case class CC_D[B](a: Byte, b: B, c: CC_A) extends T_B

val v_a: CC_B = null
val v_b: Int = v_a match{
  case CC_B(_, CC_C(), (CC_A(_, _),CC_C())) => 0 
  case CC_B(_, CC_D(0, _, _), (CC_A(_, _),CC_C())) => 1 
  case CC_B(_, CC_D(_, _, _), (CC_A(_, _),CC_C())) => 2 
  case CC_B(_, CC_C(), (CC_A(_, _),CC_D(_, _, _))) => 3 
  case CC_B(_, CC_D(0, _, _), (CC_A(_, _),CC_D(_, _, _))) => 4 
  case CC_B(_, CC_D(_, _, _), (CC_A(_, _),CC_D(_, _, _))) => 5 
  case CC_B(_, CC_C(), (CC_B(_, _, _),CC_C())) => 6 
  case CC_B(_, CC_D(0, _, _), (CC_B(_, _, _),CC_C())) => 7 
  case CC_B(_, CC_D(_, _, _), (CC_B(_, _, _),CC_C())) => 8 
  case CC_B(_, CC_C(), (CC_B(_, _, _),CC_D(_, _, _))) => 9 
  case CC_B(_, CC_D(0, _, _), (CC_B(_, _, _),CC_D(_, _, _))) => 10 
  case CC_B(_, CC_D(_, _, _), (CC_B(_, _, _),CC_D(_, _, _))) => 11 
}
}