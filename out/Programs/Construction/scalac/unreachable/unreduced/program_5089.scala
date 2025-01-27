package Program_18 

object Test {
sealed trait T_A
sealed trait T_B[A, B]
case class CC_A(a: Byte, b: (T_B[Byte, T_A],Byte)) extends T_A
case class CC_B(a: T_B[CC_A, T_B[CC_A, T_A]], b: T_B[Boolean, CC_A], c: CC_A) extends T_A
case class CC_C[C](a: T_B[Byte, C]) extends T_B[Byte, C]
case class CC_D[D](a: T_A, b: ((T_A,(Char,Byte)),Int)) extends T_B[D, T_B[D, D]]

val v_a: CC_D[Char] = null
val v_b: Int = v_a match{
  case CC_D(CC_A(_, _), ((_,_),_)) => 0 
  case CC_D(CC_B(_, _, _), ((_,_),_)) => 1 
}
}