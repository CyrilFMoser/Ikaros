package Program_30 

object Test {
sealed trait T_A[A, B]
case class CC_A[C](a: (T_A[Char, Boolean],T_A[Int, Byte])) extends T_A[T_A[(Int,Char), T_A[Char, (Boolean,Boolean)]], C]
case class CC_B[D](a: Boolean) extends T_A[T_A[(Int,Char), T_A[Char, (Boolean,Boolean)]], D]

val v_a: T_A[T_A[(Int,Char), T_A[Char, (Boolean,Boolean)]], Byte] = null
val v_b: Int = v_a match{
  case CC_A((_,_)) => 0 
  case CC_B(_) => 1 
}
}