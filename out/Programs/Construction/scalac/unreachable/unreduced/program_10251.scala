package Program_5 

object Test {
sealed trait T_A[A]
case class CC_A() extends T_A[Char]
case class CC_B[B](a: CC_A) extends T_A[Char]
case class CC_C(a: T_A[CC_A], b: CC_B[T_A[CC_A]], c: T_A[CC_B[CC_A]]) extends T_A[Char]

val v_a: T_A[Char] = null
val v_b: Int = v_a match{
  case CC_A() => 0 
  case CC_B(CC_A()) => 1 
  case CC_C(_, _, _) => 2 
}
}