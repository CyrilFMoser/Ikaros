package Program_12 

object Test {
sealed trait T_A[A, B]
case class CC_A() extends T_A[T_A[T_A[Char, Char], T_A[Char, Char]], T_A[T_A[Char, Int], T_A[Int, Int]]]
case class CC_B(a: T_A[CC_A, T_A[Char, CC_A]], b: T_A[CC_A, CC_A]) extends T_A[T_A[T_A[Char, Char], T_A[Char, Char]], T_A[T_A[Char, Int], T_A[Int, Int]]]
case class CC_C(a: CC_A, b: CC_A, c: CC_B) extends T_A[T_A[T_A[Char, Char], T_A[Char, Char]], T_A[T_A[Char, Int], T_A[Int, Int]]]

val v_a: T_A[T_A[T_A[Char, Char], T_A[Char, Char]], T_A[T_A[Char, Int], T_A[Int, Int]]] = null
val v_b: Int = v_a match{
  case CC_A() => 0 
  case CC_B(_, _) => 1 
  case CC_C(_, _, CC_B(_, _)) => 2 
}
}