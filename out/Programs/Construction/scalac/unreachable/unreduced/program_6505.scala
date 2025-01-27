package Program_18 

object Test {
sealed trait T_A[A, B]
sealed trait T_B[C]
case class CC_A[D, E](a: ((Int,Boolean),(Char,(Int,Char)))) extends T_A[Int, D]
case class CC_B(a: T_A[T_A[Int, Char], T_A[Int, Char]], b: T_B[CC_A[Char, Int]], c: T_A[Char, Char]) extends T_A[Int, T_A[Int, T_A[Int, (Byte,Int)]]]
case class CC_C(a: T_B[T_A[CC_B, (Byte,Int)]], b: T_A[CC_B, T_A[Int, (Boolean,Byte)]], c: (T_A[Int, CC_B],T_A[Int, CC_B])) extends T_A[Int, T_A[Int, T_A[Int, (Byte,Int)]]]
case class CC_D(a: Char) extends T_B[T_B[T_A[Int, Byte]]]

val v_a: T_A[Int, T_A[Int, T_A[Int, (Byte,Int)]]] = null
val v_b: Int = v_a match{
  case CC_A(((_,_),(_,_))) => 0 
  case CC_B(_, _, _) => 1 
  case CC_C(_, _, (CC_A(_),CC_A(_))) => 2 
}
}