package Program_14 

object Test {
sealed trait T_A[A]
sealed trait T_B[B]
case class CC_A[C](a: Byte, b: T_B[T_B[C]], c: Boolean) extends T_A[T_B[(Int,Byte)]]
case class CC_B[D](a: T_B[D]) extends T_B[D]
case class CC_C[E](a: (T_B[(Boolean,Int)],CC_B[Int]), b: ((Byte,Char),T_A[Int]), c: E) extends T_B[E]

val v_a: T_B[Byte] = null
val v_b: Int = v_a match{
  case CC_B(CC_B(_)) => 0 
  case CC_B(CC_C(_, _, _)) => 1 
  case CC_C((CC_B(_),CC_B(_)), ((_,_),_), _) => 2 
  case CC_C((CC_C(_, _, _),CC_B(_)), ((_,_),_), _) => 3 
}
}