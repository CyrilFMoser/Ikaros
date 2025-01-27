package Program_20 

object Test {
sealed trait T_A
sealed trait T_B[A, B]
case class CC_A() extends T_A
case class CC_B(a: T_B[T_B[(Char,Int), CC_A], T_B[T_A, (Boolean,Char)]], b: T_A) extends T_A
case class CC_C[C](a: T_A) extends T_B[C, T_B[C, CC_B]]

val v_a: T_B[Byte, T_B[Byte, CC_B]] = null
val v_b: Int = v_a match{
  case CC_C(CC_A()) => 0 
  case CC_C(CC_B(_, CC_A())) => 1 
  case CC_C(CC_B(_, CC_B(_, _))) => 2 
}
}