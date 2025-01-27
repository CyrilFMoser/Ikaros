package Program_16 

object Test {
sealed trait T_A[A, B]
case class CC_A[C](a: C, b: T_A[T_A[C, C], C], c: (T_A[Boolean, (Char,Byte)],T_A[Byte, Char])) extends T_A[T_A[C, C], C]
case class CC_B[D](a: T_A[T_A[D, D], D], b: T_A[T_A[D, D], D], c: Int) extends T_A[T_A[D, D], D]

val v_a: T_A[T_A[Int, Int], Int] = null
val v_b: Int = v_a match{
  case CC_A(_, CC_A(_, _, _), (_,_)) => 0 
  case CC_A(_, CC_B(_, _, _), (_,_)) => 1 
  case CC_B(CC_A(12, CC_A(_, _, _), (_,_)), _, _) => 2 
  case CC_B(CC_A(12, CC_B(_, _, _), (_,_)), _, _) => 3 
  case CC_B(CC_A(_, CC_A(_, _, _), (_,_)), _, _) => 4 
  case CC_B(CC_A(_, CC_B(_, _, _), (_,_)), _, _) => 5 
  case CC_B(CC_B(_, _, _), _, _) => 6 
}
}