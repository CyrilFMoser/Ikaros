package Program_26 

object Test {
sealed trait T_A
sealed trait T_B[A]
case class CC_A(a: T_A, b: T_A) extends T_A
case class CC_B(a: T_A, b: T_B[(Boolean,(Byte,Char))], c: ((CC_A,(Byte,Boolean)),Char)) extends T_A
case class CC_C(a: CC_A, b: T_B[T_B[T_A]], c: Char) extends T_B[T_B[T_A]]

val v_a: T_A = null
val v_b: Int = v_a match{
  case CC_A(CC_A(CC_A(_, _), CC_A(_, _)), _) => 0 
  case CC_A(CC_A(CC_B(_, _, _), CC_A(_, _)), _) => 1 
  case CC_A(CC_A(CC_A(_, _), CC_B(_, _, _)), _) => 2 
  case CC_A(CC_A(CC_B(_, _, _), CC_B(_, _, _)), _) => 3 
  case CC_A(CC_B(CC_A(_, _), _, (_,_)), _) => 4 
  case CC_A(CC_B(CC_B(_, _, _), _, (_,_)), _) => 5 
  case CC_B(CC_A(_, _), _, ((_,_),_)) => 6 
  case CC_B(CC_B(_, _, _), _, ((_,_),_)) => 7 
}
}