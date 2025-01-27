package Program_4 

object Test {
sealed trait T_A
sealed trait T_B[A]
case class CC_A(a: (T_B[Char],T_A), b: T_B[T_B[(Byte,Int)]]) extends T_A
case class CC_B(a: (T_A,T_A)) extends T_A
case class CC_C[B](a: Boolean, b: T_A) extends T_B[(T_A,T_B[T_A])]
case class CC_D(a: CC_C[T_B[(Char,Char)]], b: T_B[CC_A]) extends T_B[(T_A,T_B[T_A])]

val v_a: T_B[(T_A,T_B[T_A])] = null
val v_b: Int = v_a match{
  case CC_C(_, CC_A(_, _)) => 0 
  case CC_C(_, CC_B((_,_))) => 1 
}
}
// This is not matched: CC_D(_, _)