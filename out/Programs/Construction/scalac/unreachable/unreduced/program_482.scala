package Program_27 

object Test {
sealed trait T_A
sealed trait T_B[A, B]
case class CC_A() extends T_A
case class CC_B(a: ((T_A,Char),CC_A), b: T_B[CC_A, Byte], c: CC_A) extends T_A
case class CC_C() extends T_A
case class CC_D(a: (CC_C,(Boolean,T_A)), b: CC_B, c: CC_C) extends T_B[T_B[CC_B, T_B[CC_A, CC_C]], T_B[CC_C, CC_A]]

val v_a: T_A = null
val v_b: Int = v_a match{
  case CC_A() => 0 
  case CC_B(_, _, CC_A()) => 1 
  case CC_C() => 2 
}
}