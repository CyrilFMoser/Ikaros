package Program_27 

object Test {
sealed trait T_A
sealed trait T_B[A, B]
case class CC_A(a: T_B[T_A, Byte], b: T_A) extends T_A
case class CC_B(a: Byte, b: T_A) extends T_A
case class CC_C(a: (T_A,Byte), b: T_A) extends T_A
case class CC_D[C, D]() extends T_B[C, CC_C]
case class CC_E[E]() extends T_B[E, CC_C]

val v_a: CC_B = null
val v_b: Int = v_a match{
  case CC_B(_, CC_A(_, _)) => 0 
  case CC_B(_, CC_B(_, _)) => 1 
  case CC_B(_, CC_C((_,_), CC_B(_, _))) => 2 
  case CC_B(_, CC_C((_,_), CC_C(_, _))) => 3 
}
}
// This is not matched: CC_B(_, CC_C((_,_), CC_A(_, _)))