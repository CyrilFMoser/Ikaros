package Program_22 

object Test {
sealed trait T_A[A]
sealed trait T_B[B, C]
case class CC_A[D](a: D, b: D, c: D) extends T_A[D]
case class CC_B[E](a: T_A[E], b: E, c: T_A[T_B[Byte, E]]) extends T_A[E]
case class CC_C(a: T_A[T_A[Char]], b: T_B[T_A[Char], T_A[Boolean]]) extends T_B[CC_B[(Byte,Boolean)], T_A[T_A[Char]]]
case class CC_D() extends T_B[CC_B[(Byte,Boolean)], T_A[T_A[Char]]]
case class CC_E(a: Boolean, b: (Int,CC_B[CC_D]), c: T_B[Char, CC_A[CC_C]]) extends T_B[CC_B[(Byte,Boolean)], T_A[T_A[Char]]]

val v_a: T_B[CC_B[(Byte,Boolean)], T_A[T_A[Char]]] = null
val v_b: Int = v_a match{
  case CC_C(CC_A(_, CC_A(_, _, _), CC_A(_, _, _)), _) => 0 
  case CC_C(CC_A(_, CC_B(_, _, _), CC_A(_, _, _)), _) => 1 
  case CC_C(CC_A(_, CC_A(_, _, _), CC_B(_, _, _)), _) => 2 
  case CC_C(CC_A(_, CC_B(_, _, _), CC_B(_, _, _)), _) => 3 
  case CC_C(CC_B(_, _, CC_A(_, _, _)), _) => 4 
  case CC_C(CC_B(_, _, CC_B(_, _, _)), _) => 5 
  case CC_D() => 6 
  case CC_E(true, (_,CC_B(_, _, _)), _) => 7 
  case CC_E(false, (_,CC_B(_, _, _)), _) => 8 
}
}