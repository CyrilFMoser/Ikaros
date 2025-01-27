package Program_9 

object Test {
sealed trait T_A[A]
case class CC_A[B](a: Byte) extends T_A[(T_A[Boolean],(Boolean,Char))]
case class CC_B(a: T_A[T_A[Byte]], b: T_A[CC_A[(Byte,Int)]], c: CC_A[CC_A[Boolean]]) extends T_A[(T_A[Boolean],(Boolean,Char))]

val v_a: T_A[(T_A[Boolean],(Boolean,Char))] = null
val v_b: Int = v_a match{
  case CC_A(_) => 0 
  case CC_B(_, _, _) => 1 
}
}