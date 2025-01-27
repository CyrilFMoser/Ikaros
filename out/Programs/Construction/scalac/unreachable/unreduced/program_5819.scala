package Program_2 

object Test {
sealed trait T_A[A, B]
case class CC_A[C](a: (T_A[Int, Byte],T_A[Int, Int]), b: T_A[C, C], c: Byte) extends T_A[T_A[Boolean, T_A[Int, Int]], C]
case class CC_B[D](a: (((Int,Boolean),Int),(Byte,Byte)), b: (CC_A[Byte],T_A[Boolean, Boolean])) extends T_A[T_A[Boolean, T_A[Int, Int]], D]
case class CC_C[E]() extends T_A[T_A[Boolean, T_A[Int, Int]], E]

val v_a: T_A[T_A[Boolean, T_A[Int, Int]], Char] = null
val v_b: Int = v_a match{
  case CC_A(_, _, 0) => 0 
  case CC_A(_, _, _) => 1 
  case CC_B(((_,_),(_,_)), _) => 2 
  case CC_C() => 3 
}
}