package Program_18 

object Test {
sealed trait T_A[A]
sealed trait T_B
case class CC_A() extends T_A[T_B]
case class CC_B(a: (T_A[T_B],T_A[CC_A]), b: T_B, c: Char) extends T_A[T_B]
case class CC_C() extends T_A[T_B]
case class CC_D(a: T_B, b: CC_A) extends T_B
case class CC_E(a: T_A[CC_C]) extends T_B
case class CC_F(a: T_A[(CC_D,Int)], b: Byte) extends T_B

val v_a: T_A[T_B] = null
val v_b: Int = v_a match{
  case CC_A() => 0 
  case CC_B((CC_A(),_), _, _) => 1 
  case CC_B((CC_B(_, _, _),_), _, _) => 2 
  case CC_B((CC_C(),_), _, _) => 3 
}
}
// This is not matched: CC_C()