package Program_4 

object Test {
sealed trait T_A
sealed trait T_B[A, B]
case class CC_A(a: T_B[T_A, T_B[T_A, T_A]], b: T_B[T_B[T_A, T_A], T_B[T_A, T_A]], c: T_A) extends T_A
case class CC_B(a: T_A, b: Byte) extends T_A
case class CC_C() extends T_A
case class CC_D[C]() extends T_B[C, T_B[C, C]]
case class CC_E[D](a: CC_A) extends T_B[T_B[T_B[CC_B, CC_B], T_B[T_B[CC_B, CC_B], T_B[CC_B, CC_B]]], T_B[T_B[T_B[CC_B, CC_B], T_B[T_B[CC_B, CC_B], T_B[CC_B, CC_B]]], T_B[T_B[CC_B, CC_B], T_B[T_B[CC_B, CC_B], T_B[CC_B, CC_B]]]]]
case class CC_F[E]() extends T_B[E, T_B[E, E]]

val v_a: T_A = null
val v_b: Int = v_a match{
  case CC_A(_, _, _) => 0 
  case CC_B(_, _) => 1 
  case CC_C() => 2 
}
}