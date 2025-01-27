package Program_31 

object Test {
sealed trait T_A[A, B]
case class CC_A[C, D]() extends T_A[T_A[C, C], C]
case class CC_B[E](a: T_A[E, E], b: E) extends T_A[T_A[E, E], E]
case class CC_C(a: CC_A[Boolean, CC_A[Byte, (Byte,Char)]]) extends T_A[CC_B[T_A[Boolean, Boolean]], CC_B[CC_A[Byte, (Boolean,Int)]]]

val v_a: T_A[T_A[Int, Int], Int] = null
val v_b: Int = v_a match{
  case CC_A() => 0 
  case CC_B(_, 12) => 1 
  case CC_B(_, _) => 2 
}
}