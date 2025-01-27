package Program_15 

object Test {
sealed trait T_A[A, B]
case class CC_A[E](a: (Byte,Int), b: T_A[E, E]) extends T_A[T_A[Boolean, Int], E]

val v_a: T_A[T_A[Boolean, Int], Int] = null
val v_b: Int = v_a match{
  case CC_A((0,_), _) => 0 
}
}
// This is not matched: (CC_A Boolean Char (T_A Char Boolean))