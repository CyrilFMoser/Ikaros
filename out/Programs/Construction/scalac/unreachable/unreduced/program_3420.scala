package Program_9 

object Test {
sealed trait T_A[A, B]
case class CC_A() extends T_A[(T_A[Char, Int],T_A[(Int,Char), Byte]), Int]
case class CC_B(a: T_A[T_A[CC_A, CC_A], CC_A], b: Byte, c: CC_A) extends T_A[(T_A[Char, Int],T_A[(Int,Char), Byte]), Int]
case class CC_C[C](a: T_A[Boolean, C], b: T_A[C, C], c: CC_B) extends T_A[Boolean, C]

val v_a: T_A[(T_A[Char, Int],T_A[(Int,Char), Byte]), Int] = null
val v_b: Int = v_a match{
  case CC_A() => 0 
  case CC_B(_, _, CC_A()) => 1 
}
}