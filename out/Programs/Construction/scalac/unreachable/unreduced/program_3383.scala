package Program_9 

object Test {
sealed trait T_A[A, B]
case class CC_A[C](a: T_A[C, C], b: Boolean, c: (((Boolean,Char),Char),T_A[Int, Int])) extends T_A[Char, C]
case class CC_B[D](a: T_A[Char, D]) extends T_A[Char, D]

val v_a: T_A[Char, Byte] = null
val v_b: Int = v_a match{
  case CC_A(_, _, ((_,_),_)) => 0 
  case CC_B(_) => 1 
}
}