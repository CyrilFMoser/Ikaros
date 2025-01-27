package Program_23 

object Test {
sealed trait T_A[A, B]
case class CC_A(a: T_A[T_A[Char, (Int,Boolean)], T_A[Char, Byte]], b: T_A[T_A[Int, Char], Char], c: Char) extends T_A[T_A[T_A[Byte, Byte], (Byte,Char)], T_A[(Char,Byte), T_A[Int, Boolean]]]
case class CC_B() extends T_A[T_A[T_A[Byte, Byte], (Byte,Char)], T_A[(Char,Byte), T_A[Int, Boolean]]]

val v_a: T_A[T_A[T_A[Byte, Byte], (Byte,Char)], T_A[(Char,Byte), T_A[Int, Boolean]]] = null
val v_b: Int = v_a match{
  case CC_A(_, _, _) => 0 
  case CC_B() => 1 
}
}