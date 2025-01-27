package Program_15 

object Test {
sealed trait T_A[A]
case class CC_A(a: T_A[T_A[Char]]) extends T_A[T_A[Char]]
case class CC_B(a: T_A[CC_A], b: T_A[((Byte,Boolean),(Int,Boolean))], c: CC_A) extends T_A[T_A[Char]]

val v_a: T_A[T_A[Char]] = null
val v_b: Int = v_a match{
  case CC_A(CC_A(CC_A(_))) => 0 
  case CC_A(CC_B(_, _, CC_A(_))) => 1 
  case CC_B(_, _, _) => 2 
}
}
// This is not matched: CC_A(CC_A(CC_B(_, _, _)))