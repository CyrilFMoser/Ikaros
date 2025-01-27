package Program_1 

object Test {
sealed trait T_A[A, B]
sealed trait T_B[C]
case class CC_A(a: Int) extends T_A[T_B[T_A[Boolean, Char]], T_B[Int]]
case class CC_B(a: T_A[T_A[CC_A, Byte], T_A[Byte, Int]], b: (Boolean,T_A[(Int,Char), CC_A]), c: ((CC_A,Byte),CC_A)) extends T_A[T_B[T_A[Boolean, Char]], T_B[Int]]

val v_a: T_A[T_B[T_A[Boolean, Char]], T_B[Int]] = null
val v_b: Int = v_a match{
  case CC_A(_) => 0 
  case CC_B(_, _, ((_,_),CC_A(_))) => 1 
}
}