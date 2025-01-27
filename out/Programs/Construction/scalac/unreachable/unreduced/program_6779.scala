package Program_20 

object Test {
sealed trait T_A[A, B]
case class CC_A[C](a: (Boolean,T_A[Int, (Boolean,Byte)]), b: C) extends T_A[C, T_A[T_A[Char, Boolean], Byte]]
case class CC_B[D](a: D, b: T_A[D, CC_A[D]], c: CC_A[D]) extends T_A[D, T_A[T_A[Char, Boolean], Byte]]

val v_a: T_A[Int, T_A[T_A[Char, Boolean], Byte]] = null
val v_b: Int = v_a match{
  case CC_A(_, _) => 0 
  case CC_B(_, _, CC_A((_,_), 12)) => 1 
  case CC_B(_, _, CC_A((_,_), _)) => 2 
}
}