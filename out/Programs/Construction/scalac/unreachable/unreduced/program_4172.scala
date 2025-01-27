package Program_19 

object Test {
sealed trait T_A[A]
case class CC_A(a: Int, b: T_A[(Byte,Int)], c: T_A[T_A[Char]]) extends T_A[(T_A[Char],Char)]
case class CC_B(a: T_A[(CC_A,(Char,Byte))], b: T_A[T_A[CC_A]]) extends T_A[(T_A[Char],Char)]
case class CC_C[B](a: B) extends T_A[(T_A[Char],Char)]

val v_a: T_A[(T_A[Char],Char)] = null
val v_b: Int = v_a match{
  case CC_A(_, _, _) => 0 
  case CC_B(_, _) => 1 
  case CC_C(_) => 2 
}
}