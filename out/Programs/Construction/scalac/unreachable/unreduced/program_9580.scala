package Program_0 

object Test {
sealed trait T_A
sealed trait T_B[A, B]
case class CC_A(a: T_B[T_B[(Boolean,Byte), T_A], T_B[Boolean, T_A]]) extends T_A
case class CC_B(a: (T_A,((Char,Int),CC_A))) extends T_A
case class CC_C(a: Byte, b: T_B[T_B[CC_A, CC_B], CC_B], c: T_A) extends T_A
case class CC_D(a: T_A, b: CC_C) extends T_B[CC_A, CC_C]
case class CC_E(a: Byte, b: T_B[CC_A, CC_C]) extends T_B[CC_A, CC_C]

val v_a: T_A = null
val v_b: Int = v_a match{
  case CC_A(_) => 0 
  case CC_B((CC_A(_),(_,_))) => 1 
  case CC_B((CC_B(_),(_,_))) => 2 
  case CC_B((CC_C(_, _, _),(_,_))) => 3 
  case CC_C(_, _, CC_A(_)) => 4 
  case CC_C(_, _, CC_B((_,_))) => 5 
  case CC_C(_, _, CC_C(_, _, CC_A(_))) => 6 
  case CC_C(_, _, CC_C(_, _, CC_B(_))) => 7 
  case CC_C(_, _, CC_C(_, _, CC_C(_, _, _))) => 8 
}
}