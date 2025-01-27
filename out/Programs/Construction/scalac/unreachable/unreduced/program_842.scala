package Program_17 

object Test {
sealed trait T_A
sealed trait T_B[A]
case class CC_A(a: T_B[T_B[T_A]], b: T_A, c: T_B[T_A]) extends T_A
case class CC_B(a: (CC_A,T_B[CC_A]), b: Int, c: T_B[CC_A]) extends T_A
case class CC_C() extends T_A
case class CC_D(a: CC_B, b: CC_C, c: Char) extends T_B[Byte]

val v_a: T_A = null
val v_b: Int = v_a match{
  case CC_A(_, _, _) => 0 
  case CC_C() => 1 
}
}
// This is not matched: CC_B((_,_), _, _)