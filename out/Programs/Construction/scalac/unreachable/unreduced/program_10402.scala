package Program_5 

object Test {
sealed trait T_A
sealed trait T_B[A, B]
case class CC_A(a: T_B[T_B[T_A, T_A], T_A], b: (T_A,T_B[T_A, T_A]), c: T_B[((Byte,Boolean),T_A), Char]) extends T_A
case class CC_B() extends T_A
case class CC_C[C](a: C) extends T_B[CC_A, C]
case class CC_D(a: CC_B, b: (Char,T_B[CC_A, T_A]), c: T_B[T_B[CC_A, (Byte,Char)], T_B[CC_A, CC_A]]) extends T_B[CC_A, (T_B[CC_A, T_A],Byte)]
case class CC_E[D](a: (T_A,T_B[CC_A, CC_A]), b: T_B[D, T_B[CC_A, D]]) extends T_B[CC_A, D]

val v_a: T_A = null
val v_b: Int = v_a match{
  case CC_A(_, (CC_A(_, _, _),_), _) => 0 
  case CC_A(_, (CC_B(),_), _) => 1 
  case CC_B() => 2 
}
}