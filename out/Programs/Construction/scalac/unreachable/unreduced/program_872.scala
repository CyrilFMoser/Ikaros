package Program_1 

object Test {
sealed trait T_A[A, B]
case class CC_A(a: T_A[T_A[Char, Int], Boolean], b: Char) extends T_A[T_A[Char, T_A[(Byte,Int), Byte]], T_A[T_A[Byte, Boolean], T_A[Char, Boolean]]]
case class CC_B() extends T_A[T_A[Char, T_A[(Byte,Int), Byte]], T_A[T_A[Byte, Boolean], T_A[Char, Boolean]]]

val v_a: T_A[T_A[Char, T_A[(Byte,Int), Byte]], T_A[T_A[Byte, Boolean], T_A[Char, Boolean]]] = null
val v_b: Int = v_a match{
  case CC_A(_, _) => 0 
  case CC_B() => 1 
}
}