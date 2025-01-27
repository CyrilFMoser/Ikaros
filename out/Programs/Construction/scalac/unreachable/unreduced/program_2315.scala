package Program_8 

object Test {
sealed trait T_A[A, B]
sealed trait T_B[C, D]
case class CC_A[E, F]() extends T_A[E, F]
case class CC_B(a: T_B[T_B[Byte, Int], Byte], b: T_B[T_A[Byte, Char], CC_A[Boolean, Int]], c: CC_A[Char, T_A[Char, Int]]) extends T_A[Char, T_B[CC_A[Char, Boolean], T_A[Boolean, Boolean]]]
case class CC_C(a: Int) extends T_A[Char, T_B[CC_A[Char, Boolean], T_A[Boolean, Boolean]]]
case class CC_D[G](a: T_A[G, G], b: T_B[G, G]) extends T_B[G, CC_B]

val v_a: T_A[Char, T_B[CC_A[Char, Boolean], T_A[Boolean, Boolean]]] = null
val v_b: Int = v_a match{
  case CC_B(_, _, CC_A()) => 0 
  case CC_C(_) => 1 
}
}
// This is not matched: CC_A()