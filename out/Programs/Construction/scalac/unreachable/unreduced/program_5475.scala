package Program_12 

object Test {
sealed trait T_A[A, B]
case class CC_A[C](a: T_A[C, C]) extends T_A[Int, C]
case class CC_B[D](a: Boolean, b: (T_A[Int, Boolean],Byte), c: T_A[Int, Byte]) extends T_A[Int, D]

val v_a: T_A[Int, Char] = null
val v_b: Int = v_a match{
  case CC_A(_) => 0 
  case CC_B(_, (CC_A(_),0), CC_A(_)) => 1 
  case CC_B(_, (CC_A(_),0), CC_B(_, (_,_), CC_A(_))) => 2 
  case CC_B(_, (CC_A(_),0), CC_B(_, (_,_), CC_B(_, _, _))) => 3 
  case CC_B(_, (CC_A(_),_), CC_A(_)) => 4 
  case CC_B(_, (CC_A(_),_), CC_B(_, (_,_), CC_A(_))) => 5 
  case CC_B(_, (CC_A(_),_), CC_B(_, (_,_), CC_B(_, _, _))) => 6 
  case CC_B(_, (CC_B(_, _, _),0), CC_A(_)) => 7 
  case CC_B(_, (CC_B(_, _, _),0), CC_B(_, (_,_), CC_A(_))) => 8 
  case CC_B(_, (CC_B(_, _, _),0), CC_B(_, (_,_), CC_B(_, _, _))) => 9 
  case CC_B(_, (CC_B(_, _, _),_), CC_A(_)) => 10 
  case CC_B(_, (CC_B(_, _, _),_), CC_B(_, (_,_), CC_A(_))) => 11 
  case CC_B(_, (CC_B(_, _, _),_), CC_B(_, (_,_), CC_B(_, _, _))) => 12 
}
}