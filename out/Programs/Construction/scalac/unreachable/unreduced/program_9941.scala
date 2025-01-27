package Program_20 

object Test {
sealed trait T_A[A, B]
case class CC_A(a: T_A[T_A[Char, Char], T_A[Int, Byte]], b: T_A[T_A[(Byte,Byte), Char], T_A[Boolean, Boolean]]) extends T_A[((Boolean,Char),T_A[Int, (Char,Char)]), T_A[T_A[Int, Byte], T_A[Boolean, Char]]]
case class CC_B() extends T_A[((Boolean,Char),T_A[Int, (Char,Char)]), T_A[T_A[Int, Byte], T_A[Boolean, Char]]]
case class CC_C() extends T_A[((Boolean,Char),T_A[Int, (Char,Char)]), T_A[T_A[Int, Byte], T_A[Boolean, Char]]]

val v_a: T_A[((Boolean,Char),T_A[Int, (Char,Char)]), T_A[T_A[Int, Byte], T_A[Boolean, Char]]] = null
val v_b: Int = v_a match{
  case CC_A(_, _) => 0 
  case CC_B() => 1 
  case CC_C() => 2 
}
}