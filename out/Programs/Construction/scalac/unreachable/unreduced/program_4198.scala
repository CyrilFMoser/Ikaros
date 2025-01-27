package Program_8 

object Test {
sealed trait T_A
sealed trait T_B[A, B]
case class CC_A() extends T_A
case class CC_B(a: T_B[CC_A, CC_A], b: Byte, c: Int) extends T_B[T_B[T_B[T_A, T_A], CC_A], (T_A,T_B[Char, (Byte,Char)])]
case class CC_C() extends T_B[T_B[T_B[T_A, T_A], CC_A], (T_A,T_B[Char, (Byte,Char)])]

val v_a: T_B[T_B[T_B[T_A, T_A], CC_A], (T_A,T_B[Char, (Byte,Char)])] = null
val v_b: Int = v_a match{
  case CC_B(_, _, 12) => 0 
  case CC_B(_, _, _) => 1 
  case CC_C() => 2 
}
}