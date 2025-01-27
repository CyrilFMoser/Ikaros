package Program_25 

object Test {
sealed trait T_A[A, B]
case class CC_A[C](a: T_A[C, C], b: T_A[C, C], c: T_A[C, C]) extends T_A[C, T_A[T_A[Char, Boolean], Byte]]
case class CC_B() extends T_A[CC_A[T_A[Byte, Int]], T_A[T_A[Char, Boolean], Byte]]
case class CC_C(a: T_A[T_A[CC_B, CC_B], CC_A[(Int,Char)]], b: (CC_A[CC_B],CC_A[CC_B]), c: T_A[CC_A[Boolean], CC_A[CC_B]]) extends T_A[CC_A[T_A[Byte, Int]], T_A[T_A[Char, Boolean], Byte]]

val v_a: T_A[CC_A[T_A[Byte, Int]], T_A[T_A[Char, Boolean], Byte]] = null
val v_b: Int = v_a match{
  case CC_A(_, _, _) => 0 
  case CC_B() => 1 
  case CC_C(_, (_,_), _) => 2 
}
}