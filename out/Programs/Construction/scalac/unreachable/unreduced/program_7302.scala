package Program_6 

object Test {
sealed trait T_A[A, B]
sealed trait T_B[C]
case class CC_A[D](a: T_B[D], b: T_A[Char, D], c: (Char,T_A[Char, Byte])) extends T_A[Char, D]
case class CC_B[E](a: E, b: T_A[Char, E], c: T_A[E, E]) extends T_A[E, Byte]
case class CC_C(a: T_A[T_B[Int], Byte], b: T_A[CC_B[Boolean], CC_A[Char]]) extends T_B[CC_B[Byte]]
case class CC_D(a: (Byte,T_A[CC_C, CC_C]), b: CC_C) extends T_B[CC_B[Byte]]
case class CC_E(a: T_B[CC_B[Byte]]) extends T_B[CC_B[Byte]]

val v_a: T_B[CC_B[Byte]] = null
val v_b: Int = v_a match{
  case CC_C(_, _) => 0 
  case CC_D((_,_), CC_C(CC_B(_, _, _), _)) => 1 
  case CC_E(CC_C(_, _)) => 2 
  case CC_E(CC_D(_, _)) => 3 
  case CC_E(CC_E(CC_C(_, _))) => 4 
  case CC_E(CC_E(CC_E(_))) => 5 
}
}
// This is not matched: CC_E(CC_E(CC_D(_, _)))