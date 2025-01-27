package Program_20 

object Test {
sealed trait T_A
sealed trait T_B[A, B]
case class CC_A(a: (T_B[(Byte,Char), (Char,Byte)],T_B[Boolean, (Char,Char)]), b: Char, c: T_A) extends T_A
case class CC_B(a: CC_A, b: (T_A,T_A)) extends T_A
case class CC_C[C](a: CC_B, b: T_A) extends T_B[Char, C]

val v_a: CC_C[CC_A] = null
val v_b: Int = v_a match{
  case CC_C(_, CC_A((_,_), _, CC_A(_, _, _))) => 0 
  case CC_C(_, CC_A((_,_), _, CC_B(_, _))) => 1 
  case CC_C(_, CC_B(_, _)) => 2 
}
}