package Program_12 

object Test {
sealed trait T_A[A, B]
sealed trait T_B[C]
case class CC_A[D](a: T_A[Char, D]) extends T_A[Char, D]
case class CC_B() extends T_A[Char, T_A[(Boolean,Int), Char]]
case class CC_C(a: T_A[Boolean, Char], b: Byte) extends T_A[Char, T_A[(Boolean,Int), Char]]

val v_a: T_A[Char, T_A[(Boolean,Int), Char]] = null
val v_b: Int = v_a match{
  case CC_A(CC_A(CC_A(_))) => 0 
  case CC_A(CC_A(CC_B())) => 1 
  case CC_A(CC_A(CC_C(_, _))) => 2 
  case CC_A(CC_B()) => 3 
  case CC_B() => 4 
  case CC_C(_, _) => 5 
}
}
// This is not matched: CC_A(CC_C(_, _))