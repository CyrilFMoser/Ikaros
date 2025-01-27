package Program_27 

object Test {
sealed trait T_A[A, B]
case class CC_A[C](a: (Byte,Int)) extends T_A[T_A[(Char,Int), T_A[Int, Boolean]], C]
case class CC_B[D](a: CC_A[D], b: (CC_A[Char],T_A[(Boolean,Int), Byte]), c: D) extends T_A[T_A[(Char,Int), T_A[Int, Boolean]], D]

val v_a: T_A[T_A[(Char,Int), T_A[Int, Boolean]], Int] = null
val v_b: Int = v_a match{
  case CC_A((_,_)) => 0 
  case CC_B(_, (CC_A(_),_), _) => 1 
}
}