package Program_11 

object Test {
sealed trait T_A[A, B]
case class CC_A(a: T_A[T_A[Char, Boolean], T_A[Byte, (Boolean,Int)]], b: T_A[T_A[Byte, Byte], Int]) extends T_A[(T_A[Boolean, (Byte,Boolean)],T_A[Byte, Byte]), T_A[T_A[Byte, (Byte,Int)], T_A[Char, Char]]]
case class CC_B(a: CC_A) extends T_A[(T_A[Boolean, (Byte,Boolean)],T_A[Byte, Byte]), T_A[T_A[Byte, (Byte,Int)], T_A[Char, Char]]]

val v_a: T_A[(T_A[Boolean, (Byte,Boolean)],T_A[Byte, Byte]), T_A[T_A[Byte, (Byte,Int)], T_A[Char, Char]]] = null
val v_b: Int = v_a match{
  case CC_A(_, _) => 0 
  case CC_B(_) => 1 
}
}