package Program_4 

object Test {
sealed trait T_A[A, B]
case class CC_A() extends T_A[T_A[T_A[Char, Boolean], T_A[Char, Int]], T_A[T_A[Char, Char], T_A[Char, Int]]]
case class CC_B(a: CC_A) extends T_A[T_A[T_A[Char, Boolean], T_A[Char, Int]], T_A[T_A[Char, Char], T_A[Char, Int]]]
case class CC_C(a: T_A[CC_A, CC_B], b: CC_B, c: CC_B) extends T_A[T_A[T_A[Char, Boolean], T_A[Char, Int]], T_A[T_A[Char, Char], T_A[Char, Int]]]

val v_a: T_A[T_A[T_A[Char, Boolean], T_A[Char, Int]], T_A[T_A[Char, Char], T_A[Char, Int]]] = null
val v_b: Int = v_a match{
  case CC_A() => 0 
  case CC_B(CC_A()) => 1 
  case CC_C(_, _, CC_B(_)) => 2 
}
}