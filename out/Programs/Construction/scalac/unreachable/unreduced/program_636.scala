package Program_3 

object Test {
sealed trait T_A[A]
case class CC_A() extends T_A[((Char,Int),Byte)]
case class CC_B(a: T_A[(CC_A,CC_A)]) extends T_A[((Char,Int),Byte)]
case class CC_C(a: T_A[Char], b: T_A[CC_A], c: CC_A) extends T_A[CC_A]

val v_a: T_A[((Char,Int),Byte)] = null
val v_b: Int = v_a match{
  case CC_A() => 0 
  case CC_B(_) => 1 
}
}