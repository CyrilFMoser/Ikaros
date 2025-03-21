package Program_5 

object Test {
sealed trait T_A[A, B]
case class CC_A[C](a: Char) extends T_A[C, T_A[T_A[Byte, Boolean], T_A[Int, Int]]]
case class CC_B[D](a: CC_A[D], b: (Boolean,T_A[Int, (Byte,Int)])) extends T_A[D, T_A[T_A[Byte, Boolean], T_A[Int, Int]]]

val v_a: T_A[Boolean, T_A[T_A[Byte, Boolean], T_A[Int, Int]]] = null
val v_b: Int = v_a match{
  case CC_A(_) => 0 
  case CC_B(_, (true,_)) => 1 
  case CC_B(_, (false,_)) => 2 
}
}