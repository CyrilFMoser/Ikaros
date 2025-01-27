package Program_20 

object Test {
sealed trait T_A
sealed trait T_B[A, B]
case class CC_A(a: T_B[T_A, T_A], b: T_A) extends T_A
case class CC_B(a: CC_A, b: (CC_A,T_B[(Char,Char), Byte])) extends T_A
case class CC_C() extends T_A
case class CC_D[C](a: T_A) extends T_B[CC_B, C]

val v_a: CC_D[CC_B] = null
val v_b: Int = v_a match{
  case CC_D(CC_A(_, _)) => 0 
  case CC_D(CC_B(CC_A(_, _), _)) => 1 
  case CC_D(CC_C()) => 2 
}
}