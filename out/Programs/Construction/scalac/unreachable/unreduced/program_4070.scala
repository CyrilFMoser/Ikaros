package Program_7 

object Test {
sealed trait T_A[A, B]
case class CC_A[C](a: T_A[C, T_A[C, C]], b: Int) extends T_A[C, T_A[C, C]]
case class CC_B(a: (Int,CC_A[Boolean]), b: T_A[T_A[Byte, (Byte,Byte)], Int], c: Int) extends T_A[CC_A[CC_A[Int]], T_A[CC_A[CC_A[Int]], CC_A[CC_A[Int]]]]
case class CC_C(a: CC_B) extends T_A[CC_A[CC_A[Int]], T_A[CC_A[CC_A[Int]], CC_A[CC_A[Int]]]]

val v_a: T_A[CC_A[CC_A[Int]], T_A[CC_A[CC_A[Int]], CC_A[CC_A[Int]]]] = null
val v_b: Int = v_a match{
  case CC_A(CC_A(_, _), _) => 0 
  case CC_A(CC_B(_, _, _), _) => 1 
  case CC_A(CC_C(CC_B(_, _, _)), _) => 2 
  case CC_B(_, _, _) => 3 
  case CC_C(CC_B((_,_), _, _)) => 4 
}
}