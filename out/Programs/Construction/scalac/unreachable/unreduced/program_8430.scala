package Program_15 

object Test {
sealed trait T_A[A]
sealed trait T_B[B, C]
case class CC_A(a: T_B[T_A[Byte], T_A[Char]]) extends T_A[(T_A[Byte],Boolean)]
case class CC_B(a: CC_A) extends T_A[(T_A[Byte],Boolean)]
case class CC_C(a: T_A[T_B[CC_A, CC_B]], b: Int) extends T_A[(T_A[Byte],Boolean)]

val v_a: T_A[(T_A[Byte],Boolean)] = null
val v_b: Int = v_a match{
  case CC_A(_) => 0 
  case CC_C(_, 12) => 1 
  case CC_C(_, _) => 2 
}
}
// This is not matched: CC_B(CC_A(_))