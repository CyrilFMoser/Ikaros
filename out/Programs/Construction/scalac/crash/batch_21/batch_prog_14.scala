package Program_14 

object Test {
sealed trait T_A
case class CC_A(a: T_A, b: (Char,T_A), c: T_A) extends T_A
case class CC_B(a: Byte, b: T_A) extends T_A

val v_a: T_A = null
val v_b: Int = v_a match{
  case CC_A(_, (_,CC_A(_, _, _)), CC_A(_, _, CC_A(_, _, _))) => 0 
  case CC_A(_, (_,CC_A(_, _, _)), CC_A(_, _, CC_B(_, _))) => 1 
  case CC_A(_, (_,CC_A(_, _, _)), CC_B(_, CC_A(_, _, _))) => 2 
  case CC_A(_, (_,CC_A(_, _, _)), CC_B(_, CC_B(_, _))) => 3 
  case CC_A(_, (_,CC_B(_, _)), CC_A(_, _, CC_A(_, _, _))) => 4 
  case CC_A(_, (_,CC_B(_, _)), CC_A(_, _, CC_B(_, _))) => 5 
  case CC_A(_, (_,CC_B(_, _)), CC_B(_, CC_A(_, _, _))) => 6 
  case CC_A(_, (_,CC_B(_, _)), CC_B(_, CC_B(_, _))) => 7 
  case CC_B(0, CC_A(_, _, CC_A(_, _, _))) => 8 
  case CC_B(0, CC_A(_, _, CC_B(_, _))) => 9 
  case CC_B(0, CC_B(_, _)) => 10 
  case CC_B(_, CC_A(_, _, CC_A(_, _, _))) => 11 
  case CC_B(_, CC_A(_, _, CC_B(_, _))) => 12 
  case CC_B(_, CC_B(_, _)) => 13 
}
}