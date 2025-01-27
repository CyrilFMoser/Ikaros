package Program_20 

object Test {
sealed trait T_A[A, B]
case class CC_A(a: (Int,T_A[Byte, Int]), b: T_A[T_A[Int, Int], T_A[Int, (Int,Char)]], c: Char) extends T_A[T_A[(Char,Char), Char], T_A[T_A[Byte, Char], Byte]]
case class CC_B() extends T_A[T_A[(Char,Char), Char], T_A[T_A[Byte, Char], Byte]]
case class CC_C(a: T_A[T_A[CC_B, Char], T_A[CC_B, Char]], b: CC_A) extends T_A[T_A[(Char,Char), Char], T_A[T_A[Byte, Char], Byte]]

val v_a: T_A[T_A[(Char,Char), Char], T_A[T_A[Byte, Char], Byte]] = null
val v_b: Int = v_a match{
  case CC_A((_,_), _, _) => 0 
  case CC_B() => 1 
  case CC_C(_, CC_A(_, _, _)) => 2 
}
}