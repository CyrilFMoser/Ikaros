package Program_26 

object Test {
sealed trait T_A[A, B]
sealed trait T_B[C, D]
case class CC_A[E, F]() extends T_A[E, F]
case class CC_B[G](a: T_B[G, G]) extends T_A[G, T_A[G, G]]
case class CC_C() extends T_B[T_A[Byte, Boolean], T_A[Char, T_A[Char, Char]]]

val v_a: T_A[CC_C, T_A[CC_C, CC_C]] = null
val v_b: Int = v_a match{
  case CC_A() => 0 
  case CC_B(_) => 1 
}
}