package Program_17 

object Test {
sealed trait T_A
sealed trait T_B[A, B]
case class CC_A(a: Char) extends T_A
case class CC_B(a: T_B[T_B[CC_A, CC_A], CC_A], b: CC_A, c: (CC_A,T_A)) extends T_A
case class CC_C(a: CC_A, b: T_B[(CC_A,(Char,Int)), (T_A,CC_B)], c: CC_A) extends T_A
case class CC_D[C, D](a: T_B[D, CC_C], b: Byte, c: Char) extends T_B[C, CC_C]
case class CC_E[E](a: CC_A, b: T_B[E, E], c: T_B[E, CC_C]) extends T_B[E, CC_C]

val v_a: T_A = null
val v_b: Int = v_a match{
  case CC_A(_) => 0 
  case CC_B(_, CC_A(_), (CC_A(_),CC_A(_))) => 1 
  case CC_B(_, CC_A(_), (CC_A(_),CC_B(_, _, _))) => 2 
  case CC_B(_, CC_A(_), (CC_A(_),CC_C(_, _, _))) => 3 
  case CC_C(_, _, CC_A(_)) => 4 
}
}