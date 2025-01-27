package Program_13 

object Test {
sealed trait T_A[A]
case class CC_A(a: T_A[T_A[Int]], b: T_A[T_A[Byte]], c: T_A[(Boolean,Byte)]) extends T_A[(((Int,Boolean),Char),T_A[Char])]
case class CC_B[B](a: B) extends T_A[(((Int,Boolean),Char),T_A[Char])]

val v_a: T_A[(((Int,Boolean),Char),T_A[Char])] = null
val v_b: Int = v_a match{
  case CC_A(_, _, _) => 0 
  case CC_B(_) => 1 
}
}