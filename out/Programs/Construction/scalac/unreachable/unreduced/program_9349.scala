package Program_30 

object Test {
sealed trait T_A[A, B]
case class CC_A[C]() extends T_A[C, T_A[T_A[Int, Char], T_A[Char, Char]]]
case class CC_B(a: CC_A[Boolean], b: T_A[Char, CC_A[Byte]], c: CC_A[(Char,Boolean)]) extends T_A[CC_A[CC_A[(Int,Byte)]], T_A[T_A[Int, Char], T_A[Char, Char]]]

val v_a: T_A[CC_A[CC_A[(Int,Byte)]], T_A[T_A[Int, Char], T_A[Char, Char]]] = null
val v_b: Int = v_a match{
  case CC_A() => 0 
  case CC_B(_, _, _) => 1 
}
}