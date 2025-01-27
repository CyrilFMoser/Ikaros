package Program_15 

object Test {
sealed trait T_A[A, B]
sealed trait T_B
case class CC_A[C](a: T_A[C, Byte]) extends T_A[C, Byte]
case class CC_B(a: T_A[CC_A[(Int,Boolean)], T_A[T_B, Byte]], b: T_A[CC_A[(Int,Boolean)], Byte]) extends T_A[CC_A[CC_A[T_B]], Byte]

val v_a: T_A[CC_A[CC_A[T_B]], Byte] = null
val v_b: Int = v_a match{
  case CC_A(CC_A(CC_A(_))) => 0 
  case CC_A(CC_B(_, _)) => 1 
  case CC_B(_, _) => 2 
}
}
// This is not matched: CC_A(CC_A(CC_B(_, _)))