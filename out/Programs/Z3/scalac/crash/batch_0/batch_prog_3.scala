package Program_3 

object Test {
sealed trait T_A[A]
sealed trait T_B
case class CC_A[B](a: B, b: B) extends T_A[B]
case class CC_B(a: T_A[T_B], b: (T_B,Int)) extends T_A[CC_A[(Byte,Char)]]
case class CC_C() extends T_A[CC_B]

val v_a: T_A[Byte] = null
val v_b: Int = v_a match{
  case CC_A(0, 0) => 0 
}
}
// This is not matched: Pattern match is empty without constants