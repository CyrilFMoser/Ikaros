package Program_12 

object Test {
sealed trait T_A[A, B]
case class CC_A(a: T_A[(Int,Boolean), T_A[Char, Int]], b: T_A[T_A[Int, Boolean], T_A[(Byte,Boolean), Char]], c: (Boolean,T_A[Int, Boolean])) extends T_A[T_A[Byte, T_A[Byte, Char]], T_A[T_A[Byte, Boolean], T_A[Char, Int]]]
case class CC_B(a: (T_A[CC_A, CC_A],Byte), b: Byte, c: CC_A) extends T_A[T_A[Byte, T_A[Byte, Char]], T_A[T_A[Byte, Boolean], T_A[Char, Int]]]

val v_a: T_A[T_A[Byte, T_A[Byte, Char]], T_A[T_A[Byte, Boolean], T_A[Char, Int]]] = null
val v_b: Int = v_a match{
  case CC_A(_, _, _) => 0 
  case CC_B(_, _, _) => 1 
}
}