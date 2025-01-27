package Program_14 

object Test {
sealed trait T_A[A, B]
sealed trait T_B[C]
case class CC_B[E](a: T_A[E, E], b: Char) extends T_A[T_B[E], E]

val v_a: T_A[T_B[Int], Int] = null
val v_b: Int = v_a match{
  case CC_B(_, 'x') => 0 
}
}
// This is not matched: (CC_A (CC_A Byte Char Boolean Boolean)
//      Int
//      Wildcard
//      (T_A (CC_A Byte Char Boolean Boolean) Int))