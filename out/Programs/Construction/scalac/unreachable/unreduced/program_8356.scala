package Program_6 

object Test {
sealed trait T_A
sealed trait T_B[A]
case class CC_A(a: Byte, b: T_A, c: (T_B[T_A],T_A)) extends T_A
case class CC_B(a: Char, b: T_A) extends T_A
case class CC_C(a: T_A) extends T_B[(T_B[CC_A],(T_A,CC_B))]
case class CC_D(a: T_A, b: CC_C) extends T_B[(T_B[CC_A],(T_A,CC_B))]

val v_a: T_A = null
val v_b: Int = v_a match{
  case CC_A(_, CC_A(_, CC_A(_, _, _), _), (_,CC_A(_, _, _))) => 0 
  case CC_A(_, CC_A(_, CC_B(_, _), _), (_,CC_A(_, _, _))) => 1 
  case CC_A(_, CC_B(_, CC_A(_, _, _)), (_,CC_A(_, _, _))) => 2 
  case CC_A(_, CC_B(_, CC_B(_, _)), (_,CC_A(_, _, _))) => 3 
  case CC_A(_, CC_A(_, CC_A(_, _, _), _), (_,CC_B(_, _))) => 4 
  case CC_A(_, CC_B(_, CC_A(_, _, _)), (_,CC_B(_, _))) => 5 
  case CC_A(_, CC_B(_, CC_B(_, _)), (_,CC_B(_, _))) => 6 
  case CC_B(_, CC_A(_, _, (_,_))) => 7 
  case CC_B(_, CC_B(_, CC_A(_, _, _))) => 8 
  case CC_B(_, CC_B(_, CC_B(_, _))) => 9 
}
}
// This is not matched: CC_A(_, CC_A(_, CC_B(_, _), _), (_,CC_B(_, _)))