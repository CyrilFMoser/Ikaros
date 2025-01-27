package Program_5 

object Test {
sealed trait T_A[A]
case class CC_A(a: T_A[T_A[Byte]]) extends T_A[T_A[T_A[Byte]]]
case class CC_B(a: Int, b: T_A[Char], c: CC_A) extends T_A[CC_A]
case class CC_C() extends T_A[CC_A]

val v_a: T_A[CC_A] = null
val v_b: Int = v_a match{
  case CC_B(_, _, _) => 0 
  case CC_C() => 1 
}
}