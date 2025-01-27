package Program_9 

object Test {
sealed trait T_A[A]
case class CC_A(a: T_A[T_A[Char]], b: T_A[((Byte,Boolean),Byte)], c: T_A[T_A[Char]]) extends T_A[Char]
case class CC_B(a: T_A[Char], b: T_A[CC_A]) extends T_A[CC_A]
case class CC_C() extends T_A[Char]

val v_a: T_A[Char] = null
val v_b: Int = v_a match{
  case CC_A(_, _, _) => 0 
  case CC_C() => 1 
}
}