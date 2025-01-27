package Program_18 

object Test {
sealed trait T_A
sealed trait T_B[A, B]
case class CC_A(a: T_B[T_A, T_B[T_A, T_A]], b: T_A, c: T_A) extends T_A
case class CC_B(a: T_A, b: CC_A) extends T_A
case class CC_C() extends T_A
case class CC_D[C](a: C, b: C, c: CC_C) extends T_B[(CC_A,T_B[CC_B, CC_A]), C]
case class CC_E[D](a: CC_A, b: CC_D[D], c: T_A) extends T_B[(CC_A,T_B[CC_B, CC_A]), D]

val v_a: T_B[(CC_A,T_B[CC_B, CC_A]), Char] = null
val v_b: Int = v_a match{
  case CC_D(_, _, CC_C()) => 0 
  case CC_E(CC_A(_, _, _), CC_D(_, _, _), CC_A(_, _, _)) => 1 
  case CC_E(CC_A(_, _, _), CC_D(_, _, _), CC_B(_, _)) => 2 
  case CC_E(CC_A(_, _, _), CC_D(_, _, _), CC_C()) => 3 
}
}