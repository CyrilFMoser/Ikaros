package Program_0 

object Test {
sealed trait T_A[A, B]
sealed trait T_B[C]
case class CC_A[D, E](a: T_A[E, E]) extends T_A[E, D]
case class CC_B() extends T_B[T_A[CC_A[Char, (Char,Char)], Char]]
case class CC_C(a: Boolean, b: CC_B, c: T_B[(Boolean,Boolean)]) extends T_B[T_A[CC_A[Char, (Char,Char)], Char]]
case class CC_D() extends T_B[T_A[CC_A[Char, (Char,Char)], Char]]

val v_a: T_B[T_A[CC_A[Char, (Char,Char)], Char]] = null
val v_b: Int = v_a match{
  case CC_B() => 0 
  case CC_C(_, _, _) => 1 
  case CC_D() => 2 
}
}