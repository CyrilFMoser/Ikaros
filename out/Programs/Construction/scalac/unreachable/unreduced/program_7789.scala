package Program_12 

object Test {
sealed trait T_A[A, B]
case class CC_A[C](a: T_A[C, T_A[C, Byte]]) extends T_A[C, T_A[C, Byte]]
case class CC_B[D](a: (Int,T_A[Int, Boolean]), b: T_A[(Int,Byte), T_A[(Int,Byte), Byte]], c: Byte) extends T_A[D, T_A[D, Byte]]

val v_a: T_A[Char, T_A[Char, Byte]] = null
val v_b: Int = v_a match{
  case CC_A(CC_A(_)) => 0 
  case CC_A(CC_B(_, CC_A(_), _)) => 1 
  case CC_A(CC_B(_, CC_B(_, _, _), _)) => 2 
  case CC_B((_,_), CC_A(CC_A(_)), _) => 3 
  case CC_B((_,_), CC_A(CC_B(_, _, _)), _) => 4 
  case CC_B((_,_), CC_B(_, _, _), _) => 5 
}
}