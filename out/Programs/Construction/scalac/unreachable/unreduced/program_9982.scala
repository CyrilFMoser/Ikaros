package Program_28 

object Test {
sealed trait T_A[A]
case class CC_A[B](a: T_A[B]) extends T_A[T_A[(Boolean,Boolean)]]
case class CC_B(a: ((Byte,Char),CC_A[Char]), b: T_A[Int]) extends T_A[T_A[(Boolean,Boolean)]]
case class CC_C() extends T_A[T_A[(Boolean,Boolean)]]

val v_a: T_A[T_A[(Boolean,Boolean)]] = null
val v_b: Int = v_a match{
  case CC_A(_) => 0 
  case CC_B(((_,_),CC_A(_)), _) => 1 
  case CC_C() => 2 
}
}