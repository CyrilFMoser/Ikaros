package Program_12 

object Test {
sealed trait T_A
sealed trait T_B[A]
case class CC_A(a: (T_B[(Char,Byte)],Char), b: T_B[T_B[T_A]]) extends T_A
case class CC_B() extends T_B[CC_A]
case class CC_C(a: T_B[Char], b: T_A, c: (T_A,T_B[CC_A])) extends T_B[CC_A]
case class CC_D() extends T_B[CC_A]

val v_a: T_B[CC_A] = null
val v_b: Int = v_a match{
  case CC_B() => 0 
  case CC_C(_, _, (CC_A(_, _),CC_C(_, _, _))) => 1 
  case CC_C(_, _, (CC_A(_, _),CC_D())) => 2 
  case CC_D() => 3 
}
}
// This is not matched: CC_C(_, _, (CC_A(_, _),CC_B()))