package Program_28 

object Test {
sealed trait T_A[A, B]
sealed trait T_B[C, D]
case class CC_A(a: T_A[T_B[Int, Byte], T_A[Boolean, Int]], b: (Byte,T_A[Byte, Byte]), c: Int) extends T_A[(T_B[Int, (Boolean,Char)],T_A[Boolean, Boolean]), Int]
case class CC_B(a: T_B[Int, T_A[CC_A, CC_A]], b: T_A[T_A[CC_A, CC_A], CC_A], c: (Char,T_A[CC_A, CC_A])) extends T_A[(T_B[Int, (Boolean,Char)],T_A[Boolean, Boolean]), Int]
case class CC_C() extends T_A[(T_B[Int, (Boolean,Char)],T_A[Boolean, Boolean]), Int]

val v_a: T_A[(T_B[Int, (Boolean,Char)],T_A[Boolean, Boolean]), Int] = null
val v_b: Int = v_a match{
  case CC_A(_, (_,_), _) => 0 
  case CC_B(_, _, (_,_)) => 1 
  case CC_C() => 2 
}
}