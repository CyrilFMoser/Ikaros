package Program_6 

object Test {
sealed trait T_A
sealed trait T_B[A, B]
case class CC_A(a: T_A, b: T_B[T_B[Byte, (Char,Char)], T_B[T_A, T_A]]) extends T_A
case class CC_B() extends T_A
case class CC_C[C](a: T_B[C, CC_B], b: ((CC_B,(Char,Int)),Boolean), c: T_B[C, C]) extends T_B[C, CC_B]
case class CC_D[D]() extends T_B[D, CC_B]
case class CC_E[E](a: Char) extends T_B[E, CC_B]

val v_a: T_B[Byte, CC_B] = null
val v_b: Int = v_a match{
  case CC_C(_, ((_,_),_), _) => 0 
  case CC_D() => 1 
  case CC_E(_) => 2 
}
}