package Program_16 

object Test {
sealed trait T_A[A, B]
case class CC_A[C](a: T_A[C, C], b: (((Boolean,Char),Char),T_A[Boolean, Boolean]), c: Int) extends T_A[C, T_A[C, C]]
case class CC_B[D](a: T_A[CC_A[CC_A[Char]], T_A[CC_A[CC_A[Char]], CC_A[CC_A[Char]]]], b: T_A[D, T_A[D, D]], c: (T_A[Boolean, Int],(Byte,Byte))) extends T_A[D, T_A[D, D]]

val v_a: T_A[Boolean, T_A[Boolean, Boolean]] = null
val v_b: Int = v_a match{
  case CC_A(_, (_,_), _) => 0 
  case CC_B(_, _, _) => 1 
}
}