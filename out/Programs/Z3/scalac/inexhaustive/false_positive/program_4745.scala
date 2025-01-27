package Program_15 

object Test {
sealed trait T_A[A, B]
case class CC_A() extends T_A[T_A[Char, Byte], T_A[Int, Char]]
case class CC_B(a: T_A[CC_A, Char], b: Int) extends T_A[T_A[Char, Byte], T_A[Int, Char]]

val v_a: T_A[T_A[Char, Byte], T_A[Int, Char]] = null
val v_b: Int = v_a match{
  case CC_A() => 0 
  case CC_B(_, 12) => 1 
}
}
// This is not matched: (CC_B Wildcard Wildcard Wildcard (T_A (T_A Char Byte) (T_A Int Char)))