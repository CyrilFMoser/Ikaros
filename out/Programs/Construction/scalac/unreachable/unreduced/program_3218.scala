package Program_2 

object Test {
sealed trait T_A[A, B]
case class CC_A[C](a: T_A[Char, C], b: T_A[Char, C], c: C) extends T_A[Char, C]
case class CC_B(a: CC_A[CC_A[(Char,Int)]], b: T_A[T_A[Char, Boolean], CC_A[Char]]) extends T_A[Char, (T_A[Byte, (Char,Int)],T_A[Int, Char])]
case class CC_C(a: (CC_A[Int],(Boolean,CC_B)), b: T_A[T_A[(Int,Char), CC_B], CC_A[CC_B]], c: Byte) extends T_A[Char, (T_A[Byte, (Char,Int)],T_A[Int, Char])]

val v_a: T_A[Char, (T_A[Byte, (Char,Int)],T_A[Int, Char])] = null
val v_b: Int = v_a match{
  case CC_A(_, _, _) => 0 
  case CC_B(_, _) => 1 
}
}
// This is not matched: CC_C(_, _, _)