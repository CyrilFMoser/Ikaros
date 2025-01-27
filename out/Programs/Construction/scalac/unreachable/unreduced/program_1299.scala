package Program_16 

object Test {
sealed trait T_A[A]
sealed trait T_B[B, C]
case class CC_A() extends T_A[Char]
case class CC_B(a: CC_A, b: Boolean, c: T_A[Char]) extends T_A[Char]
case class CC_C(a: T_A[Int], b: T_A[CC_B]) extends T_A[Char]

val v_a: T_A[Char] = null
val v_b: Int = v_a match{
  case CC_A() => 0 
  case CC_B(CC_A(), _, CC_B(_, _, _)) => 1 
  case CC_B(CC_A(), _, CC_C(_, _)) => 2 
  case CC_C(_, _) => 3 
}
}
// This is not matched: CC_B(CC_A(), _, CC_A())