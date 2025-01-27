package Program_6 

object Test {
sealed trait T_A
case class CC_A(a: ((Boolean,T_A),((Byte,Char),T_A))) extends T_A
case class CC_B(a: CC_A, b: T_A) extends T_A
case class CC_C(a: CC_A, b: Boolean, c: CC_B) extends T_A

val v_a: T_A = null
val v_b: Int = v_a match{
  case CC_A(((_,_),(_,_))) => 0 
  case CC_B(CC_A((_,_)), _) => 1 
  case CC_C(_, _, _) => 2 
}
}