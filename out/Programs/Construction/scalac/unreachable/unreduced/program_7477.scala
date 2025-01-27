package Program_14 

object Test {
sealed trait T_A
sealed trait T_B[A]
case class CC_A(a: Char, b: T_B[T_A], c: T_B[T_B[T_A]]) extends T_A
case class CC_B(a: (T_A,T_B[CC_A])) extends T_A
case class CC_C() extends T_A
case class CC_D(a: T_B[T_A], b: CC_C, c: CC_B) extends T_B[(CC_C,Byte)]

val v_a: T_A = null
val v_b: Int = v_a match{
  case CC_A(_, _, _) => 0 
  case CC_B((CC_A(_, _, _),_)) => 1 
  case CC_B((CC_B(_),_)) => 2 
  case CC_B((CC_C(),_)) => 3 
  case CC_C() => 4 
}
}