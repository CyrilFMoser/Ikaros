package Program_4 

object Test {
sealed trait T_A[A]
case class CC_A(a: Char) extends T_A[((Int,Char),T_A[Byte])]
case class CC_B[B](a: T_A[B], b: B) extends T_A[((Int,Char),T_A[Byte])]
case class CC_C(a: T_A[CC_A], b: CC_A) extends T_A[((Int,Char),T_A[Byte])]

val v_a: T_A[((Int,Char),T_A[Byte])] = null
val v_b: Int = v_a match{
  case CC_B(_, _) => 0 
  case CC_C(_, CC_A(_)) => 1 
}
}
// This is not matched: CC_A(_)