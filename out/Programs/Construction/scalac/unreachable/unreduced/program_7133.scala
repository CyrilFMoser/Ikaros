package Program_24 

object Test {
sealed trait T_A[A, B]
case class CC_A[C]() extends T_A[C, Char]
case class CC_B[D](a: T_A[D, Char]) extends T_A[D, Char]
case class CC_C[E](a: Boolean, b: T_A[E, E], c: Char) extends T_A[E, Char]

val v_a: T_A[Byte, Char] = null
val v_b: Int = v_a match{
  case CC_A() => 0 
  case CC_B(_) => 1 
  case CC_C(_, _, _) => 2 
}
}